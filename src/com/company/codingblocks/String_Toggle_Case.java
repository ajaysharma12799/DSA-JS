package com.company.codingblocks;

public class String_Toggle_Case {
    public static void main(String[] args) {
        String s = "abC";
        System.out.println(toggleString(s));
    }
    public static String toggleString(String s) {
        int i=0;
        String toggledString = "";
        while(i<s.length()) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                toggledString += (char)(s.charAt(i) - 32);
            } else {
                toggledString += (char)(s.charAt(i) + 32);
            }
            i++;
        }
        return toggledString;
    }
}
