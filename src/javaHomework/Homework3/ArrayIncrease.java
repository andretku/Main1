package javaHomework.Homework3;

import java.util.Arrays;

public class ArrayIncrease {
    public static void main(String[] args) {

        int max = 99;
        int min = 10;
        int[] arrayInc = new int[5];

        //заполнение рандомными числами
        for (int i = 0; i < arrayInc.length; i++) {
            arrayInc[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        System.out.println(Arrays.toString(arrayInc));
        int a = 1;

        //проверка строгого возрастания рандомных чисел
        for (int i = 0; i < arrayInc.length-1; i++) {
            if (arrayInc[i] < arrayInc[i+1]){
                a += 1;
            } else {
                System.out.println("This array is not increase");
                break;
            }
        }

        if (a == arrayInc.length){
            System.out.println("It's increase!");
        }
    }
}
