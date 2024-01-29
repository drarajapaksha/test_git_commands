package com.Customer_practice_02.Customer_practice_02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ModelMapper {
    @Bean
    private ModelMapper modelMapper()
    {
        return new ModelMapper();
    }
}
