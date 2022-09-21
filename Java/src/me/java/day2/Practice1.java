package me.java.day2;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noteBookPrice = scanner.nextInt();
        int money = scanner.nextInt();

        double noteBookPriceSum=0;
        noteBookPriceSum = noteBookPrice + noteBookPrice*0.1;

        System.out.println("Sally가 받을 잔돈 : "+ (money - noteBookPriceSum));


    }




}
