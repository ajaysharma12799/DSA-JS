package com.company.codingblocks;

public class String_Odd_Even_Character {
    public static void main(String[] args) {
        String s = "abcg";
        System.out.println(oddEvenCharacter(s));
    }
    public static String oddEvenCharacter(String s) {
        int length = s.length();
        int counter = 0;
        String str = "";
        for(int i=0; i<length; i++) {
            char ch = s.charAt(i);
            if(counter % 2 == 0) {
                System.out.println("Even Characters : " + ch);
                str += (char) (ch + 1);
            }
            else {
                System.out.println("Odd Characters : " + ch);
                str += (char) (ch - 1);
            }
            counter++;
        }
        return str;
    }
}
