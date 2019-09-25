package ru.job4j.poly;

public class Bus implements Transport {
    public double fuelPrice;

    @Override
    public void drive() {
        System.out.println("Wheels goes round and round!");
    }

    @Override
    public void passengers(int numberOfPassenger) {
        System.out.println("there are " + numberOfPassenger + " passengers in the vehicle");
    }

    @Override
    public double fueling(int gas) {
        return gas * fuelPrice;
    }
}