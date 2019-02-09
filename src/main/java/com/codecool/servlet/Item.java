package com.codecool.servlet;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;


public class Item {
        private final int id;
        private final String name;
        private final float prize;

    public Item(int id, String name, float prize) {
        this.id = id;
        this.name = name;
        this.prize = prize;
        }


    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public float getPrize(){
        return prize;
    }

    @Override // Object
    public String toString() {
        return name;
    }

}
