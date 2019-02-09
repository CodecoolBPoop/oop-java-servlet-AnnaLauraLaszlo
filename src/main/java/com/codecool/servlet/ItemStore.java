package com.codecool.servlet;


import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ItemStore {

    private static ArrayList<Item> items =
            new ArrayList<>(Arrays.asList(new Item(1, "Life Ring", 1500),
                    new Item(2, "Saint's Ring", 300 ),
                    new Item(3, "Ring of Sacrifice", 3000),
                    new Item(4, "Untrue White Ring", 5000)));


    public void add(int id, String name, float prize){
        items.add(new Item(id, name, prize));
    }

    public void remove(int id){
        items.removeIf((Item a) -> a.getId() == id);
    }
}
