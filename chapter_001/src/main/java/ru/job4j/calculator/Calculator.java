package ru.job4j.calculator;

/**
 * Class Класс для вычисления арифметических операций + - / *.
 * @author vzernov
 * @since 20.02.2018
 * @version 1
*/
public class Calculator {
    /**
     * Содержит результат
     */
    private double result;

    /**
     * Сложение
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Вычитание
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Деление
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Умножение
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Результат
     * @return результат
     */
    public double getResult() {
        return this.result;
    }
}