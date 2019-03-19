package com.netcracker;

public class Factorial {

    public static int cycleFactorial(int number){
        if (number < 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }
        else {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            return result;
        }
    }

    public static int recursionFactorial(int number){
        if (number < 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }
        else{
            return number*recursionFactorial(number-1);
        }
    }

    public static void checkTime(){
        long startTime = System.nanoTime();
        cycleFactorial(100);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Cycle factorial time =  "+ estimatedTime);

        startTime = System.nanoTime();
        recursionFactorial(100);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Recursion factorial time =  "+ estimatedTime);
        System.out.println();
    }
}
