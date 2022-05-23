package com.company.codingblocks;

public class Star_Pattern_1 {
    public static void main(String[] args) {
        int n = 5;
        printStar(n);
    }
    public static void printStar(int n) {
        int i, j;
        for(i=1; i<=n; i++) {
            for(j=i; j<n; j++) {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
