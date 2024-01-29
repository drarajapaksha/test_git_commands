package com.Customer_practice_02.Customer_practice_02.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {

    private int customer_id;

    private String customer_name;

    private String customer_address;

    private int contact;

    private boolean active;



}
