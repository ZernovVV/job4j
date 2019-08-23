package ru.job4j.extend;

public class Surgeon extends Doctor {
    private int countOfOperations;

    public Surgeon(String name, String surname, String education, long birthday, boolean stethoscope, int practice, int operations) {
        super(name, surname, education, birthday, stethoscope, practice);
        this.countOfOperations = operations;
    }

    public int getCountOfOperations() {
        return countOfOperations;
    }
}
