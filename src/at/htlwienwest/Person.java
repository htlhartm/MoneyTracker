package at.htlwienwest;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate bithday;
    private String address;

    public Person(String firstName, String lastName, LocalDate bithday, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bithday = bithday;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBithday() {
        return bithday;
    }

    public String getAddress() {
        return address;
    }
}
