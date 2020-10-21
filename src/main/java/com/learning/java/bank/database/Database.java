package com.learning.java.bank.database;

import com.learning.java.bank.domainmodel.*;

import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<Customer> customers = new ArrayList<>();

    public Database() {

        //Create Customer Object by using the lombok Builder of Customer. Do not usee constructors!
        //new Person("John", "john@gmail.com", 15);
        //Person.builder().age(30).name("John").email("email").build();

        Address address1 = new Address("Street", "1053JT", 29, AddressType.HOME_ADDRESS);
        Customer john = new Customer("John", "john@gmail.com", 15, address1, Date.from(Instant.now()), CustomerType.PRVT);
        customers.add(john);

        Address address2 = new Address("Street", "1053JT", 29, AddressType.HOME_ADDRESS);
        Customer jaap = new Customer("Jaap", "jaap@gmail.com", 30, address2, Date.from(Instant.now()), CustomerType.PRVT);
        customers.add(jaap);

        Address address3 = new Address("Street", "1053JT", 29, AddressType.HOME_ADDRESS);
        Customer falco = new Customer("Falco", "falco@gmail.com", 70, address3, Date.from(Instant.now()), CustomerType.BSN);
        customers.add(falco);

        Address address4 = new Address("Street2", "1053BBT", 45, AddressType.WORK_ADDRESS);
        Customer dena = new Customer("dena", "dena@gmail.com", 33, address4, Date.from(Instant.now()), CustomerType.PRVT);
        customers.add(dena);
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
