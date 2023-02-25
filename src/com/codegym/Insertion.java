package com.codegym;

public class Insertion {
    static int[] list = {4, 2, 3, 6, 5, 1};

    public static void insertionSort(int[] list){
        int n = list.length;
        for (int i = 1; i < n; i++){
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key){
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i] + " ");
        }
    }
}
