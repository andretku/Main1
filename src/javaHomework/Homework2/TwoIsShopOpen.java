package javaHomework.Homework2;

public class TwoIsShopOpen {

    public static void main(String[] args) {

        boolean isEdekaOpen = true;
        boolean isReweOpen = true;

        if (isEdekaOpen && isReweOpen){
            boolean canBuy = true;
            System.out.println("All of the shops are open");
        } else if (isEdekaOpen && !isReweOpen) {
            boolean canBuy = true;
            System.out.println("You can buy food in Edeka");
        } else if (!isEdekaOpen && isReweOpen) {
            boolean canBuy = true;
            System.out.println("You can buy food in Rewe");
        } else {
            boolean canBuy = false;
            System.out.println("All the shops are closed");
        }


    }
}
