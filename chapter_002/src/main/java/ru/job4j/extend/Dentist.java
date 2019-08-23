package ru.job4j.extend;

public class Dentist extends Doctor {
    private int countOfSmilyPatients;

    public Dentist(String name, String surname, String education, long birthday, boolean stethoscope, int practice, int patients) {
        super(name, surname, education, birthday, stethoscope, practice);
        this.countOfSmilyPatients = patients;
    }

    public int getCountOfSmilyPatients() {
        return countOfSmilyPatients;
    }
}