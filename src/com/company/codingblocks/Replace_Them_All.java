package com.company.codingblocks;

public class Replace_Them_All {
    public static void main(String[] args) {
        int number = 102;
        System.out.println(replaceThemAll(number));
    }
    public static int replaceThemAll(int num) {
        int temp = num, rev = 0, rem;
        if(num == 0) {
            return 5;
        }
        else {
            while(temp != 0) {
                rem = temp % 10;
                if(rem == 0) rem = 5;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }
        }
        return reverseNumber(rev);
    }
    public static int reverseNumber(int reverse) {
        int temp = reverse, rev = 0, rem;
        while(temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        return rev;
    }
}
