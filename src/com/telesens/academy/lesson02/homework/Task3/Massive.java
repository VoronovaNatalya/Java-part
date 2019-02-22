package com.telesens.academy.lesson02.homework.Task3;

public class Massive {

    public static void main(String[] args) {
        int[] digits = new int[]{3, 4, 9, 10, 34, 239, 8, 0, -3, 19, 17};
        for (int i = 0; i < digits.length; i++)
            System.out.println(digits[i]);
        int i = 0;

        while (i < digits.length) {

            System.out.println(digits[i]);

            i++;
        }
    }
}
