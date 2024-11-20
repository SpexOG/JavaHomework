package com.itschool.jpa;

import com.itschool.jpa.dtos.AddressDto;
import com.itschool.jpa.dtos.CreateUserDto;
import com.itschool.jpa.exceptions.UserServiceException;
import com.itschool.jpa.models.Address;
import com.itschool.jpa.models.Order;
import com.itschool.jpa.models.User;
import com.itschool.jpa.repositories.UserJpaRepository;
import com.itschool.jpa.services.EmailService;
import com.itschool.jpa.services.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class UserServiceIntegrationTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private EmailService emailService;

    private User testUser;

    @BeforeEach
    void setUp() throws Exception {
        userJpaRepository.deleteAll();

        User u = new User();
        u.setName("John Doe");
        u.setUsername("johndoe");
        u.setEmail("johndoe@example.com");
        u.setAge(25);
        u.setRegistrationDate(LocalDate.now());
        u.setActive(true);

        Address address = new Address();
        address.setCity("Cluj-Napoca");
        address.setStreet("Unirii");
        address.setCountry("Romania");
        address.setNumberOfStreet(10);
        u.setAddress(address);

        testUser = userService.addUser(u);
    }

    @Test
    void saveAll_ShouldSaveMultipleUsers() {
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

        Iterable<User> savedUsers = userService.saveAll(Arrays.asList(user1, user2));

        assertNotNull(savedUsers);
        long count = userJpaRepository.count();
        assertEquals(3, count); // 1 din setUp() + 2 noi
    }

    @Test
    void findAllUsers_ShouldReturnAllUsers() {
        Iterable<User> users = userService.findAllUsers();
        assertNotNull(users);
        long count = userService.findAllUsers().spliterator().getExactSizeIfKnown();
        assertTrue(count >= 1);
    }

    @Test
    void deleteUser_ShouldRemoveUser() {
        userService.deleteUser(testUser.getId());
        Optional<User> deletedUser = userJpaRepository.findById(testUser.getId());
        assertFalse(deletedUser.isPresent());
    }

    @Test
    void findUserByUsername_ShouldReturnUser() {
        Optional<User> userOpt = userService.findUserByUsername("johndoe");
        assertTrue(userOpt.isPresent());
        User user = userOpt.get();
        assertEquals("John Doe", user.getName());
    }

    @Test
    void addUser_ShouldCreateUser() {
        User user = new User();
        user.setName("Charlie");
        user.setUsername("charlie");
        user.setEmail("charlie@example.com");
        user.setAge(22);
        user.setRegistrationDate(LocalDate.now());
        user.setActive(true);

        User savedUser = userService.addUser(user);

        assertNotNull(savedUser);
        assertNotNull(savedUser.getId());
        assertEquals("Charlie", savedUser.getName());
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

        Address address = new Address();
        address.setCity("Bucharest");
        address.setStreet("Victoriei");
        address.setCountry("Romania");
        address.setNumberOfStreet(20);
        userDto.setAddress(objectMapper.convertValue(address, AddressDto.class));

        Order order1 = new Order("Product A", 50.0, LocalDate.now(), null);
        Order order2 = new Order("Product B", 75.0, LocalDate.now(), null);
        userDto.setOrders(Arrays.asList(order1, order2));

        User createdUser = userService.createUserFromDto(userDto);

        assertNotNull(createdUser);
        assertNotNull(createdUser.getId());
        assertEquals("Diana", createdUser.getName());
        assertEquals(2, createdUser.getOrders().size());

        Mockito.verify(emailService, Mockito.times(1))
                .sendEmail(Mockito.eq("diana@example.com"), Mockito.anyString(), Mockito.anyString());
    }

    @Test
    void createUserFromDto_ShouldThrowException_WhenEmailFails() throws Exception {
        Mockito.doThrow(new RuntimeException("Email server not reachable"))
                .when(emailService).sendEmail(anyString(), Mockito.anyString(), Mockito.anyString());

        CreateUserDto userDto = new CreateUserDto();
        userDto.setName("Eve");
        userDto.setAge(29);
        userDto.setRegistrationDate(LocalDate.now());
        userDto.setEmail("eve@example.com");
        userDto.setUsername("eve");
        userDto.setActive(true);

        Address address = new Address();
        address.setCity("Iasi");
        address.setStreet("Copou");
        address.setCountry("Romania");
        address.setNumberOfStreet(15);
        userDto.setAddress(objectMapper.convertValue(address, AddressDto.class));

        Order order = new Order("Product C", 120.0, LocalDate.now(), null);
        userDto.setOrders(Arrays.asList(order));

        UserServiceException exception = assertThrows(UserServiceException.class, () -> {
            userService.createUserFromDto(userDto);
        });

        assertEquals("User created successfully, but failed to send welcome email!", exception.getMessage());
        assertEquals("ERROR_ON_MAIL_SENDING", exception.getErrorCode());
    }
}
