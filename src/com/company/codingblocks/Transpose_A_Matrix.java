package com.company.codingblocks;

public class Transpose_A_Matrix {
    public static void main(String[] args) {
        int matrixSize = 5;
        int mat[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        transposeMatrix(mat, matrixSize);
    }
    public static void transposeMatrix(int arr[][], int matrixSize) {
        for(int i=0; i<matrixSize; i++) {
            for(int j=0; j<matrixSize; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
