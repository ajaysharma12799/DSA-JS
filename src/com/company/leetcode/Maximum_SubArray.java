package com.company.leetcode;

public class Maximum_SubArray {
    public static void main(String[] args) {
        int []arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray1(arr));

        System.out.println(maxSubArray2(arr));

    }
    public static int maxSubArray1(int []arr) { // BruteForce Approach
        int ans = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++) {
            int sum = 0;
            for(int j=i; j< arr.length; j++) {
                sum += arr[j];
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }

    public static int maxSubArray2(int []arr) { // Optimized Approach "Kadane Algorithm"
        int ans = Integer.MIN_VALUE;
        int current = 0;
        for(int i=0; i< arr.length; i++) {
            current += arr[i];
            ans = Math.max(current, ans);
            if(current < 0) {
                current = 0;
            }
        }
        return ans;
    }
}
