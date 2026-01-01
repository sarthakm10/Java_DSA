package com.sarthak5;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        /*
             1 2 3
             4 5 6
             7 8 9
        */
        Scanner in = new Scanner(System.in);
        //int[][] arr = new int[3][];

        int[][] arr2D = {
                {1, 2, 3}, // 0th index
                {4, 5}, // 1st index
                {6, 7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9}
        };

        int[][] arrs = new int[3][3];
        System.out.println(arrs.length); // no of rows

        // input
        for (int row = 0; row < arrs.length; row++) {
            // for each col in every row
            for (int col = 0; col < arrs[row].length; col++) {
                arrs[row][col] = in.nextInt();
            }
        }

        // output
        for (int row = 0; row < arrs.length; row++) {
            // for each col in every row
            for (int col = 0; col < arrs[row].length; col++) {
                System.out.print(arrs[row][col] + " ");
            }
            System.out.println();
        }
        // or like this
        for (int row = 0; row < arrs.length; row++) {
            System.out.println(Arrays.toString(arrs[row]));
        }
        //or like this
        for(int[] a : arrs) {
            System.out.println(Arrays.toString(a));
        }
    }
}
