package me.java.day2;

public class Practice4 {
    public static void main(String[] args) {

        int num1 = 123456780;
        int num2 = 123456780;

        float num3 = num2;
        num2 = (int) num3;
        System.out.println(num3);
        System.out.println(num2);

        int result = num1 - num2;
        System.out.println(result);

        //result가 0이 아닌 이유
    }
}
