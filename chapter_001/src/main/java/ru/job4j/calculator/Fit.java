package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 * @author vzernov
 * @since 22.02.2018
 * @version 1
 */
public class Fit {

    /**
     * Идеальный вес
     */
    private double weight;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        this.weight = (height - 100) * 1.15;
        return this.weight;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        this.weight = (height - 110) * 1.15;
        return this.weight;
    }
}
