package javaHomework.Homework2;

import java.util.Scanner;

public class ThreeUserInput {

    public int userInputInfo (String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
