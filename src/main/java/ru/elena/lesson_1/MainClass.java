package ru.elena.lesson_1;

public class MainClass {
    public static void main(String[] args) {
        float z = 9.2F;
        float x = 56.20F;
        float m = -22F;
        float v = 633F;

        float result = calculate(z, x, m, v);
        System.out.println(result);

    }

    public static  float calculate(float a, float b, float c, float d){
        float calculate = a * (b + (c / d));
        return calculate;
    }

}
