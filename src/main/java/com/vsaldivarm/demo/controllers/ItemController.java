package com.vsaldivarm.demo.controllers;


import com.vsaldivarm.demo.models.Item;
import com.vsaldivarm.demo.models.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/listar")
    public List<Item> list(){
return itemService.findAll();
    }

    @GetMapping("/watch/{id}/amoung/{amoung}")
    public Item Itemdetail (@PathVariable  Long id, @PathVariable Integer amoung){
        return  itemService.findById(id,amoung);
    }
}
