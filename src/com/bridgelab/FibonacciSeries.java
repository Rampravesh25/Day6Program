package com.bridgelab;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter n to find the last number in fibonacci series ");

        int a = 0, b = 1, temp = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(0 + " " + 1 + " ");
        for (int i = 1; i < n - 1; i++) {
            temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }
    }
}
