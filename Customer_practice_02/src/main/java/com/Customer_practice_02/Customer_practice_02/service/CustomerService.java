package com.Customer_practice_02.Customer_practice_02.service;

import com.Customer_practice_02.Customer_practice_02.dto.CustomerDTO;
import com.Customer_practice_02.Customer_practice_02.dto.CustomerUpdateDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface CustomerService {
    public String saveCustomer( CustomerDTO customerDTO);
    public String updateCustomer( CustomerUpdateDTO customerUpdateDTO);
    public CustomerDTO getCustomerDetails(int customer_id);
    public String deleteCustomer(int customer_id);
}
