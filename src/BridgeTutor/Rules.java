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
public class Rules {

    public Rules() {

    }

    public Cards win(Cards[] cards) {
        Cards highestCard = new Cards();
        return highestCard;
    }

    public boolean checkConditions(CardHand hand) { //determine of all conditions are met
        return true;
    }

    public boolean[] checkHand(Cards[] playerHand, Cards.Suit suit) { // makes an array with position of each card that can be played
        int allowed = 0;

        boolean[] cardsAllowed = new boolean[13];
        for (int i = 0; i < 13; i++) { //ensure that card being played is allowed to be played
            cardsAllowed[i] = false;
        }
        for (int i = 0; i < cardsAllowed.length; i++) {
            if (playerHand[i].getSuit() == suit || playerHand[i].getSuit() == Cards.Suit.HEARTS) { //Ensuring that trump card wins
                cardsAllowed[i] = true;
                allowed++;
            }
        }
        if (allowed == 0) { // if no cards of the same suit player can play any card
            for (int i = 0; i < cardsAllowed.length; i++) {
                cardsAllowed[i] = true;
            }
        }
        return cardsAllowed;
    }
}
