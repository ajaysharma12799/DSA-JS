package com.company.sorting;

public class Bubble_Sort {
    public static void main(String[] args) {
        int []arr = {3,9,6,-9,-11};
        bubbleSort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " -> ");
        }
    }
    public static void bubbleSort(int []arr) {
        int length = arr.length;
        for (int pass = 1; pass <= length - 1; pass++) {
            for (int i = 0; i < length - pass; i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}
