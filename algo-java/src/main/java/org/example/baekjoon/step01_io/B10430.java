package org.example.baekjoon.step01_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine().trim());
        int B = Integer.parseInt(br.readLine().trim());
        System.out.println(A*(B%10));
        System.out.println(A*((B/10)%10));
        System.out.println(A*((B/100)%10));
        System.out.println(A*B);
    }
}
