package com.company.codingblocks;

public class Count_Digits {
    public static void main(String[] args) {
        int number = 12323345;
        int search = 3;
        System.out.println(countDigits(number, search));;
    }
    public static int countDigits(int num, int search) {
        int temp = num, rem, count = 0;
        while (temp != 0) {
            rem = temp % 10;
            if(rem == search) {
                count++;
            }
            temp = temp / 10;
        }
        return count;
    }
}
