package ru.job4j.oop;

public class Tiger extends Predator {
    public Tiger(String name) {
        super(name);
        System.out.println("tiger was born" + " , his name is " + this.getName());
    }

    public static void main(String[] args) {
        Tiger tig = new Tiger("Tig");
    }
}
