package com.company.string;

public class Intro {
    public static void main(String[] args) {
        // String str1 = "Hello";
        // String str2 = "Hello";
        // String str3 = new String("Hello");
        // String str4 = new String("Hello");

        // System.out.println(str1 == str2);
        // System.out.println(str3 == str4);

        // str1 = str1 + " World"; // String Immutable

        // System.out.println(str1.equals(str4)); // Compare Content of String

        // String Methods
        String str = "HelloWorld, Tata Bye Bye";
        String str1 = "Vishal";
        String str2 = "Vipul";

        System.out.println(str.charAt(2)); // Get Character at Specific index
        System.out.println(str.length()); // Find Length of String
        if(str1.compareTo(str2) > 0) { // Compare Two String
            System.out.println(str1 + " is Greater");
        }
        else {
            System.out.println(str2 + " is Greater");
        }
    }
    public static int compareTo(String s1, String s2) {
        return 0;
    }
}
