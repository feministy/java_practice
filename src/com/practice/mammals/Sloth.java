package com.practice.mammals;

/**
 * Created by liz on 5/3/16.
 */
public class Sloth extends Mammal {
    public Sloth(String name, int age) {
        this.setAge(age);
        this.setName(name);
        this.lifespan = 12;
        this.setDiet(1);
    }
}
