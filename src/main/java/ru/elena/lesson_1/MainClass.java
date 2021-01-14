package ru.elena.lesson_1;

//6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
// отрицательное, и вернуть false если положительное.
public class MainClass {
    public static void main(String[] args) {
        int a = -10;
        checkValue(a);
        System.out.println(checkValue(a));
    }
    
    public static boolean checkValue(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
}
