package com.company.array;

public class Rotate_Array {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " -> ");
        }
    }
    public static void rotate(int []arr, int k) {
        k = k % arr.length;
        int n = arr.length;
//        for(int outer=1; outer <= k; outer++) {
//            int temp = arr[arr.length - 1];
//            for (int i = arr.length - 2; i >= 0; i--) {
//                arr[i + 1] = arr[i];
//            }
//            arr[0] = temp;
//        }
        reverseByRange(arr, n-k, n-1);
        reverseByRange(arr, 0, n-k-1);
        reverseByRange(arr, 0, n-1);
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
