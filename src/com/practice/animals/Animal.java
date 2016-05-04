package com.practice.animals;

/**
 * Created by liz on 5/3/16.
 */
public class Animal {
    public int lifespan;
    public int age;
    public String name;

    public int getLifespan() {
        return lifespan;
    }

    public void setAge(int age) {
        if (age > this.lifespan) {
            this.age = this.lifespan;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
