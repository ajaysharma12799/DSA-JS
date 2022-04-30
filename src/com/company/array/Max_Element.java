package com.company.array;

public class Max_Element {
    public static void main(String[] args) {
        int []arr = {1,4,2,3,5,11,55,58};
        // System.out.println(maxElement1(arr));
        System.out.println(maxElement2(arr));
    }
    public static int maxElement1(int []arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int maxElement2(int []arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }
}
