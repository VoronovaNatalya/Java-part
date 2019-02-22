package com.telesens.academy.lesson04.homework;

/*1) Предположим, имеется следующий класс.
	class SomeNumber {
		private int n; // единственное поле класса
		// ...
		}

	a) Реализуйте конструктор без параметров (по умолчанию инициализируем 0)
	b) Конструктор, с одним параметром (int n)
	c) Метод int getN();
	d) Метод int setN();
	e) Метод print();
			который выводит строку, напр: "Число: 5"
	f) Метод boolean isPositive(); // которые возвращает true, если число положительное и false, если число отрицательное */

public class SomeNumber {

    private int n;

    public SomeNumber() {
    }

    public SomeNumber(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Число:" + n;
    }

    boolean isPositive(boolean state) {

        if (n >= 0) {
            state = true;
            return state;
        } else {
            state = false;
            return state;

        }

    }
}
