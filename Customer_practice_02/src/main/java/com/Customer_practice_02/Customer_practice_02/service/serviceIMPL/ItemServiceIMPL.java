package com.Customer_practice_02.Customer_practice_02.service.serviceIMPL;

import com.Customer_practice_02.Customer_practice_02.dto.ItemDTO;
import com.Customer_practice_02.Customer_practice_02.entity.Item;
import com.Customer_practice_02.Customer_practice_02.repo.ItemRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceIMPL {
    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private ModelMapper modelMapper;
    public String saveItem(ItemDTO itemDTO){
        Item item=modelMapper.map(itemDTO,Item.class);
        itemRepo.save(item);
        return null;
    }
}
