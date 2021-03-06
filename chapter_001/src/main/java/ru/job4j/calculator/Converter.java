package ru.job4j.calculator;

/**
 * Конвертер валюты.
 *
 * @author Andrey Sumin
 * @since 16.02.2018
 */
public class Converter {
    private static final int EURO_RATE = 70;
    private static final int DOLLAR_RATE = 60;

    /**
     * Конвертация рублей в евро
     *
     * @param rouble - количество рублей
     * @return - количество евро
     */
    public double roubleToEuro(double rouble) {
        return rouble / EURO_RATE;
    }

    /**
     * Конвертация рублей в доллары.
     *
     * @param rouble - количество рублей
     * @return - количество долларов
     */
    public double roubleToDollar(double rouble) {
        return rouble / DOLLAR_RATE;
    }

    /**
     * Конвертация евро в рубли.
     *
     * @param euro - количество евро
     * @return - количество рублей
     */
    public double euroToRouble(double euro) {
        return euro * EURO_RATE;
    }

    /**
     * Конвертация долларов в рубли.
     *
     * @param dollar - количество долларов
     * @return - количество рублей
     */
    public double dollarToRouble(double dollar) {
        return dollar * DOLLAR_RATE;
    }
}
