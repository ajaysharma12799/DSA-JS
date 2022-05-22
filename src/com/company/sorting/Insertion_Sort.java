package com.company.sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int []arr = {2,5,1,4,3,9,6,7,8};
        insertionSort(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " -> ");
        }
    }
    public static void insertionSort(int []arr) {
        for (int i = 0; i <arr.length; i++) {
            int j = i-1;
            int item = arr[i];
            while(j >=0 && arr[j] > item) {
                arr[j+1] = arr[j];
                j--;
            }
            j++;
            arr[j] = item;
        }
    }
}
