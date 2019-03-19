package com.netcracker;

public class ArrayFigures {

    private static int SIZE = 5;

    public static void drawSquare(){
        for (int i = 0 ; i < SIZE; i++){
            for (int j =0; j < SIZE; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawTriangle(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawInverseTriangle(){
        for(int i = 0; i < SIZE; i++){
            for(int j = SIZE; j > i; j--){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawEmptySquare(){
        for (int i = 0; i < SIZE; i++){

            if (i == 0 || i == SIZE-1){// если это первая или последняя строка
                for (int j = 0; j < SIZE; j++) {
                    System.out.print("#");
                }
            }
            else{
                System.out.print("#");
                for (int j = 1; j < SIZE - 1; j++){
                    System.out.print(" ");
                }
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void drawZFigure(){
        for (int i = 0; i < SIZE; i++){
            if (i ==0 || i==SIZE-1){//если первая и последняя строка
                for (int j =0; j < SIZE; j++){
                    System.out.print("#");
                }
            }
            else {
                for(int j= 0; j< SIZE-i-1; j++){
                    System.out.print(" ");
                }
                System.out.print("#");
                for(int j = SIZE - i; j < SIZE ; j++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawAllFigures(){
        drawSquare();
        drawTriangle();
        drawInverseTriangle();
        drawEmptySquare();
        drawZFigure();
    }
}
