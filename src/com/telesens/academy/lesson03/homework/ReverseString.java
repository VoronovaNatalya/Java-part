package com.telesens.academy.lesson03.homework;

/*5) Реализовать программу, которая:
	- считывает строку
	- меняет местами порядок символов (напр. "abcd" => "dcba")
	- выводит исходную строку
	- выводит перевернутую строку*/

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = scanner.nextLine();

        System.out.println("Исходная строка:" + " "  + s);

        String sreverse = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            sreverse = sreverse + s.charAt(i);
        }
        System.out.println("Перевернутая строка:" + " " + sreverse);
    }
}