package ru.job4j.extend;

public class Doctor extends Profession {
    private boolean haveShinyStethoscope;
    private int yearsOfPractice;

    public Doctor(String name, String surname, String education, long birthday, boolean stethoscope, int practice) {
        super(name, surname, education, birthday);
        this.haveShinyStethoscope = stethoscope;
        this.yearsOfPractice = practice;
    }

    public boolean isHaveShinyStethoscope() {
        return haveShinyStethoscope;
    }

    public int getYearsOfPractice() {
        return yearsOfPractice;
    }

    public Diagnose heal(Pacient pacient) {
        return null;
    }
}
