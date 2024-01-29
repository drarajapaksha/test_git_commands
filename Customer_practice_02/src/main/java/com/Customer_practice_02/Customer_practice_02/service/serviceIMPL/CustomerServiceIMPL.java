package com.Customer_practice_02.Customer_practice_02.service.serviceIMPL;

import com.Customer_practice_02.Customer_practice_02.dto.CustomerDTO;
import com.Customer_practice_02.Customer_practice_02.dto.CustomerUpdateDTO;
import com.Customer_practice_02.Customer_practice_02.entity.Customer;
import com.Customer_practice_02.Customer_practice_02.repo.CustomerRepo;
import com.Customer_practice_02.Customer_practice_02.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        System.out.println(customerDTO.getCustomer_name());
        Customer customer=new Customer(
                customerDTO.getCustomer_id(),
                customerDTO.getCustomer_name(),
                customerDTO.getCustomer_address(),
                customerDTO.getContact(),
                customerDTO.isActive()
        );
        customerRepo.save(customer);
        return customerDTO.getCustomer_name();

    }

    @Override
    public String updateCustomer(CustomerUpdateDTO customerUpdateDTO) {
        if(customerRepo.existsById(customerUpdateDTO.getCustomer_id()))
        {
           Customer customer=customerRepo.getReferenceById(customerUpdateDTO.getCustomer_id());
           customer.setCustomer_name(customerUpdateDTO.getCustomer_name());
           customer.setCustomer_address(customerUpdateDTO.getCustomer_address());
           customer.setContact(customerUpdateDTO.getContact());
           customerRepo.save(customer);
           return "saved";
        }else
        {
            throw new RuntimeException("invalid ID");
        }


    }

    @Override
    public CustomerDTO getCustomerDetails(int customer_id) {
       if (customerRepo.existsById(customer_id))
       {
           Customer customer=customerRepo.getReferenceById(customer_id);
           CustomerDTO customerDTO=new CustomerDTO(
              customer.getCustomer_id(),
              customer.getCustomer_name(),
              customer.getCustomer_address(),
              customer.getContact(),
              customer.isActive()
           );
           return customerDTO;
       }else
       {
           throw new RuntimeException("id missing");
       }

    }

    @Override
    public String deleteCustomer(int customer_id) {
        if (customerRepo.existsById(customer_id))
        {
            customerRepo.deleteById(customer_id);
            return "deleted"+customer_id;
        }else {
            throw new RuntimeException("missing id");
        }

    }
}
