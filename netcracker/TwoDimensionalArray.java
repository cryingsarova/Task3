package com.netcracker;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {

    static Random random = new Random(59);

    public static void mainAndSecondaryDiagonal(){ // подсчет суммы и произведения на диагоналях
        System.out.println();
        int[][] array = randomArray(8,8,1,99);
        printArray(array);
        int sum = 0;
        long prod = 1;
        for(int i = 0; i < array.length; i++){ // подсчет по главной диагонали
            sum+=array[i][i];
            prod*=array[i][i];
        }
        System.out.println("Главная диагональ:\n сумма = " + sum + " произведение = " + prod);
        sum = 0;
        prod = 1;
        for(int i = 0; i < array.length; i++){ // подсчет по побочной диагонали
            sum+=array[i][array.length-i-1];
            prod*=array[i][array.length-i-1];
        }
        System.out.println("Побочная диагональ:\n сумма = " + sum + " произведение = " + prod);
    }

    public static void maxElementAmongArray(){
        System.out.println();
        int[][] array = randomArray(8,5,-99,99);
        printArray(array);
        System.out.println("Максимальный элемент в массиве: "+ max(array));
    }

    public static void maxProductAmongRows(){
        System.out.println();
        int[][] array = randomArray(8,5,-10,10);
        printArray(array);
        int index = 0;
        long prod = 1;
        for(int i = 0; i < array.length; i++){
            long prodTmp = 1;
            for(int j = 0; j < array[0].length; j++){
                prodTmp*=array[i][j];
            }
            if (Math.abs(prodTmp) > prod){
                prod = Math.abs(prodTmp);
                index = i;
            }
        }
        System.out.println("Наибольшее произведение по модулю находится в строке " + (index+1));

    }

    public static void rowsSorting(){
        System.out.println();
        int[][] array = randomArray(10,7,-10,10);
        printArray(array);
        System.out.println("Отсортированный массив:");
        for(int i = 0; i < array.length; i++){
            Arrays.sort(array[i]);
        }
        printArray(array);
    }

    public static void executeAll(){
        mainAndSecondaryDiagonal();
        maxElementAmongArray();;
        maxProductAmongRows();
        rowsSorting();
    }

    private static int[][] randomArray(int length, int length2, int leftBound, int rightBound){
        int[][] array = new int[length][length2];
        for (int i = 0; i < length; i++) {
        for (int j = 0; j < length2; j++) {
            array[i][j] = leftBound + random.nextInt(rightBound + 1 - leftBound);
        }
        }
        return array;
    }

    private static void printArray(int[][] array){

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int max(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] >= max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

}
