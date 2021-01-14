package ru.elena.lesson_1;

//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли
//   число передали или отрицательное. Замечание: ноль считаем положительным числом.
public class MainClass {
    public static void main(String[] args) {
        int number = 50;
        checkNumber(number);

    }
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is negative");
        }

    }

}
