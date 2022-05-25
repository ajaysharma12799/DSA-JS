package com.company.codingblocks;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        int binaryNumber = 101010;
        System.out.println(convertToDecimal(binaryNumber));
    }
    public static int convertToDecimal(int binaryNumber) {
        int temp = binaryNumber, rem, decimalNumber = 0, count = 0;
        while(temp != 0) {
            rem = temp % 10;
            decimalNumber += rem * Math.pow(2, count);
            temp = temp / 10;
            count++;
        }
        return decimalNumber;
    }
}
