package ru.job4j.calculator;

/**
 * Корвертор валюты.
 * @author vzernov
 * @since 21.02.2018
 * @version 1
 */
public class Converter {

    /**
     * Курс рубль/евро
     */
    private int rubEuro = 70;
    /**
     * Курс рубль/доллар
     */
    private int rubDollar = 60;
    /**
     * Количество конвертируемой валюты
     */
    private int value;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        this.value = value / rubEuro;
        return this.value;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        this.value = value / rubDollar;
        return this.value;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли.
     */
    public int euroToRuble(int value) {
        this.value = value * rubEuro;
        return this.value;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли
     */
    public int dollarToRuble(int value) {
        this.value = value * rubDollar;
        return this.value;
    }
}