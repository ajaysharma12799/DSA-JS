package com.company.codingblocks;

import java.util.Scanner;

public class Pattern_Magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            // first print n-i stars
            for(int j=0;j<n-i;j++)
                System.out.print("* ");

            // Print 2*i-1 spaces
            for(int j=0;j<(2*i-1);j++)
                System.out.print("  ");

            // Again Print n-i stars
            // but there is one less star in first row
            int no_of_stars = n-i;
            if(i==0)
                no_of_stars--;

            for(int j=0;j<no_of_stars;j++)
                System.out.print("* ");

            System.out.println();
        }


        // Lower HALF
        for(int i=n-2;i>=0;i--){
            // first print n-i stars
            for(int j=0;j<n-i;j++)
                System.out.print("* ");

            // Print 2*i-1 spaces
            for(int j=0;j<(2*i-1);j++)
                System.out.print("  ");

            // Again Print n-i stars
            // but there is one less star in first row
            int no_of_stars = n-i;
            if(i==0)
                no_of_stars--;

            for(int j=0;j<no_of_stars;j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}
