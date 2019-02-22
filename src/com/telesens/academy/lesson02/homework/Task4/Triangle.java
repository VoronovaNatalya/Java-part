package com.telesens.academy.lesson02.homework.Task4;

public class Triangle {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите с клавиатуры числo");
        int a = scanner.nextInt();
        System.out.println(a);
        char i ='*';

        while (i<a) {

            System.out.println(+i);

            i++;
        }
    }
}
