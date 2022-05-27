package com.company.codingblocks;

public class Print_Series {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 4;
        printSeries(n1, n2);
    }
    public static void printSeries(int n1, int n2) {
        int row = 1;
        int n = 1;
        while(row <=n1) {
            int formula = (3 * n) + 2;
            if(formula % n2 != 0) {
                System.out.println(formula);
                row++;
            }
            n++;
        }
    }
}
