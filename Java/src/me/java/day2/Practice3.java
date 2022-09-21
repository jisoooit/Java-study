package me.java.day2;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("윤년");
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("윤년");
        }else{
            System.out.println("평년");
        }

    }

}
