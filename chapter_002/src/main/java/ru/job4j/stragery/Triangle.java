package ru.job4j.stragery;

/**
 * @author vzernov
 * @version 1
 * @since 10.10.2019
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder trng = new StringBuilder();
        trng.append("  ▲  ");
        trng.append(System.lineSeparator());
        trng.append(" ▲▲▲ ");
        trng.append(System.lineSeparator());
        trng.append("▲▲▲▲▲");
        return trng.toString();
    }
}