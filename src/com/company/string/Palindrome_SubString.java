package com.company.string;

public class Palindrome_SubString {
    public static void main(String[] args) {
        String s = "nitin";
        checkPalindromeSubString(s);
    }
    public static void checkPalindromeSubString(String s) {
        int length = s.length();
        for(int i=0; i<length; i++) {
            for(int j=i + 1; j<=length; j++) {
                String subString = s.substring(i, j);
                if(isPalindromeString(subString)) {
                    System.out.println(subString);
                }
            }
        }
    }
    public static boolean isPalindromeString(String str) {
        int i=0;
        int j=str.length() - 1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
