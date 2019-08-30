package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Grigory Dauge");
        student.setGroup("1035em");
        student.setAdmission(new Date());

        System.out.println("Student of group " + student.getGroup() + " " + student.getFullName() + " admissed to College " + student.getAdmission());
    }
}
