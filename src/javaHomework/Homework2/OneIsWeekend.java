package javaHomework.Homework2;

public class OneIsWeekend {

    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = true;

        if (isWeekend && !isRain){
            boolean canWalk = true;
            System.out.println("Go for a walk!");
        } else {
            boolean canWalk = false;
            System.out.println("Stay at home...");
        }

    }

}
