package ru.job4j.stragery;

/**
 * @author vzernov
 * @version 1
 * @since 10.10.2019
 */
public class Paint {
    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {
        new Paint().draw(new Triangle());
        new Paint().draw(new Square());
    }
}