package com.sarthak8;

import java.util.Arrays;

public class CycleSorting {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void cycle(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correct_idx = arr[i] - 1;
            if(arr[i] != arr[correct_idx]){
                swap(arr, i, correct_idx);
            }else   i++;
        }
    }
}
