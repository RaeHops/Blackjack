public class Card {

    public String suit;

    public int value;
    public String type;

    public void print() {
        System.out.println("the " + type + " of " + suit + " is worth " + value + " points.");
    }


    public Card(int pType, int pSuit) {

        if (pType == 0) {
            type = "Ace";
            value = 11;
        } else if (pType == 1) {
            type = "Two";
            value = 2;
        } else if (pType == 2) {
            type = "Three";
            value = 3;
        } else if (pType == 3) {
            type = "Four";
            value = 4;
        } else if (pType == 4) {
            type = "Five";
            value = 5;
        } else if (pType == 5) {
            type = "Six";
            value = 6;
        } else if (pType == 6) {
            type = "Seven";
            value = 7;
        } else if (pType == 7) {
            type = "Eight";
            value = 8;
        } else if (pType == 8) {
            type = "Nine";
            value = 9;
        } else if (pType == 9) {
            type = "Ten";
            value = 10;
        } else if (pType == 10) {
            type = "Jack";
            value = 10;
        } else if (pType == 11) {
            type = "Queen";
            value = 10;
        } else if (pType == 12) {
            type = "King";
            value = 10;
        }

        if (pSuit == 0) {
            suit = "Spades";

        } else if (pSuit == 1) {
            suit = "Hearts";

        } else if (pSuit == 2) {
            suit = "Clubs";

        } else if (pSuit == 3) {
            suit = "Diamonds";

        }

    }
}
