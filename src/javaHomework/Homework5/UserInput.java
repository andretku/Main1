package javaHomework.Homework5;

import java.util.Scanner;

public class UserInput {

    public int userDigits(String message){
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        int userInputValue =  scanner.nextInt();
        return userInputValue;
    }
}
