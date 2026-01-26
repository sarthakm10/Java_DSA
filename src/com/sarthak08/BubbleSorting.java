package com.sarthak08;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        bubbles(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbles(int arr[]){
        boolean sorted;
        for (int i = 0; i < arr.length; i++) {
            sorted = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            if(sorted == false)     break;
        }
    }
}
