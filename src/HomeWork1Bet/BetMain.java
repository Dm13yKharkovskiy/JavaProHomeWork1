package HomeWork1Bet;

import java.util.Scanner;

public class BetMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите ставку 1:");
        int myBet1 = reader.nextInt();
        System.out.println("Введите ставку 2:");
        int myBet2 = reader.nextInt();
        Bet bet1 = new Bet(myBet1);
        Bet bet2 = new Bet(myBet2);
        boolean comparisonEquals = bet1.equals(bet2);
        boolean comparisonHashcode = bet1.hashCode() == bet2.hashCode();
        System.out.println("Ставка 1:" + " " + bet1.getMyBet() + "." + " " + "Ставка 2:" +
                " " + bet2.getMyBet() + "." + " " + "\nСтавки одинаковые по equals?" + " " + comparisonEquals +
                "\nСтавки одинаковые по hashcode?" + " " + comparisonHashcode);

    }
}
