package org.example._2024_06_14;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Customer {
    private String firstName;
    private String lastName;
    private Address address;
}

@AllArgsConstructor
class Address {
    private String street;
    private City city;
}

@AllArgsConstructor
class City {
    private String cityName;
    private State state;
}

@AllArgsConstructor
class State {
    private String name;
}

class AddressBook {
    public List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        if(customer == null) {
            throw new NullPointerException("Customer is null");
        }

        customers.add(customer);
    }
}