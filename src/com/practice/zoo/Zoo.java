package com.practice.zoo;

import com.practice.animals.Animal;

import java.util.ArrayList;

/**
 * Created by liz on 5/3/16.
 */
public class Zoo {
    String name;
    ArrayList<Animal> animals;

    public void addAnimal(Animal newAnimal) {
        animals.add(0, newAnimal);
    }

    public void setAnimals(ArrayList animals) {
        this.animals = animals;
    }

    public ArrayList getAnimals() {
        return animals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Zoo() {
        animals = new ArrayList<Animal>();
    }
}
