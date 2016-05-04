package com.practice.animals;

import java.util.ArrayList;

/**
 * Created by liz on 5/3/16.
 */
public class Animal {
    protected int lifespan;
    private int age;
    private String name;
    private int diet;
    private static final ArrayList<String> DIET;

    static {
        DIET = new ArrayList<>();
        DIET.add("carnivore");
        DIET.add("herbivore");
        DIET.add("omnivore");
    }

    protected void setDiet(int diet) {
        this.diet = diet;
    }

    public String getDiet() {
        return DIET.get(this.diet);
    }

    public int getLifespan() {
        return lifespan;
    }

    protected void setAge(int age) {
        if (age > this.lifespan) {
            this.age = this.lifespan;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
