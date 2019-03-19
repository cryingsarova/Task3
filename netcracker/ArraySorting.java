package com.netcracker;

import java.util.Arrays;
import java.util.Random;

public class ArraySorting {
    //int[] array;
    static Random random = new Random((int)Math.random()*50);

    private static void print(int[] array){
        for (int item: array ) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static int[] bubbleSort(int[] array){
        for ( int i = 0 ; i < array.length -1; i++){
            for (int j = 0 ; j < array.length-i -1; j++ ){
                if (array[j] > array [j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array, boolean order){

        if (order) {
            for (int i = 0; i < array.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < array.length; j++)
                    if (array[j] < array[min])
                        min = j;

                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        else
        {
            for (int i = 0; i < array.length - 1; i++) {
                int max = i;
                for (int j = i + 1; j < array.length; j++)
                    if (array[j] > array[max])
                        max = j;

                int temp = array[max];
                array[max] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }

    public static int[] standartSort(int[] array){
        Arrays.sort(array);
        return array;
    }

    public static void checkingSortTime(){

        int[] arr = new int[10000];
        int[] arr2 = new int[10000];
        int[] arr3 = new int[10000];

        long startTime = System.nanoTime();
        bubbleSort(arr);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Bubble Sort time =  "+ estimatedTime);

        startTime = System.nanoTime();
        selectionSort(arr2,true);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Selection Sort time =  "+ estimatedTime);

        startTime = System.nanoTime();
        standartSort(arr3);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Standart Sort time =  "+ estimatedTime);
        System.out.println();
    }


}
