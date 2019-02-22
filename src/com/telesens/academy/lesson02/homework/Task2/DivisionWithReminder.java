package com.telesens.academy.lesson02.homework.Task2;

public class DivisionWithReminder {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter two digits");
        int q = scanner.nextInt();
        int w = scanner.nextInt();
        System.out.println(q);
        System.out.println(w);
        int result = q/w;
        int reminder = q%w;
        System.out.println(result);
        System.out.println(reminder);

    }
}
