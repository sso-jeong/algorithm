package com.example.day1;

import java.util.Scanner;
/*
* 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ str의 길이 ≤ 20
str은 알파벳으로 이루어진 문자열입니다.

* */
public class Q004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";

            for (int i=0; i<a.length(); i++) {
                char c = a.charAt(i);

                if(Character.isUpperCase(c)){
                    result += Character.toLowerCase(c);
                } else {
                    result += Character.toUpperCase(c);
                }
            }

            System.out.println(result);


            /* 아스키 코드에서 대문자와 소문자 사이의 차이입니다. A는 십진수로 65 a는 십진수로 97
            * for(int i=0; i<a.length(); i++) {
                char c = a.charAt(i);
                if(Character.isUpperCase(c)) {
                    System.out.print((char)(c+32));
                }
                else {
                    System.out.print((char)(c-32));
                }
            }
            *
            * */

    }
}
