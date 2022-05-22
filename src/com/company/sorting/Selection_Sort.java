package com.company.sorting;

public class Selection_Sort {
    public static void main(String[] args) {
        int []arr = {3,9,6,-9,-11, 10};
        selectionSort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " -> ");
        }
    }
    public static void selectionSort(int []arr) {
        for (int i = 0; i <arr.length; i++) {
            int minIndex = i;
            // Find Min Index
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            // Swap Number
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
