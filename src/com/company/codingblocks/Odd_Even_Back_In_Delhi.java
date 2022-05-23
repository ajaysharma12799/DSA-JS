package com.company.codingblocks;

public class Odd_Even_Back_In_Delhi {
    public static void main(String[] args) {
        // int n = 12345;
        int n = 12134;
        oddEvenBackInDelhi(n);
    }
    public static void oddEvenBackInDelhi(int n) {
        int temp = n, EvenSum = 0, OddSum = 0, counter = 1, rem;
        while(temp != 0) {
            rem = temp % 10;
            if(counter % 2 == 0) {
                EvenSum += rem;

            }
            else {
                OddSum += rem;
            }
            counter++;
            temp = temp / 10;
        }
        if(EvenSum % 4 == 0 || OddSum % 3 == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
