package com.vsaldivarm.demo.models.service;

import com.vsaldivarm.demo.clients.ProductClientRest;
import com.vsaldivarm.demo.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
//Notacion para hacer este service por defecto
@Primary
public class ItemServiceFeign implements  ItemService{
//inyectamos client rest feign
    @Autowired
private ProductClientRest productClientRest;

    @Override
    public List<Item> findAll() {
        return productClientRest.list().stream().map(p -> new Item(p,1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer amoung) {
        return new Item(productClientRest.detail(id),amoung);
    }
}
