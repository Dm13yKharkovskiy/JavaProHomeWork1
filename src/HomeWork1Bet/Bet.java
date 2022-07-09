package HomeWork1Bet;

import java.util.Objects;

class Bet {
    private int myBet;

    public Bet(int myBet) {
        this.myBet = myBet;

    }

    public void setMyBet(int myBet) {

        this.myBet = myBet;
    }

    public int getMyBet() {
        return myBet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bet bet = (Bet) o;
        return myBet == bet.myBet;
    }

    @Override
    public int hashCode() {

        return Objects.hash(myBet);
    }
}
