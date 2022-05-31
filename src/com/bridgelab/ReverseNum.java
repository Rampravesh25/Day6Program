package com.bridgelab;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.print("Enter n to find it's reverse number:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revers = 0, temp = 0;
        while (n != 0) {

            temp = n % 10;
            revers = revers * 10 + temp;
            n = n / 10;

        }
        System.out.println("Printing:-" + " " + revers);
    }
}
