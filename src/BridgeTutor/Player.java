/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgeTutor;

/**
 *
 * @author GAM
 */
public class Player {

    private String name;
    private Cards[] bestPlay;
    private Player partner;
    private Cards[] hand;

    public Player() {

    }

    public Player(Cards[] hand, String name) {
        this.hand = hand;
        this.name = name;
    }

    public void removeCard(Cards card) {
        for (int i = 0; i < 13; i++) {

            if (card.toString().equals((this.hand[i]).toString())) { //determining which card is set to be removed
                this.hand[i] = new Cards(Cards.Suit.NONE, Cards.CardValue.ZERO); // setting removed card to an irrelevant card
            }
        }
    }

    public Cards[] getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }
}
