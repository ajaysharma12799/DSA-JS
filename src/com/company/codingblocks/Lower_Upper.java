package com.company.codingblocks;

public class Lower_Upper {
    public static void main(String[] args) {
        checkLowerUpper('-');
    }
    public static void checkLowerUpper(char ch) {
        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Character");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Character");
        }
        else {
            System.out.println("Invalid Character");
        }
    }
}
