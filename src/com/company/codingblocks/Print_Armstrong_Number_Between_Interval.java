package com.company.codingblocks;

public class Print_Armstrong_Number_Between_Interval {
    public static void main(String[] args) {
        int startInterval = 400;
        int endInterval = 1000;
        checkArmstrong(startInterval, endInterval);
    }
    public static void checkArmstrong(int startInterval, int endInterval) {

        for(int i=startInterval; i<=endInterval; i++) {
            int num = i, rem;
            int originalReverseNumber = 0;
            int digits = countDigits(num);
            while(num != 0) {
                rem = num % 10;
                originalReverseNumber += Math.pow(rem, digits);
                num = num / 10;
            }
            System.out.println(originalReverseNumber);
            if(num == originalReverseNumber) {
                System.out.println(originalReverseNumber);
                break;
            }
        }
    }
    public static int countDigits(int number) {
        int temp = number;
        int count = 0, rem;
        while(temp != 0) {
            rem = temp % 10;
            count++;
            temp = temp / 10;
        }
        return count;
    }
}
