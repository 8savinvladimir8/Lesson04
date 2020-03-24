package ru.savin.task01;

import java.io.*;

/**
 * Класс выводит на консоль минимальное из двух чисел
 */
public class MinimumNumber {
    public static String minOfTwoNumbers(int a, int b) {
        if (a < b) {
            return "Минимальное число: " + a;
        } else if (a > b) {
            return "Минимальное число: " + b;
        } else
            return "Числа равны.";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число:");
        int b = Integer.parseInt(reader.readLine());

        System.out.println(minOfTwoNumbers(a, b));
    }
}
