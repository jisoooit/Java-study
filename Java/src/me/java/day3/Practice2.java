package me.java.day3;

import java.util.Locale;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String alpha  = sc.next();

        char ch = alpha.charAt(0);
        if ((ch>='a' && ch <='z') || (ch >='A' && ch <='Z')){
            if ((ch>='a' && ch <='z')){
                alpha=""+(char)(ch-32);
                System.out.println(alpha);
            }
        }
        else{
            System.out.println("영문자가 유효하지 않습니다.");
            }
        /*for (int i = 0 ; i< alpha.length() ; i++){
            char ch = alpha.charAt(i);
            if ((ch>='a' && ch <='z') || (ch >='A' && ch <='Z')){
                System.out.println("영문자가 유효하지 않습니다.");
                break;
            }
            else{
                if (ch>='a' && ch <='z'){

                    alpha.replace(ch,(char)ch -32);
                }

                }
            }*/
        }

}
