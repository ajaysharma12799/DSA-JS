package com.company.string;

public class Palindrome_String {
    public static void main(String[] args) {
        String s = "namam";
        System.out.println(isPalindromeString(s));
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
