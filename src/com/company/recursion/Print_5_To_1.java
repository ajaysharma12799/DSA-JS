package com.company.recursion;

public class Print_5_To_1 {
    public static void main(String[] args) {
        int n = 5;
        print_5_To_1(n);
    }
    public static void print_5_To_1(int n) {
        if(n == 0) return;

        System.out.println(n);
        print_5_To_1(n-1);
    }
}
