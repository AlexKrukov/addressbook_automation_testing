package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String homePhone;
    private final String emailOne;

    public ContactData(String firstName, String lastName, String homePhone, String emailOne) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homePhone = homePhone;
        this.emailOne = emailOne;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getEmailOne() {
        return emailOne;
    }
}