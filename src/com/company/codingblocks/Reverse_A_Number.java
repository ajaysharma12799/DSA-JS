package com.company.codingblocks;

public class Reverse_A_Number {
    public static void main(String[] args) {
        int num = 123456789;
        System.out.println(reverseNum(num));
    }
    public static String reverseNum(int num) {
        int temp = num, rem;
        String reverseNumber = "";

        while(temp != 0) {
            rem = temp % 10;
            reverseNumber += rem;
            temp = temp / 10;
        }

        return reverseNumber;
    }
}
