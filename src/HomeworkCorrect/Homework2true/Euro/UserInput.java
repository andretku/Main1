package HomeworkCorrect.Homework2true.Euro;

import java.util.Scanner;

public class UserInput {

    // нам нужен и int, и double, поэтому добавляем два значения
    public int userInputInteger(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int userInputValue =  scanner.nextInt();
        return userInputValue;
    }

    public double userInputDouble(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
