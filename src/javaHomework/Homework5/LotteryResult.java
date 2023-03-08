package javaHomework.Homework5;

import java.util.Arrays;

public class LotteryResult {
    LotteryUtils lotteryUtils = new LotteryUtils();

    public void lottery() {
        lotteryUtils.userNumbers();
        lotteryUtils.printNumbers("Your numbers are - ", lotteryUtils.digitsFromUser);
        lotteryUtils.createRandomNumbers();
        System.out.println("-------------------------------------------------");
        System.out.print("You have win number(s): ");
        lotteryUtils.compareNumbers();
        System.out.println();
        System.out.println("Number of winning digits - " + lotteryUtils.counter);
        System.out.println();
    }
}
