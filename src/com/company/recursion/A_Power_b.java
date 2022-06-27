package com.company.recursion;

public class A_Power_b {
    public static void main(String[] args) {
        int n = 2;
        int pow = 1;
        System.out.println(calculatePower(n, pow));
    }
    public static int calculatePower(int n, int pow) {
        if(pow == 0 || pow == 1) return n;
        return n * calculatePower(n, pow - 1);
    }
}
