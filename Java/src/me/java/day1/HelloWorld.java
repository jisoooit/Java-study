package me.java.day1;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("자바 수업 첫째날");
        System.out.println("실습 1");
        /*
         * this is javadoc comment
         * it will be included at .class file (after compile)
         * */

        // 주석 (프로그램 코드에 영향을 주지 않고 코드의 설명이나 협업을 위해 사용)
        // ex) 코드 설명, 개발자 이름, 수정일

        // 단일행 주석
        /* 다중행 주석
         * ㄴㅁㅇㅁㄴㅇ
         * ㅁㄴㅇㅁㄴㅇ
         * ㅁㄴㅇㅁㄴㅇ*/

        // 문장 끝에는 세미콜론 (;) 작성
        System.out.println("Hello Java World-1");
        System.out.println("Hello Java World-2");
        System.out.println("Hello Java World-3");
        System.out.println("Hello Java World-4");
        System.out.println("Hello Java World-5");

        // 콘솔에 출력하는 함수
        System.out.println("1");
        System.out.print("2");
        System.out.printf("2");
        System.out.println("");

        System.out.println("실습2");

        int i = 10;
        float f = 12.34f;
        double d = 56.78;
        char c = 'a';
        String s = "Hello World";
        boolean b = true;

        //int
        System.out.println("int");
        System.out.printf("%S\n", s);
        System.out.printf("%30s\n", s);
        System.out.printf("%30S\n", s);
        System.out.println();


        //float
        System.out.println("float");
        System.out.printf("%f\n",f);
        System.out.printf("%.2f\n",f);
        System.out.printf("%.8f\n",f);
        System.out.printf("%5.2f\n",f);
        System.out.printf("%-5.2f\n",f);
        System.out.printf("%e\n",f);
        System.out.printf("%E\n",f);
        System.out.printf("%30.3e\n",f);
        System.out.printf("%30.3E\n",f);
        System.out.println();

        //double
        System.out.println("double");
        System.out.printf("%f\n",d);
        System.out.printf("%.2f\n",d);
        System.out.printf("%.8f\n",d);
        System.out.printf("%5.2f\n",d);
        System.out.printf("%-5.2f\n",d);
        System.out.printf("%e\n",f);
        System.out.printf("%E\n",f);
        System.out.printf("%30.3e\n",f);
        System.out.printf("%30.3E\n",f);
        System.out.println();

        //char
        System.out.println("char");
        System.out.printf("%c\n",c);
        System.out.printf("%C\n",c);
        System.out.printf("%30c\n",c);
        System.out.printf("%30C\n",c);
        System.out.println();

        //String
        System.out.println("String");
        System.out.printf("%s\n", s);
        System.out.printf("%S\n", s);
        System.out.printf("%30s\n", s);
        System.out.printf("%30S\n", s);
        System.out.println();

        // boolean
        System.out.println("bool");
        System.out.printf("%b\n", b);
        System.out.printf("%B\n", b);
        System.out.printf("%30b\n", b);
        System.out.printf("%30B\n", b);
        System.out.println();

        // 변수에 저장하지 않은 리터럴도 가능
        System.out.printf("%d\n", 12345);
        System.out.printf("%f\n", 12.34);
        System.out.printf("%c\n", 'a');
        System.out.printf("%s\n", "a");
        System.out.printf("%b\n", true);
        System.out.println();


//        // 변수의 자료형과 맞지 않은 지시자 사용 - 런타임 오류 발생 (IllegalFormatConversionException)
//        System.out.printf("%c", i);
//        System.out.printf("%d", b);
//
//        // 존재하지 않은 지시자 사용 - 런타임 오류 발생 (IllegalFormatConversionException)
//        System.out.printf("%a", i);
//        System.out.printf("%k", i);
//        System.out.printf("%q", i);

    }
}
