package com.codegym;

public class InsertionSort {
    static int[] array = {2, 12, 8, 6, 15, 4, 5, 1};

    public static void insertionSort(int[] array){
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos-1]) {
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }
}
