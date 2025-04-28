package com.example.day1;

import java.util.Scanner;

/*
  문제: 문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.
* 1 ≤ str의 길이 ≤ 1,000,000
  str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
*
  고민
    1. a가 null 이 아니면서 1000000 이하
    2. 공백이 없는 경우
*/
public class Q001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = a.trim();

        if ( !( b.isEmpty()  ) && ( a.length() <= 1000000 ) ){
            System.out.println(b);
        }
    }
}