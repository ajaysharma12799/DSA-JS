package com.company.codingblocks;

public class Print_Primes {
    public static void main(String[] args) {
        int range = 10;
        calculatePrimes(range);
    }
    public static void calculatePrimes(int range) {
        int flag = 0;
        for(int i=2; i<=range; i++) {
            for(int j=2; j<=i-1; j++) {
                if(i % j == 0) {
                    flag += 1;
                }
            }
            if(flag == 0) {
                System.out.println(i);
            }
            else {
                flag = 0;
            }
        }
    }
}
