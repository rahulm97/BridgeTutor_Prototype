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
public class CardHand {
    private Cards[] hand1;
    private Cards[] hand2;
    private Cards[] hand3;
    private Cards[] hand4;
    private Deck deck = new Deck();
    public CardHand(){
        hand1 = deck.shuffle(0);//, 13);
        hand2 = deck.shuffle(13);//,26);
        hand3 = deck.shuffle(26);//,39);
        hand4 = deck.shuffle(39);//,52);
        printHands();
    }
    public void printHands() {
        for (int i = 0; i < 13; i++) {
            System.out.println("hand1: " + hand1[i]);
        }
        for (int j = 0; j < 13; j++) {
            System.out.println("hand2: " + hand2[j]);
        }
        for (int x = 0; x < 13; x++) {
            System.out.println("hand3: " + hand3[x]);
        }
        for (int z = 0; z < 13; z++) {
            System.out.println("hand4: " + hand4[z]);
        }
    }
    
}
