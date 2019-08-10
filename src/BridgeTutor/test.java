/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgeTutor;

/**
 *
 * @author amcgus001
 */
public class test {
    public static void main(String[] args) {
        CardHand hands = new CardHand();
        //Deck deck = new Deck();
        Player south, north, west, east;
        south = new Player(hands.getHand1());
        north = new Player(hands.getHand2());
        west = new Player(hands.getHand3());
        east = new Player(hands.getHand4());
        Board board = new Board(south, north, west, east);
    }
}
