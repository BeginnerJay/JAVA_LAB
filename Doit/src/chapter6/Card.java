package chapter6;

public class Card {
    private static int serialNum = 10000;
    private int cardNum;
    Card() {
        serialNum++;
        cardNum = serialNum;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }
}
