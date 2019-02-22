package com.telesens.academy.lesson03.homework;

/*7) Реализовать программу, которая определяет, является ли строка палиндромом.
Палиндром - это строка, которая одинаково читается одинаково в обоих направлениях
(пример: "мадам" - палиндром, "адам" - не палиндром).*/

public class Palindrom {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите строку:");
        String s = scanner.nextLine();

        System.out.println("Исходная строка:" + " "  + s);

        String sreverse = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            sreverse = sreverse + s.charAt(i);
        }
        if (s.equals(sreverse))
            System.out.println("Палиндром");
        else
            System.out.println("Непалиндром");

    }
}
