package com.vibe.backend.controller;

import com.vibe.backend.model.Item;
import com.vibe.backend.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@CrossOrigin(origins = "*")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getItems(
            @RequestParam(defaultValue = "") String search) {
        return itemService.searchItems(search);
    }
}
