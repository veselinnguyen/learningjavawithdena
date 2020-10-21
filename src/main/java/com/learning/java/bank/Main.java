package com.learning.java.bank;

import com.learning.java.bank.database.Database;
import com.learning.java.bank.domainmodel.Customer;
import org.springframework.beans.MutablePropertyValues;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();

        //Basic FOR iteration.
        List<Customer> customers = database.getCustomers();
        for (Customer customer : customers) {
            System.out.println("Customer name: " + customer.getName());
        }
        System.out.println("-----------------------------");

        //Iterate
        customers.forEach(System.out::println);

        //Filter - predicate
        Predicate<? super Customer> isRetired = customer -> customer.getAge() > 65;
        List<Customer> retiredCustomers = customers.stream()
                .filter(isRetired).collect(Collectors.toList());
        System.out.println("Numbers of retired customers:" + retiredCustomers.size());

        //Modify
        //TODO: Modify specific customer based on predicate! stream().filter().map().collect();
        //Predicate <? super Customer> startWithD = customer -> customer.getName() > [[[[how to define this filter]]];
        /*List<Customer> dCustomer =
                .stream()
                .filter(s -> s.startsWith("d"))
                .map(String::toUpperCase)
                .sorted()
                .collect()
                .forEach(System.out::println);
                */

        //Group them by age
        //.groupingBy(p -> p.age)

        //Import and use 3rd Party Libraries ex. Lombok
    }
}
