package com.learning.java.bank.controller;

import com.learning.java.bank.domainmodel.Customer;
import com.learning.java.bank.service.CustomerService;
import java.util.UUID;

public class CustomerController {

        private CustomerService service;

    //Get
    public void  retrieveCustomer () {
       //IMP

        UUID customerUUID = UUID.randomUUID();
        Customer customer = service.getCustomerByUUID(customerUUID);

    }
    //post
    public void  createCustomer () {

        Object customer = new Object();
        service.createCustomer(customer);

    }
    //put
    public void  editCustomer () {

        UUID customerUUID = UUID.randomUUID();
        //String name = new String("Dena");
        String name = "Dena";
        service.editCustomerName(customerUUID, name);
    }
    //Delete
    public void  deleteCustomer () {

        UUID customerUUID = UUID.randomUUID();
        service.deleteCustomerByUUID(customerUUID);
    }
}
