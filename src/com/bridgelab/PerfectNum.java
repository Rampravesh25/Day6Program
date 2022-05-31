package com.bridgelab;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        System.out.print(" Please Enter number :-");
        int j = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n / 2];

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                arr[j] = i;
                j++;
            }
        }
        int i = 0, sum = 0;
        while (i <= j) {
            sum += arr[i];
            i++;
        }
        if (sum == n)
            System.out.println(n + " This is perfect number");
        else
            System.out.println(n + " is not a perfect number");

    }
}
