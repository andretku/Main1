package lesson3.calculator;

public class UserInputInterface {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        System.out.println("Please, enter an integer number - ");
        int userEnterInteger = userInput.userInputInteger();
        System.out.println("Your number is " + userEnterInteger);
    }

}
