package com.Customer_practice_02.Customer_practice_02.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.ArrayList;

@Entity
@Table(name = "customer_registration_details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Customer {
    @Id
    @Column(name = "customer_id",nullable = false,length = 10)
    private int customer_id;
    @Column(name = "customer_name",nullable = false,length = 100)
    private String customer_name;
    @Column(name = "customer_address",nullable = false,length = 10)
    private String customer_address;
    @Column(name = "customer_contact",nullable = false,length = 10)
    private int contact;
    @Column(name = "active",columnDefinition = "TINYINT default 0")
    private boolean active;
}
