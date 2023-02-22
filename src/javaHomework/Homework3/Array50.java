package javaHomework.Homework3;

import java.util.Arrays;
import java.util.Random;

public class Array50 {
    public static void main(String[] args) {

        //массив из 8 целых чисел от 1 до 50
        int min = 1;
        int max = 50;
        int[] arrayNumbers = new int[8];


        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = (int) (Math.random() * (max - min + 1) + min);
            }

        int[] evenValue = arrayNumbers.clone();

        //нечетные числа приравниваем к 0
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (evenValue[i] % 2 != 0) {
                evenValue[i] = 0;
            }
         }

        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println(Arrays.toString(evenValue));

    }
}