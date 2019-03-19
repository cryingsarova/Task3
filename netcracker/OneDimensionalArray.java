package com.netcracker;

import com.netcracker.ArraySorting;

import java.util.Random;

public class OneDimensionalArray {
    static Random random = new Random((int)Math.random()*50);

    public static void increasingAscendingOrder(){

        System.out.println();
        int[] array = new int[50];
        int counter = 0;
        for (int i = 1; i < 100; i = i + 2){
            array[counter++]=i;
        }
        printArray(array);
        array = ArraySorting.selectionSort(array,false);
        printArray(array);

    }

    public static void creatingRandomArray() {
        System.out.println();
        int[] array = randomArray(20,0,10);
        printArray(array);
        int evenNumbercount = 0;

        for (int item:array) {
            if (item % 2 == 0){
                evenNumbercount++;
            }
        }

        System.out.println("Количество четных элементов = "+evenNumbercount);
        System.out.println("Количество нечетных элементов = "+(array.length-evenNumbercount));
    }

    public static void replacingOddIndexes(){
        System.out.println();
        int[] array = randomArray(10,0,100);
        printArray(array);
        for(int i = 1; i< array.length; i = i+2){
            array[i]=0;
        }
        printArray(array);
    }

    public static void maxAndMinElementInArray(){
        System.out.println();
        int [] array = randomArray(15,-50,50);
        printArray(array);
        System.out.println("Максимальный эелемент = " + array[max(array)] + ", индекс = " + max(array));
        System.out.println("Минимальный элемент = " + array[min(array)] + ", индекс = " + min(array));

    }

    public static void arithmeticAverageOfArrays(){
        System.out.println();
        int[] array1 = randomArray(10,0,10);
        int[] array2 = randomArray(10,0,10);
        printArray(array1);
        printArray(array2);
        if (average(array1) > average(array2)){
            System.out.println("Среднее арифметическое 1 массива больше");
        }
        if (average(array1) < average(array2)){
            System.out.println("Среднее арифметическое 2 массива больше");
        }
        else {
            System.out.println("Средние арифметические массивов равны");
        }
    }

    public static void countOfElement(){
        System.out.println();
        int[] array= randomArray(20,-1,1);
        int count_1 = 0;
        int count0 = 0;
        int count1 = 0;
        printArray(array);
        for(int item: array){
            if (item == -1) count_1++;
            if (item == 0) count0++;
            if (item == 1) count1++;
        }

        if (count0 > count1 && count0 > count_1){
            System.out.println(" 0 встречается "+count0+" раз");
        }
        if (count1 > count0 && count1 > count_1){
            System.out.println(" 1 встречается "+count1+" раз");
        }
        if (count_1 > count0 && count_1 > count1){
            System.out.println(" -1 встречается "+count_1+" раз");
        }
        if (count0 > count1 && count0 == count_1){
            System.out.println(" 0 встречается "+count0+" раз, -1 встречается "+count_1+" раз");
        }
        if (count0 > count_1 && count0 == count1){
            System.out.println(" 0 встречается "+count0+" раз, 1 встречается "+count1+" раз");
        }
        if(count1 > count0 && count1 == count_1){
            System.out.println(" 1 встречается "+count1+" раз, -1 встречается "+count_1+" раз");
        }
    }


    private static double average(int[] array){
        int sum=0;
        for (int item:array) {
            sum += item;
        }
        return sum/array.length;
    }

    private static int max(int[] array){
        int max = 0;
        for(int i = 1; i < array.length; i++){
            if (array[i]>=array[max]){
                max = i;
            }
        }
        return max;
    }

    private static int min(int[] array){
        int min = 0;
        for(int i = 1; i < array.length; i++){
            if (array[i]<=array[min]){
                min = i;
            }
        }
        return min;
    }

    private static int[] randomArray(int length, int leftBound, int rightBound){
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = leftBound + random.nextInt(rightBound+1-leftBound);
        }
        return array;
    }

    private static void printArray(int[] array){

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void executeAll(){
        increasingAscendingOrder();
        creatingRandomArray();
        replacingOddIndexes();
        maxAndMinElementInArray();
        arithmeticAverageOfArrays();
        countOfElement();
    }
}
