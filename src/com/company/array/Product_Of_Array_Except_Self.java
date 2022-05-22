package com.company.array;

public class Product_Of_Array_Except_Self {
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        productOfArrayExceptSelf(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " -> ");
        }
    }
    public static void productOfArrayExceptSelf(int []arr) {
        int arrayLength = arr.length;
        int []left = new int[arrayLength];
        left[0] = 1;

        for(int i=1; i<arrayLength; i++) {
            left[i] = left[i-1] * arr[i-1];
        }

        int []right = new int[arrayLength];
        right[arrayLength-1] = 1;

        for(int i=arrayLength-2; i>=0; i--) {
            right[i] = right[i+1] * arr[i+1];
        }

        // Multiply Both Left and Right Array
        for(int i=0; i<arrayLength; i++) {
            arr[i] = left[i] * right[i];
        }
    }
}
