package com.vibe.backend.service;

import com.vibe.backend.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    private final List<Item> items = List.of(
        new Item(1L, "MacBook Pro", "Laptop"),
        new Item(2L, "AirPods Pro", "Accessories"),
        new Item(3L, "iPhone 15", "Mobile"),
        new Item(4L, "Magic Mouse", "Accessories")
    );

    public List<Item> searchItems(String search) {
        return items.stream()
                .filter(item ->
                        item.getName().toLowerCase()
                                .contains(search.toLowerCase()))
                .collect(Collectors.toList());
    }
}
