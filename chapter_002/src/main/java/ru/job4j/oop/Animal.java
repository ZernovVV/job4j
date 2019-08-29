package ru.job4j.oop;

public class Animal {
    private String name;
    public Animal(String name) {
        super();
        this.name = name;
        System.out.println("animal was born");
    }
    public String getName() {
        return name;
    }
}
