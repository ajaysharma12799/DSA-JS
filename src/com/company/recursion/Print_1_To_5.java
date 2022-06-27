package com.company.recursion;

public class Print_1_To_5 {
    public static void main(String[] args) {
        int n = 5;
        print_1_To_5(n);
    }
    public static void print_1_To_5(int n) {
        if(n == 0) return;

        print_1_To_5(n-1);
        System.out.println(n);
    }
}
