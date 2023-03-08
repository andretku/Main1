package javaHomework.Homework5;

import java.util.Arrays;

public class LotteryUtils {

    UserInput userInput = new UserInput();
    int numberOfWinDigits = 5;      //количество правильных цифр
    int numberOfAllDigits = 20;     //количество всех цифр в лотерее
    int[] digitsFromUser = new int[numberOfWinDigits];

    public void userNumbers(){
        for (int i = 0; i < numberOfWinDigits; i++) {
            digitsFromUser[i] = userInput.userDigits("Please enter " + (i+1) + " number from 1 to " + numberOfAllDigits + " - ");
            if (digitsFromUser[i]<1 || digitsFromUser[i]>numberOfAllDigits){
                System.out.println("Enter the correct number!");
                i = i-1;
            }
        }
    }
    public void printNumbers(String message, int[] arrayData){
        System.out.println();
        System.out.println(message + Arrays.toString(arrayData));
    }

    int[] randomDigits = new int[numberOfWinDigits];
    public void createRandomNumbers(){
        for (int i = 0; i < numberOfWinDigits; i++) {
          randomDigits[i] = (int) (Math.random()*numberOfAllDigits + 1);
        }
        System.out.println();
        System.out.println("Lottery random numbers are - " + Arrays.toString(randomDigits));
    }
    public int counter;
    public void compareNumbers(){

        for (int i = 0; i < numberOfWinDigits; i++) {
            for (int j = 0; j < numberOfWinDigits; j++) {
               if (digitsFromUser[i] == randomDigits[j]) {
                   System.out.print(digitsFromUser[i] + ", ");
                   counter++;
               }
            }
        }


        if (counter == 0) {
            System.out.println("-------------------------");
            System.out.println("You did't win...");
        }

    }


}
