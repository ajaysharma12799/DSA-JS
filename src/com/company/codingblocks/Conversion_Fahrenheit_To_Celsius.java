package com.company.codingblocks;

public class Conversion_Fahrenheit_To_Celsius {
    public static void main(String[] args) {
        int minFahrenheit = 0;
        int maxFahrenheit = 100;
        int steps = 20;
        conversion(minFahrenheit, maxFahrenheit, steps);
    }
    public static void conversion(int minFahrenheit, int maxFahrenheit, int steps) {
        for(int i=minFahrenheit; i<=maxFahrenheit; i+=steps) {
            int celsius = ((i - 32) * 5) / 9;
            System.out.println(i + "\t" + celsius);
        }
    }
}
