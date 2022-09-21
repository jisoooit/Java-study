package me.java.day3;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if ( x > 0 && y > 0 ) {
            System.out.println("1 사분면");
        } else if ( x > 0 && y < 0 ){
            System.out.println("2 사분면");
        } else if ( x < 0 && y > 0 ){
            System.out.println("3 사분면");
        } else if (x < 0 && y < 0 ){
            System.out.println("4 사분면");
        } else {
            if ( x == 0 ){
                System.out.println("x축 위에 있음");
            }
            if ( y == 0 ){
                System.out.println("y축 위에 있음");
            }
        }
    }
}
