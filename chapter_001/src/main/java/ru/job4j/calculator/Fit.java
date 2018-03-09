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
     * Общий коэффициент
     */
    private static final double OVERALL_RATIO = 1.15;

    /**
     * Коэффициент для мужчин
     */
    private static final int MALE_RATIO = 100;

    /**
     * Коэффициент для женщин
     */
    private static final int FEMALE_RATIO = 110;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        this.weight = (height - MALE_RATIO) * OVERALL_RATIO;
        return this.weight;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        this.weight = (height - FEMALE_RATIO) * OVERALL_RATIO;
        return this.weight;
    }
}
