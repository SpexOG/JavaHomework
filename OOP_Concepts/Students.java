package OOP_Concepts;

import java.time.LocalDate;

public class Students {

    //Atribute
    String firstName, lastName, sex, address;
    int age;
    long CNP;
    LocalDate dateOfBirth;

    //Constructor
    public Students(String firstName, String lastName, String sex, int age, LocalDate dateOfBirth, long CNP, String address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.CNP = CNP;
        this.address = address;

    }

    //Metoda
    public void studentDetails() {

        System.out.println("Prenume: " + firstName);
        System.out.println("Nume: " + lastName);
        System.out.println("Sex: " + sex);
        System.out.println("Varsta: " + age);
        System.out.println("Locul nasterii: " + dateOfBirth);
        System.out.println("CNP: " + CNP);
        System.out.println("Adresa: " + address);

    }

}
