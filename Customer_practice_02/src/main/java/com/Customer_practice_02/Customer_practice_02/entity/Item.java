package com.Customer_practice_02.Customer_practice_02.entity;

import com.Customer_practice_02.Customer_practice_02.entity.enums.MeasuringUnitType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "item_details")
public class Item {
    @Id
    @Column(name = "item_id",nullable = false,length = 10)
    private int item_id;
    @Column(name = "item_name",nullable = false,length = 255)
    private String item_name;
    @Column(name = "item_desc",nullable = false,length = 500)
    private String item_desc;
    @Enumerated(EnumType.STRING)
    @Column(name = "measure_unit",nullable = false,length = 10)
    private MeasuringUnitType measuringUnitType;
    @Column(name = "selling_price",nullable = false,length = 10)
    private double selling_price;

}
