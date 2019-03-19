package com.netcracker;

import java.util.Random;

public class ControlStructures {

    private static Random random = new Random(100);

    static public void structureWithEnum() {

        Season season = Season.ALL;

        long startTime1 = System.nanoTime();

        if (season == Season.SPRING) {
            System.out.println("Spring");
        } else if (season == Season.SUMMER) {
            System.out.println("Summer");
        } else if (season == Season.AUTUMN) {
            System.out.println("Autumn");
        } else if (season == Season.WINTER) {
            System.out.println("Winter");
        } else {
            System.out.println("All");
        }
        long estimatedTime1 = System.nanoTime() - startTime1;

        long startTime2 = System.nanoTime();

        switch (season) {
            case SPRING: {
                System.out.println("Spring");
                break;
            }
            case SUMMER: {
                System.out.println("Summer");
                break;
            }
            case AUTUMN: {
                System.out.println("Autumn");
                break;
            }
            case WINTER: {
                System.out.println("Winter");
                break;
            }
            default: {
                System.out.println("All");
                break;
            }
        }
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("Else-If construction time =  " + estimatedTime1);
        System.out.println("Swith-Case construction time =  " + estimatedTime2);

    }

    static public void structureWithArray(){

        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0 + random.nextInt(10+1);
        }

        int[] counter = new int[10];
        for(int i = 0; i< counter.length;i++){
            counter[i]=0;
        }

        long startTime1 = System.nanoTime();

        for (int item: array){
            if (item == 0) {
                counter[0]++;
            } else if (item == 1) {
                counter[1]++;
            } else if (item == 2) {
                counter[2]++;
            } else if (item == 3) {
                counter[3]++;
            } else if (item == 4) {
                counter[4]++;
            } else if (item == 5) {
                counter[5]++;
            } else if (item == 6) {
                counter[6]++;
            } else if (item == 7) {
                counter[7]++;
            } else if (item == 8) {
                counter[8]++;
            } else {
                counter[9]++;
            }
        }
        long estimatedTime1 = System.nanoTime() - startTime1;

        long startTime2 = System.nanoTime();
        for (int item: array){
            switch (item){
                case 0:{
                    counter[0]++;
                    break;
                }case 1:{
                    counter[1]++;
                    break;
                }case 2:{
                    counter[2]++;
                    break;
                }case 3:{
                    counter[3]++;
                    break;
                }case 4:{
                    counter[4]++;
                    break;
                }case 5:{
                    counter[5]++;
                    break;
                }case 6:{
                    counter[6]++;
                    break;
                }case 7:{
                    counter[7]++;
                    break;
                }case 8:{
                    counter[8]++;
                    break;
                }default:{
                    counter[9]++;
                    break;
                }
            }

        }
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println();
        for(int i = 0; i < counter.length; i++){
            System.out.println("Элемент " + i + " всречается " + counter[i] + " раз." );
        }
        System.out.println();
        System.out.println("Else-If construction time =  " + estimatedTime1);
        System.out.println("Swith-Case construction time =  " + estimatedTime2);
    }

}
