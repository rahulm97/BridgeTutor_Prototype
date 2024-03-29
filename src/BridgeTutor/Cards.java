/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgeTutor;

/**
 *
 * 
 */
public class Cards {

    private Suit suit;
    private CardValue cardValue;

    public enum Suit { //declaring the suits to be used
        NONE,
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS;

        public String toString() { // toString method
            return name().substring(0, 1);
        }
    }

    public enum CardValue { // declaring all possible values of cards
        ZERO(0),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);

        private int cardValue;

        private CardValue(int value) {
            this.cardValue = value;
        }

        public int getValue() {
            return cardValue;
        }

        public String toString() { //toString method for displaying
            if (cardValue < 10) {
                return String.valueOf(cardValue);
            } else {
                return name().substring(0, 1);
            }
        }
    }

    public Cards() {

    }

    public Cards(Suit suit, CardValue cardValue) { //parameterized constructor
        this.cardValue = cardValue;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public CardValue getValue() {
        return cardValue;
    }

    public String toString() {
        return suit + "" + cardValue;
    }

}
