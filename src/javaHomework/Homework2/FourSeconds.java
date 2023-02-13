package javaHomework.Homework2;

import java.util.Random;

public class FourSeconds {
    public static void main(String[] args) {

        int isWorkStarts = 28800;
        int isWorkEnds = 0;

        double nDouble = Math.random() * (isWorkStarts - isWorkEnds + 1) + isWorkEnds; //тестирование с помощью random

        int n = (int) (isWorkStarts - nDouble);
        System.out.println("Your working day ends in " + n + " seconds");

        int nHours = n / 3600;
        if (nHours < 3600) {
            System.out.println("Your working day ends in " + nHours + " hours");
        } else {
            System.out.println("The working day ends in less then an hour!");
        }
   }
}
