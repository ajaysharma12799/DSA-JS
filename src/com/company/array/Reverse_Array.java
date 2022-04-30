package com.company.array;

public class Reverse_Array {
    public static void main(String[] args) {
        int []arr = {1,4,2,3,5,11,55,58};
        // reverse(arr);
        reverseByRange(arr, 2, 6);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " -> ");
        }
    }

    public static void reverse(int []arr) {
        int start = 0;
        int last = arr.length - 1;
        while(start < last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }

    public static void reverseByRange(int []arr, int startIndex, int endIndex) {
        int start = startIndex;
        int last = endIndex;

        while(start < last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }
}
