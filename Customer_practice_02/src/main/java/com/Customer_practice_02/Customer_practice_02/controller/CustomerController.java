package com.Customer_practice_02.Customer_practice_02.controller;

import com.Customer_practice_02.Customer_practice_02.dto.CustomerDTO;
import com.Customer_practice_02.Customer_practice_02.dto.CustomerUpdateDTO;
import com.Customer_practice_02.Customer_practice_02.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin

public class CustomerController {
@Autowired
private CustomerService customerService;
    @PostMapping("/customerSave")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO)
    {
        customerService.saveCustomer(customerDTO);
        return "saved details" ;
    }
    @PutMapping("/customerUpdate")
    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO)
    {
customerService.updateCustomer(customerUpdateDTO);
        return "updated";
    }
    @GetMapping(
            path = "/getCustomer",
            params = "id"
    )
    public CustomerDTO getCustomerDetails(@RequestParam (value = "id") int customer_id)
    {
        CustomerDTO customerDTO=customerService.getCustomerDetails(customer_id);
        return customerDTO;
    }
    @DeleteMapping(
            path = "/deleteCustomer",
            params="id"
    )
    public String deleteCustomer(@RequestParam(value = "id") int customer_id)
    {
        String deleteMessage=customerService.deleteCustomer(customer_id);
        return deleteMessage;
    }
}
