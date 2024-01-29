package com.Customer_practice_02.Customer_practice_02.controller;

import com.Customer_practice_02.Customer_practice_02.dto.ItemDTO;
import com.Customer_practice_02.Customer_practice_02.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @PostMapping("saveItem")
    public String saveItem(@RequestBody ItemDTO itemDTO)
    {
        itemService.saveItem(itemDTO);
        System.out.println(itemDTO.getItem_name());
        return "saved";
    }
}
