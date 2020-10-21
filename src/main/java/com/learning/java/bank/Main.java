package com.learning.java.bank;

import com.learning.java.bank.database.Database;
import com.learning.java.bank.domainmodel.Customer;
import com.learning.java.bank.domainmodel.CustomerType;
import com.learning.java.bank.domainmodel.Person;
import org.springframework.beans.MutablePropertyValues;

import java.util.List;
import java.util.Map;
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

        /**
         * Modify
         * Usecases:
         * - Transition between API"s / Consumers
         * bol.bg -> ING (Username\ Passowrd\ Products\ Blabla bla)
         * ING -> GOT (We use a MAP to limit the data of the incoming request which we need to forward)
         *
         * - Transfer between API and Database
         * Usere wants to register in bol.bg he seends requestData(A, B, C, D, E)
         * the database reequiired only A, B, C and D and E aree used just for authentication/authorization.
         *
         * Functional example:
         * createCustomer.andThen(saveItInTheDatabase).apply(payload);
         *
         * Tradition Java 7:
         * user = ccreateUser(payload)'
         * craeteObjeectForTheDB = createObject(user);
         * saveUseere(craeteObjeectForTheDB)
         */
        Predicate <? super Customer> startWithD = c -> c.getName().startsWith("d");
        List<Customer> dCustomer = customers.stream()
                .filter(startWithD)
                .map(c -> {
                    c.setName(c.getName().toUpperCase());
                    return c;
                })
                .collect(Collectors.toList());

        dCustomer.forEach(customer -> {
            System.out.println("Name: " + customer.getName());
        });


        //Group them by age
        //.groupingBy(p -> p.age)
        /*
        | KEY           | VALUE          |
        | PRVT | List<Customer> |
        | BSN | List<Customer> |

        LIST: VAL1 | VAL2 .... | VALN
        */

        Map<CustomerType, List<Customer>> customersByType = customers.stream()
                .collect(Collectors.groupingBy(Customer::getType));
        //personsByAge
        //        .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

        //Import and use 3rd Party Libraries ex. Lombok

        /**
         * Involke Extention Override method -> Customer
         * Invoke Implementation Override method -> Person
         */
        customers.get(0).speak();
        new Person().speak();
    }
}
