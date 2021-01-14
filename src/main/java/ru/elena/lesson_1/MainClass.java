package ru.elena.lesson_1;
//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
// Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
public class MainClass {
    public static void main(String[] args) {
        String name = "Елена";
        printName(name);
    }

    public static void printName(String name){
        System.out.println("Привет, " + name + "!");
    }
}
