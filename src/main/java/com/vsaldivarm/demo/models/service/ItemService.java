package com.vsaldivarm.demo.models.service;

import com.vsaldivarm.demo.models.Item;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();
    public  Item findById( Long id, Integer amoung);
}
