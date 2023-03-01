package javaHomework.Homework4;

import java.util.Arrays;

public class MassivePary {
    public static void main(String[] args) {
        /*
        Дан массив из N целых чисел и целое число K,
        найдите количество пар элементов в массиве, сумма которых равна K.
         */
        int numberOfElements = 10;
        int[] typeArray = new int[numberOfElements];
        int targetK = 5;

        //заполняем массив рандомками
        for (int i = 0; i < numberOfElements; i++) {
            typeArray[i] = (int) (Math.random()*numberOfElements);
        }
        System.out.println(Arrays.toString(typeArray));

        int counter = 0;

        //двойной цикл для поиска пар
        for (int j = 0; j < numberOfElements; j++) {
            for (int i = (j+1); i < numberOfElements; i++) {
                if ((typeArray[j] + typeArray[i]) == targetK) {
                    counter++;
                }
            }
        }

        System.out.println("Numbers of pairs are - " + counter);
    }
}
