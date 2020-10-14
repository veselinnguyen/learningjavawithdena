package com.learning.java.bank.domainmodel;

import java.util.Date;

public class Customer extends Person{

    private Address address;
    private Date registrationDate;
    private CustomerType type;

    public Customer() {
    }

    public Customer(String name,
                    String email,
                    int age,
                    Address address,
                    Date registrationDate,
                    CustomerType type) {

        super(name, email, age);
        this.address = address;
        this.registrationDate = registrationDate;
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address=" + address.getStreetName() +
                ", registrationDate=" + registrationDate +
                ", type=" + type +
                '}';
    }
}
