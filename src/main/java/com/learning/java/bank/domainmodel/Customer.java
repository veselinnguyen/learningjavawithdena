package com.learning.java.bank.domainmodel;

import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends Person{
    private Address address;
    private Date registrationDate;
    private CustomerType type;

    @Override
    public String toString() {
        return "Customer{" +
                "address=" + address.getStreetName() +
                ", registrationDate=" + registrationDate +
                ", type=" + type +
                '}';
    }

    @Override
    public void speak() {
        System.out.println("Type: Customer");
    }
}
