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

    public CardHand() {
        westHand = deck.getWestHand();
        northHand = deck.getNorthHand();
        eastHand = deck.getEastHand();
        southHand = deck.getSouthHand();
        printHands();
    }

    public void printHands() {
        System.out.println("west: ");//displays whose cards are being shown
        for (int i = 0; i < 13; i++) {

            System.out.print(westHand[i] + " "); //displays what cards are available to west.
        }
        System.out.println("\nnorth: ");
        for (int j = 0; j < 13; j++) {

            System.out.print(northHand[j] + " ");
        }
        System.out.println("\neast: ");
        for (int x = 0; x < 13; x++) {

            System.out.print(eastHand[x] + " ");
        }
        System.out.println("\nsouth: ");
        for (int z = 0; z < 13; z++) {

            System.out.print(southHand[z] + " ");
        }
        System.out.println("");
    }

    public Cards[] getWestHand() {
        return westHand;
    }

    public Cards[] getNorthHand() {
        return northHand;
    }

    public Cards[] getEastHand() {
        return eastHand;
    }

    public Cards[] getSouthHand() {
        return southHand;
    }

}
