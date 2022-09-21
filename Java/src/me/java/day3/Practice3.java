package me.java.day3;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String op = sc.next();

        if (op.equals("+")) {
            System.out.println(num1 + num2);
        } else if( op.equals("-")) {
            System.out.println(num1 - num2);
        } else if(op.equals("*")) {
            System.out.println(num1 * num2);
        } else if(op.equals("/")) {
            System.out.println(num1 / num2);
        } else if (op.equals("%")) {
            System.out.println(num1 % num2);
        } else{
            System.out.println("연산자가 유효하지 않습니다.");
        }


    }
}
