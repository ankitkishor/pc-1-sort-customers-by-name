package com.jap.customers;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {

    // This method will return the names of the customers in sorted alphabetical order.
    public List<String> getListOfCustomersSortedByName(List<Customer> customerList) {
        List<String> list = new ArrayList<>();
        Customer customer = new Customer();
        Collections.sort(customerList);
        for (Customer customer1 : customerList) {
            list.add(customer1.getCustomerName());
        }
//  return list.add(customer.getCustomerName());
        return list;
    }
}