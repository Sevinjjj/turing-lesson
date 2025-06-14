package org.example;

import java.sql.SQLOutput;

public class Main{
    public static void main ( String[] args){

        byte number=100;
        short number1=101;
        int number2=102;
        long number3=103;
        float number4= 103.1F;
        double number5=103.2;
        int number6=103;
        char article='F';
        boolean requestF= true;
        boolean requestT= false;
        System.out.println(number1);
        System.out.print(number1+number4/number);
        System.out.println(!requestF);
        System.out.print(article+article-article);
        System.out.println(number1+number2);
        System.out.println(number2-number1);
        System.out.println(number3/3);
        System.out.println(number5%5);
        System.out.println(++number1);
        //System.out.println((number1++);
        System.out.println(number1>number2 || number2>number1 );
        //System.out.println(number3=number6 && number2>number1);
        System.out.println(false || false);
        System.out.println(false && false);
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(true && true);
        int a=1, b=2, c=3, d=4;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a^b);
        System.out.println(a*b);
        System.out.println(a++);
        System.out.println(b--);
        System.out.println(++a);
        System.out.println(--b);
        System.out.println(a+=5);
        System.out.println(b-+5);
        System.out.println(a=+b+article);
    }
}