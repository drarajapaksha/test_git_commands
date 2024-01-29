package com.Customer_practice_02.Customer_practice_02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerUpdateDTO {
    private int customer_id;
    private String customer_name;

    private String customer_address;

    private int contact;
}
