package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        enum Month {
            January, February, March, April, May, June, July, August, September,
            October, November, December
        }

        int min = -30;
        int max = 30;

        int[][] JArray = new int[12][];
        JArray[0] = new int[31];
        JArray[1] = new int[28];
        JArray[2] = new int[31];
        JArray[3] = new int[30];
        JArray[4] = new int[31];
        JArray[5] = new int[30];
        JArray[6] = new int[31];
        JArray[7] = new int[31];
        JArray[8] = new int[30];
        JArray[9] = new int[31];
        JArray[10] = new int[30];
        JArray[11] = new int[31];

        Random random = new Random();

        // Заполняем массив случайными значениями температур
        for (int i = 0; i < JArray.length; i++) {
            for (int j = 0; j < JArray[i].length; j++) {
                JArray[i][j] = random.nextInt(max - min + 1) + min;
            }
        }

        // Печатаем номера дней (1-31) сверху
        System.out.printf("%-10s", "");  // Оставляем место для названий месяцев
        for (int day = 1; day <= 31; day++) {
            System.out.printf("%4d", day);
        }
        System.out.println();  // Переход на новую строку

        // Печатаем названия месяцев и температуры для каждого дня
        for (int i = 0; i < JArray.length; i++) {
            // Печатаем название месяца
            System.out.printf("%-10s", Month.values()[i]);

            // Печатаем температуры за каждый день, если есть данные для этого дня
            for (int j = 0; j < 31; j++) {
                if (j < JArray[i].length) {
                    System.out.printf("%4d", JArray[i][j]);
                } else {
                    System.out.printf("    ");  // Пустое место для дней, которых нет в месяце
                }
            }
            System.out.println();  // Переход на новую строку после каждого месяца
        }
    }
}
