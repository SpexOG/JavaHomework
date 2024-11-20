package com.itschool.jpa;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itschool.jpa.dtos.AddressDto;
import com.itschool.jpa.dtos.CreateUserDto;
import com.itschool.jpa.models.Order;
import com.itschool.jpa.models.User;
import com.itschool.jpa.repositories.UserJpaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.anyString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class UserControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private com.itschool.jpa.services.EmailService emailService;

    private User testUser;

    @BeforeEach
    void setUp() throws Exception {
        userJpaRepository.deleteAll();

        User u = new User();
        u.setName("Jane Doe");
        u.setUsername("janedoe");
        u.setEmail("janedoe@example.com");
        u.setAge(26);
        u.setRegistrationDate(LocalDate.now());
        u.setActive(true);

        com.itschool.jpa.models.Address address = new com.itschool.jpa.models.Address();
        address.setCity("Timisoara");
        address.setStreet("Libertatii");
        address.setCountry("Romania");
        address.setNumberOfStreet(5);
        u.setAddress(address);

        testUser = userJpaRepository.save(u);
    }

    @Test
    void createUsers_ShouldCreateMultipleUsers() throws Exception {
        User user1 = new User();
        user1.setName("Alice");
        user1.setUsername("alice");
        user1.setEmail("alice@example.com");
        user1.setAge(30);
        user1.setRegistrationDate(LocalDate.now());
        user1.setActive(true);

        User user2 = new User();
        user2.setName("Bob");
        user2.setUsername("bob");
        user2.setEmail("bob@example.com");
        user2.setAge(28);
        user2.setRegistrationDate(LocalDate.now());
        user2.setActive(false);

        mockMvc.perform(post("/users/all")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(Arrays.asList(user1, user2))))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].name").value("Alice"))
                .andExpect(jsonPath("$[1].name").value("Bob"));

        long count = userJpaRepository.count();
        assert(count == 3); // 1 din setUp() + 2 noi
    }

    @Test
    void getAllUsers_ShouldReturnAllUsers() throws Exception {
        mockMvc.perform(get("/users")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].username").value("janedoe"));
    }

    @Test
    void deleteUser_ShouldRemoveUser() throws Exception {
        mockMvc.perform(delete("/users/{id}", testUser.getId()))
                .andExpect(status().isNoContent());

        Optional<User> deletedUser = userJpaRepository.findById(testUser.getId());
        assertFalse(deletedUser.isPresent());
    }

    @Test
    void findByUsername_ShouldReturnUser() throws Exception {
        mockMvc.perform(get("/users/{username}", "janedoe")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.email").value("janedoe@example.com"));
    }

    @Test
    void findByUsername_ShouldReturnNotFound_WhenUserDoesNotExist() throws Exception {
        mockMvc.perform(get("/users/{username}", "nonexistentuser")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test
    void addUser_ShouldCreateUser() throws Exception {
        User newUser = new User();
        newUser.setName("Charlie");
        newUser.setUsername("charlie");
        newUser.setEmail("charlie@example.com");
        newUser.setAge(22);
        newUser.setRegistrationDate(LocalDate.now());
        newUser.setActive(true);

        com.itschool.jpa.models.Address address = new com.itschool.jpa.models.Address();
        address.setCity("Brasov");
        address.setStreet("Sfantul Gheorghe");
        address.setCountry("Romania");
        address.setNumberOfStreet(12);
        newUser.setAddress(address);

        mockMvc.perform(post("/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(newUser)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Charlie"))
                .andExpect(jsonPath("$.username").value("charlie"));

        long count = userJpaRepository.count();
        assert(count == 2);
    }

    @Test
    void createUserFromDto_ShouldCreateUserAndSendEmail() throws Exception {
        Mockito.doNothing().when(emailService).sendEmail(anyString(), Mockito.anyString(), Mockito.anyString());

        CreateUserDto userDto = new CreateUserDto();
        userDto.setName("Diana");
        userDto.setAge(27);
        userDto.setRegistrationDate(LocalDate.now());
        userDto.setEmail("diana@example.com");
        userDto.setUsername("diana");
        userDto.setActive(true);

        AddressDto addressDto = new AddressDto();
        addressDto.setCity("Sibiu");
        addressDto.setStreet("Mica");
        addressDto.setCountry("Romania");
        addressDto.setNumberOfStreet(8);
        userDto.setAddress(addressDto);

        Order order1 = new Order("Product X", 60.0, LocalDate.now(), null);
        Order order2 = new Order("Product Y", 80.0, LocalDate.now(), null);
        userDto.setOrders(Arrays.asList(order1, order2));

        mockMvc.perform(post("/users/create-from-dto")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(userDto)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Diana"))
                .andExpect(jsonPath("$.orders", hasSize(2)));

        long count = userJpaRepository.count();
        assert(count == 2);

        Mockito.verify(emailService, Mockito.times(1))
                .sendEmail(Mockito.eq("diana@example.com"), Mockito.anyString(), Mockito.anyString());
    }

    @Test
    void createUserFromDto_ShouldHandleEmailFailure() throws Exception {
        Mockito.doThrow(new RuntimeException("Email server down"))
                .when(emailService).sendEmail(anyString(), Mockito.anyString(), Mockito.anyString());

        CreateUserDto userDto = new CreateUserDto();
        userDto.setName("Eve");
        userDto.setAge(29);
        userDto.setRegistrationDate(LocalDate.now());
        userDto.setEmail("eve@example.com");
        userDto.setUsername("eve");
        userDto.setActive(true);

        AddressDto addressDto = new AddressDto();
        addressDto.setCity("Oradea");
        addressDto.setStreet("Republicii");
        addressDto.setCountry("Romania");
        addressDto.setNumberOfStreet(7);
        userDto.setAddress(addressDto);

        Order order = new Order("Product Z", 100.0, LocalDate.now(), null);
        userDto.setOrders(Arrays.asList(order));

        mockMvc.perform(post("/users/create-from-dto")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(userDto)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Eve"))
                .andExpect(jsonPath("$.orders", hasSize(1)));

        long count = userJpaRepository.count();
        assert(count == 2);

        Mockito.verify(emailService, Mockito.times(1))
                .sendEmail(Mockito.eq("eve@example.com"), Mockito.anyString(), Mockito.anyString());
    }
}
