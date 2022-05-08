package com.example.library.Customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {
private final CustomerRepository customerRepository;

    public Customer insertCustomer(Customer customer)
    {return  customerRepository.save(customer);}

    public Customer updateCustomer(Customer customerUpdated)
    {return customerRepository.save(customerUpdated);}

    public void deleteCustomerByID(Integer id)
    {customerRepository.deleteById(id);}

    public Customer getCustomerByEmail(String email)
    { return customerRepository.findByEmailIgnoreCase(email);}

    public List<Customer> getCustomerByFirstName(String firstName)
    { return  customerRepository.findByFirstNameIgnoreCase(firstName);}


    public Optional<Customer> getCustomerById(Integer id)
    {return customerRepository.findById(id);}

    public List<Customer> getAllCustomers()
    { return customerRepository.findAll();
    }


}
