package me.java.day3;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double korean = sc.nextInt();
        double math = sc.nextInt();
        double english = sc.nextInt();

        double average ;
        if ( (0 > korean || korean >100)  || (0 > math || math >100)  || (0 > english || english >100)){
            System.out.println("성적이 유효하지 않습니다.");
        } else{
            average = (korean + math + english) /3;
            System.out.println(average);

        }

    }
}
