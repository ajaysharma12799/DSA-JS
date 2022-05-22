package com.company.array;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int []arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        trappingRainWater(arr);
    }
    public static void trappingRainWater(int []arr) {
        int arrayLength = arr.length;
        int sum = 0;
        int []left = new int[arrayLength];
        left[0] = arr[0];

        for(int i=1; i<arrayLength; i++) {
            left[i] = Math.max(left[i-1], arr[i]);
        }

        int []right = new int[arrayLength];
        right[arrayLength-1] = arr[arrayLength-1];

        for(int i=arrayLength-2; i>=0; i--) {
            right[i] = Math.max(right[i+1], arr[i]);
        }

        for(int i=0; i<arrayLength; i++) {
            sum +=  Math.min(left[i], right[i]) - arr[i];
        }
        System.out.println(sum);
    }
}
