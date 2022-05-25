package com.company.codingblocks;

public class Count_Palindrome_String {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(countPalindromeSubString(s));
    }
    public static int countPalindromeSubString(String s) {
        int length = s.length();
        int count = 0;
        for(int i=0; i<length; i++) {
            for(int j=i+1; j<=length; j++) {
                String subString = s.substring(i, j);
                if(isPalindrome(subString)) count++;
            }
        }
        return count;
    }
    public static boolean isPalindrome(String s) {
        int i=0;
        int j = s.length() - 1;
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
