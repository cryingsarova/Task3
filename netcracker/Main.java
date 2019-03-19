package com.netcracker;

public class Main {
    public static void main(String[] args) {
      ArraySorting.checkingSortTime();//время вывожу в нано секундах, так как при переводе в обычные получается 0 при округлении
      Factorial.checkTime();
      ArrayFigures.drawAllFigures();
      OneDimensionalArray.executeAll();
      TwoDimensionalArray.executeAll();
      ControlStructures.structureWithEnum();
      ControlStructures.structureWithArray();
    }

}
