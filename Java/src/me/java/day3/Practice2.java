package me.java.day3;

import java.util.Locale;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        if ((ch>='a' && ch <='z') || (ch >='A' && ch <='Z')){
            if ((ch>='a' && ch <='z')){
                System.out.println((char)(ch-32));
            }
        }
        else{
            System.out.println("영문자가 유효하지 않습니다.");
        }


    }

}
