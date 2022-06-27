package com.company.codingblocks;

import java.util.Scanner;

public class Find_CB_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        printSubStringLengthWise(s);
    }

    public static void printSubStringLengthWise(String s) {
        int stringLength = s.length();
        int count = 0;
        boolean []visited = new boolean[stringLength];
        for(int length=1; length<=stringLength; length++) {
            for(int startIndex = 0; startIndex<=stringLength-length; startIndex++) {
                int endIndex = startIndex + length;
                String subString = s.substring(startIndex, endIndex);
                if( isCBNumber(Long.parseLong(subString)) == true && isVisited(visited, startIndex, endIndex-1) == true ) {
                    count++;
                    for(int i=startIndex; i<endIndex-1; i++) {
                        visited[i] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static boolean isCBNumber(long number) {
        int cbNumbers[] = {2,3,5,7,11,13,17,19,23,29};
        if(number == 0 || number == 1) return false;
        for(int i=0; i<cbNumbers.length; i++) {
            if(number == cbNumbers[i]) return true;
        }
        for(int i=0; i<cbNumbers.length; i++) {
            if(number % cbNumbers[i] == 0) return false;
        }
        return true;
    }
    public static boolean isVisited(boolean []visited, int startIndex, int endndex) {
        for(int i=startIndex; i<=endndex; i++) {
            if(visited[i] == true) return false;
        }
        return true;
    }
}
