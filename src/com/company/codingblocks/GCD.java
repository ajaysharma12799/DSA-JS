package com.company.codingblocks;

public class GCD {
    public static void main(String[] args) {
        int a = 24;
        int b = 18;
        System.out.println(gcd(a, b));
    }
    public static int gcd(int a, int b) {
        int result = Math.min(a, b);
        while(result > 0) {
            if(a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }
}
