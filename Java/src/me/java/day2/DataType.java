package me.java.day2;

public class DataType {
    public static void main(String[] args) {
        // 자료형 ( datatype )

        // 원시 자료형 (primitive type) : 스택 공간
        // int (4byte) , float (4) , double(8) , char (2)
        // 1byte = 8bit

        // 참조형 ( reference type ) : 힙 공간간
        // Strig


        int i = 10; // 정수의 기본 단위
        long l = 10;
        float f = 3.14f; //4byte 짜리 실수가 된다.
        double d = 3.14; // 실수의 기본 단위


        // 쓰레기 값
        byte var1 = 125;
        int var2 = 125;

        for (int k= 0; k < 5; k ++) {
            var1++; // var1 = var1 + 1
            var2++; // var2 = var2 + 1
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
        }

        //문자열 + 문자열 = 문자열의 결합
        // 문자열 + 정수
        // 정수가 문자열로 promotion 된다.

    }
}
