package com.learning.java.bank.database;

import com.learning.java.bank.domainmodel.Address;
import com.learning.java.bank.domainmodel.AddressType;
import com.learning.java.bank.domainmodel.Customer;
import com.learning.java.bank.domainmodel.CustomerType;

import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<Customer> customers = new ArrayList<>();

    public Database() {
        Address address1 = new Address("Street", "1053JT", 29, AddressType.HOME_ADDRESS);
        Customer john = new Customer("John", "john@gmail.com", 15, address1, Date.from(Instant.now()), CustomerType.PRVT);
        customers.add(john);

        Address address2 = new Address("Street", "1053JT", 29, AddressType.HOME_ADDRESS);
        Customer jaap = new Customer("Jaap", "jaap@gmail.com", 30, address2, Date.from(Instant.now()), CustomerType.PRVT);
        customers.add(jaap);

        Address address3 = new Address("Street", "1053JT", 29, AddressType.HOME_ADDRESS);
        Customer falco = new Customer("Falco", "falco@gmail.com", 70, address3, Date.from(Instant.now()), CustomerType.BSN);
        customers.add(falco);
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
