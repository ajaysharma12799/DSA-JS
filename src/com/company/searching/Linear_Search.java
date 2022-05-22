package com.company.searching;

public class Linear_Search {
    public static void main(String[] args) {
        int []arr = {1,4,2,3,5,11,55,78};
        int item = 11;
        System.out.println(search(arr, item));
    }
    public static int search(int []arr, int item) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
}
