package org.example;

public class Customer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String customerId = "";
    String name = "";

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String email = "";

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String phoneNumber = "";
    public Customer() {
        String customerId = "";
        String name = "";
        String email = "";
        String phoneNumber = "";
    }

    public void setInfo(String ID, String Name, String Email, String Phone) {
        String customerId = ID;
        String name = Name;
        String email = Email;
        String phoneNumber = Phone;
    }

}
