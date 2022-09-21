package me.java.day2;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1= scanner.nextInt();
        int num2=scanner.nextInt();

        System.out.println("최솟값 : "+ Math.min(num1,num2));
        System.out.println("최댓값 : "+ Math.max(num1,num2));
    }
}
