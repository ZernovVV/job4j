package ru.job4j.extend;

public class Engineer extends Profession {
    private int yearsOfExperience;

    public Engineer(String name, String surname, String education, long birthday, int yearsOfExperience) {
        super(name, surname, education, birthday);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
