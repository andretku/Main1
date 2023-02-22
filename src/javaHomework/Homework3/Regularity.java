package javaHomework.Homework3;

import java.util.Arrays;

public class Regularity {
    public static void main(String[] args) {

        //задание со звездочкой
        // пока не доделал

        int[] a1 = new int[10];
        int[] a2 = new int[10];
        int[] a3 = new int[10];
        int[] a4 = new int[10];
        double[] a5 = new double[10];
        int[] a6 = new int[10];
        int[] a7 = new int[10];
        int[] a8 = new int[10];
        int[] a9 = new int[10];
        int[] a10 = new int[10];

        a1[0] = 2;
        a2[0] = 1; a5[0] = 1; a6[0] = 1; a7[0] = 1; a8[0] = 1;
        a9[0] = 1; a10[0] = 1;


        for (int i = 1; i < 10; i++) {
            a1[i] = a1[i-1] + 2;
            a2[i] = a2[i-1] + 2;
            a3[i-1] = i ^ 2;
            a4[i-1] = i ^ 3;
            a5[i] = a5[i-1] * (-1);


        }

        System.out.println("1 array: " + Arrays.toString(a1));
        System.out.println("2 array: " + Arrays.toString(a2));
        System.out.println("3 array: " + Arrays.toString(a3));
        System.out.println("4 array: " + Arrays.toString(a4));
    }
}
