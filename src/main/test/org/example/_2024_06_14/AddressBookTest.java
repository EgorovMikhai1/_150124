package org.example._2024_06_14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

//    public Customer createCustomer() {
//        State state = new State("State");
//        City city = new City("City", state);
//        Address address = new Address("Address", city);
//        Customer customer = new Customer("Alex", "Fitness", address);
//        return customer;
//    }


    @Test
    void addCustomer() {
        Customer customer = Mockito.mock(Customer.class);
        AddressBook addressBook = new AddressBook();
        addressBook.addCustomer(customer);
        Assertions.assertEquals(1, addressBook.customers.size());
    }
}