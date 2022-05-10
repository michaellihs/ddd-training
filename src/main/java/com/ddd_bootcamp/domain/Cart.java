package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items = new ArrayList<>();
    private List<Item> removedItems = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public void remove(String productName) {
        items.removeIf((item) -> {
            if (item.getProduct().getName().equals(productName)) {
                removedItems.add(item);
                return true;
            };
            return false;
        });
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Item> getRemovedItems() {
        return removedItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}