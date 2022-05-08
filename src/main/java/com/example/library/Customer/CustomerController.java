package com.example.library.Customer;

import com.example.library.Category.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @PostMapping()
    public  Customer addCustomer(@RequestBody Customer customer)
    { return  customerService.insertCustomer(customer);}

    @PutMapping
    public Customer updateCustomer(@RequestBody  Customer customerUpdated)
    {return customerService.updateCustomer(customerUpdated);}

    @DeleteMapping(path="{id}")
    public void deleteCustomer(@PathVariable Integer id)
    { customerService.deleteCustomerByID(id);}


}
