package com.company.searching;

public class Binary_Search {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int searchElement = 5;
        System.out.println(binarySearch(arr, searchElement));
    }
    public static int binarySearch(int []arr, int searchElement) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = (start + end ) / 2;
            if(arr[mid] == searchElement) return mid;
            else if (arr[mid] < searchElement) start = mid + 1;
            else end = mid -1;
        }
        return -1;
    }
}
/*
* Binary Search Works When we have Sorted Array or Sorted Search Space
* */
