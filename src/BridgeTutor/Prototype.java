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
public class Prototype {

    public static void main(String[] args) { //main class to run project
        CardHand hands = new CardHand();
        Player west, north, east, south;
        west = new Player(hands.getWestHand(), "west");
        north = new Player(hands.getNorthHand(), "north");
        east = new Player(hands.getEastHand(), "east");
        south = new Player(hands.getSouthHand(), "south");
        Board board = new Board(west, north, east, south);
        board.play();
    }
}
