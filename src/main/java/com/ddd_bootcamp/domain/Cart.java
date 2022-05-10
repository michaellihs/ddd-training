package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cart {
    private List<Item> items = new ArrayList<>();
    private List<Item> removedItems = new ArrayList<>();
    private UUID id;

    public Cart() {
        this.id = UUID.randomUUID();
    }


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

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null || other.getClass() != this.getClass()) {
            return false;
        } else {
            return ((Cart) other).id.equals(id);
        }
    }
}