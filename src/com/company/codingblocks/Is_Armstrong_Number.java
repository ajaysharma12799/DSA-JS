package com.company.codingblocks;

public class Is_Armstrong_Number {
    public static void main(String[] args) {
        int number = 1634;
        System.out.println(checkArmstrong(number));
    }
    public static boolean checkArmstrong(int number) {
        int num = number, rem;
        int originalNumber = 0;
        int digits = countDigits(number);
        while(num != 0) {
            rem = num % 10;
            originalNumber += Math.pow(rem, digits);
            num = num / 10;
        }
        if(number == originalNumber) {
            return true;
        }
        return false;
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
