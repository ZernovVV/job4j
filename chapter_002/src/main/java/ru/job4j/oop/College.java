package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman frm = new Freshman();
        StudentNew stfr = frm; //понижение типа до родительского StudentNew
        Object obj = stfr; //понижение типа до родительского Object
        Object object = frm; //понижение типа до Object
    }
}
