package com.telesens.academy.lesson03.homework;

/*1) Напишите программу, которая:
	- считывает строку
	- выводит исходную строку
	- выводит количество и список слов, которые начинаются на букву 'd'*/

public class StrStartWithD {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите строку:");
        String s = scanner.nextLine();

        System.out.println("Исходная строка:");
        System.out.println(s);
        int qty = 0;
        String[] words = s.split(" ");
        System.out.println("Список слов, которые начинаются на букву 'd':");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith("d")) {
                System.out.println(words[i]);
                qty++;

            }

        }
        System.out.println("Количество слов, которые начинаются на букву 'd':");
        System.out.println(qty);
    }
}
