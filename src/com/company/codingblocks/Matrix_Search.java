package com.company.codingblocks;

public class Matrix_Search {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int searchElement = 50;
        int mat[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(matrixSearch(mat, row, col, searchElement));;
    }
    public static int matrixSearch(int arr[][], int row, int col, int searchElement) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(arr[i][j] == searchElement) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
