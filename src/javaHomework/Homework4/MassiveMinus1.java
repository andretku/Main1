package javaHomework.Homework4;

import java.util.Arrays;

public class MassiveMinus1 {
    public static void main(String[] args) {

/*
Дан массив размера N-1 , который должен содержать только целые числа в диапазоне от 1 до N .
Каждое число представлено в одном экземпляре, кроме одного числа. Найдите недостающий элемент.
 */

        int arrayLength = 20;
        int[] arrayFull = new int[arrayLength];
        int[] arrayFullMinus1 = new int[arrayLength];
        int sumFull = 0;
        int sumMinus1 = 0;

        //заполняем массив
        for (int i = 0; i < arrayFull.length; i++) {
            arrayFull[i] = (i+1);
            arrayFullMinus1[i] = (i+1);
        }

        //приравниваем рандомный элемент массива к 0
        //перемещаем этот ноль в самый конец
        int numberRandom = (int) (Math.random()*(arrayLength));
        arrayFullMinus1[numberRandom] = 0;
        for (int i = numberRandom; i < arrayLength-1; i++) {
            if (arrayFullMinus1[i] == 0){
                arrayFullMinus1[i] = arrayFull[i+1];
                arrayFullMinus1[i+1] = 0;
            }
        }

        //уменьшаем массив, удаляя последний 0
        int[] newArray = new int[arrayFullMinus1.length-1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arrayFullMinus1[i];
            }

        System.out.println("Array without 1 symbol: " + Arrays.toString(newArray));


        //вычисление суммы всех элементов в уменьш массиве
        for (int i = 0; i < newArray.length; i++) {
            sumMinus1 += newArray[i];
        }

        //вычисление суммы всех элементов в полном массиве
        for (int i = 0; i < arrayFull.length; i++) {
            sumFull += arrayFull[i];
        }

        System.out.println("The target number is " + (sumFull - sumMinus1));

    }
}
