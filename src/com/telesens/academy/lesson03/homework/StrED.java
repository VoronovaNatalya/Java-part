package com.telesens.academy.lesson03.homework;

/*
2) Напишите программу, которая:
	- считывает строку
	- выводит исходную строку
	- выводит количество и список, которые заканчиваются буквами 'ED'
*/

public class StrED {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите строку:");
        String s = scanner.nextLine();

        System.out.println("Исходная строка:");
        System.out.println(s);
        int qty = 0;
        String[] words = s.split(" ");
        System.out.println("Список слов, которые заканчиваются буквами 'ED':");
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith("ED")) {
                System.out.println(words[i]);
                qty++;

            }

        }
        System.out.println("Количество слов, которые заканчиваются буквами 'ED':");
        System.out.println(qty);
    }
}
