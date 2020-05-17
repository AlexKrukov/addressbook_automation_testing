package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String homePhone;
    private final String emailOne;
    private String group;

    public ContactData(String firstName, String lastName, String homePhone, String emailOne, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homePhone = homePhone;
        this.emailOne = emailOne;
        this.group = group;
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

    public String getGroup() {
        return group;
    }
}