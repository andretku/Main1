package javaHomework.Homework2;

public class ThreeKolby {

    public static void main(String[] args) {

        ThreeUserInput userInput = new ThreeUserInput();

        String message = "Please, write the temperature of the first bottle";
        int temperature1 = userInput.userInputInfo(message);

        message = "Please, write the temperature of the second bottle";
        int temperature2 = userInput.userInputInfo(message);

        if ((temperature1 > 100) && (temperature2 < 100)) {
            boolean checkIn = true;
            System.out.println("Device is working correctly - " + checkIn);
        } else {
            boolean checkIn = false;
            System.out.println("Device is broken - " + checkIn);
        }

    }
}
