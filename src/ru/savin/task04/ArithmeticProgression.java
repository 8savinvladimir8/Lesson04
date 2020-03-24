package ru.savin.task04;

import java.io.*;

/**
 * Класс выводит арифметическую прогрессию для N чисел
 */
public class ArithmeticProgression {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        int x = Integer.parseInt(reader.readLine());

        for (int n = 1; n <= x; n++) {
            System.out.println((n * (n + 1)) / 2);
        }
    }
}
