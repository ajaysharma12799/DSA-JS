package com.company.codingblocks;

public class Inverse_The_Array {
    public static void main(String[] args) {
        int arr[] = {0,2,4,1,3};
        int inverse[] = inverseTheArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(inverse[i] + " -> ");
        }
    }
    public static int[] inverseTheArray(int arr[]) {
        int []inv = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            int v = arr[i];
            inv[v] = i;
        }
        return inv;
    }
}
