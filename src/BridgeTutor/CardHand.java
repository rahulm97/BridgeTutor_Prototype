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
    private Cards[] westHand;
    private Cards[] southHand;
    private Cards[] eastHand;
    private Cards[] northHand;
    private Deck deck = new Deck();
    
    public CardHand(){
        westHand = deck.getWestHand();//, 13);
        southHand = deck.getSouthHand();//,26);
        eastHand = deck.getEastHand();//,39);
        northHand = deck.getNorthHand();//,52);
        printHands();
    }
    public void printHands() {
        for (int i = 0; i < 13; i++) {
            System.out.println("west: " + westHand[i]);
        }
        for (int j = 0; j < 13; j++) {
            System.out.println("south: " + southHand[j]);
        }
        for (int x = 0; x < 13; x++) {
            System.out.println("east: " + eastHand[x]);
        }
        for (int z = 0; z < 13; z++) {
            System.out.println("north: " + northHand[z]);
        }
    }
    
    public Cards[] getWestHand(){
        return westHand;
    }
    public Cards[] getSouthHand(){
        return southHand;
    }
    public Cards[] getEastHand(){
        return eastHand;
    }
    public Cards[] getNorthHand(){
        return northHand;
    }
    
}
