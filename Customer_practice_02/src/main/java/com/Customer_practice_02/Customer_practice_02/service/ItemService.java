package com.Customer_practice_02.Customer_practice_02.service;

import com.Customer_practice_02.Customer_practice_02.dto.ItemDTO;
import org.springframework.web.bind.annotation.RequestBody;

public interface ItemService {
    public String saveItem(ItemDTO itemDTO);
}
