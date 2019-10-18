package ru.job4j.stragery;

/**
 * @author vzernov
 * @version 1
 * @since 10.10.2019
 */
public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder sq = new StringBuilder();
        sq.append("■■■■");
        sq.append(System.lineSeparator());
        sq.append("■■■■");
        sq.append(System.lineSeparator());
        sq.append("■■■■");
        sq.append(System.lineSeparator());
        sq.append("■■■■");
        return sq.toString();
    }
}