package ru.elena.lesson_1;

//4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
//   если да – вернуть true, в противном случае – false.

public class MainClass {
    public static void main(String[] args) {
        int param1 = 90;
        int param2 = -66;
        
        System.out.println(check(param1, param2));
    }

    public static boolean check(int param1, int param2) {
        int summ = param1 + param2;
        if (summ >= 10 && summ <= 20) {
            return true;
        } else {
            return false;
        }
    }

}


