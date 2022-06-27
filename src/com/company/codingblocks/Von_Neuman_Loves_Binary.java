package com.company.codingblocks;

public class Von_Neuman_Loves_Binary {
    public static void main(String[] args) {
        int n = 4;
        String []nums = {
                "101",
                "1111",
                "00110",
                "111111"
        };
        for (int i=0; i<n; i++) {
            int binaryNumber = Integer.parseInt(nums[i]);
            convertToDecimal(binaryNumber);
        }
    }
    public static void convertToDecimal(int binaryNumber) {
        int num = binaryNumber;
        int rem, decimal = 0, count = 0;
        while(num != 0) {
            rem = num % 10;
            decimal += rem * Math.pow(2, count);
            num = num / 10;
            count++;
        }
        System.out.println(binaryNumber + " -> " + decimal);
    }
}
