package com.company.leetcode;

public class Gas_Station {
    public static void main(String[] args) {
        int []gas = {1,2,3,4,5};
        int []cost = {3,4,5,1,2};

        System.out.println(gasStation(gas, cost));
    }
    public static int gasStation(int []gas, int []cost) {
        int arrayLength = gas.length;
        int totalFuel = 0;
        int startIndex = 0;
        int currentFuel = 0;

        for (int i = 0; i < arrayLength; i++) {
            totalFuel += (gas[i] - cost[i]);
        }
        if(totalFuel < 0) {
            return -1;
        }

        for (int i = 0; i < arrayLength; i++) {
            currentFuel += (gas[i] - cost[i]);
            if(currentFuel < 0) {
                startIndex = i + 1;
                currentFuel = 0;
            }
        }
        return startIndex;
    }
}
