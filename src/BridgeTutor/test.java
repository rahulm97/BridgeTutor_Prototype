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
        Rules rules = new Rules();
        Player south, north, west, east;
        south = new Player(hands.getSouthHand());
        north = new Player(hands.getNorthHand());
        west = new Player(hands.getWestHand());
        east = new Player(hands.getEastHand());
        Board board = new Board(south, north, west, east);
        Lesson lesson = new Lesson();
        Cards[] bestpLAYSADASD = lesson.bestPlay(1);
        for (int i = 0; i < 4; i++) {
            System.out.println("best play: " +bestpLAYSADASD[i]);
        }
        board.nextTurn();
    }
}
