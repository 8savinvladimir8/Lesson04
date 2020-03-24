package ru.savin.task02;

import java.io.*;

/**
 * Класс выводит - отрицательное число или положительное (или нулевое), чётное или нечётное
 */
public class KindOfNumber {
    public static String getKindOfNumber(int x) {
        if (x < 0) {
            if ((x % 2) == 0) {
                return "Отрицательное чётное число";
            } else {
                return "Отрицательное нечётное число";
            }
        }
        if (x > 0) {
            if ((x % 2) == 0) {
                return "Положительное чётное число";
            } else {
                return "Положительное нечётное число";
            }
        } else
            return "Введён ноль";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        int x = Integer.parseInt(reader.readLine());

        System.out.println(getKindOfNumber(x));
    }
}
