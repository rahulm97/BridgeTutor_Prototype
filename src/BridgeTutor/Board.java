/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgeTutor;

import javax.swing.JOptionPane;

/**
 *
 * @author GAM
 */
public class Board {

    private Player north, south, west, east;
    private int scoreNS, scoreWE;
    private Player[] turn; //keeps track of player turns
    private int trick = 0;
    private int turnCount = 0;
    private Rules rules;
    private Cards[] cardsLeft;
    private Cards[] cardsPlayed; //cards on table
    private Tutor tutor;
    private Lesson lesson;
    public Board thisBoard;
    private int counter = 0;

    public Board() {
        cardsPlayed = new Cards[4];
        turn = new Player[4];
        rules = new Rules();
        lesson = new Lesson();
        changeTurn("west"); //start at west

    }

    public Board(Player west, Player north, Player east, Player south) {
        this.south = south; //makes all the players in the game
        this.north = north;
        this.west = west;
        this.east = east;
        cardsPlayed = new Cards[4];
        turn = new Player[4];
        rules = new Rules();
        lesson = new Lesson();
        changeTurn("west");

    }

    public void nextTurn() {
        if (turnCount > 3) { //if turn 4 has passed check the winner for trick
            checkWinner();
        } else {
            play(); //next turn
        }
    }

    public void checkWinner() { //checks cards on table for winner
        int heartCounter = 0; //trumps
        int winner = 0;
        boolean[] hearts = new boolean[4]; //keep track of trumps
        System.out.println("");
        System.out.println("Trick Number " + (trick + 1) + ":");
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            System.out.println(turn[i].getName() + ": " + cardsPlayed[i].toString() + " "); //displays player and card played
        }

        for (int i = 0; i < 4; i++) { //checks for hearts
            if (cardsPlayed[i].getSuit() == Cards.Suit.HEARTS) {
                heartCounter++;
                hearts[i] = true;
            }
        }
        if (heartCounter == 0 || heartCounter == 4) { //default case no trumps

            int maximum = (cardsPlayed[0].getValue()).getValue();
            for (int i = 0; i < 3; i++) {

                if (maximum < (cardsPlayed[i + 1].getValue()).getValue()) { //checks the highest card value
                    maximum = (cardsPlayed[i + 1].getValue()).getValue();
                    winner = i + 1;

                }
            }
        } else if (heartCounter == 1) { //if theres only one trump they win
            for (int i = 0; i < 4; i++) {
                if (hearts[i] == true) {
                    winner = i;
                }
            }
        } else { //2 or 3 trumps then cards are compared
            int maximum = (cardsPlayed[0].getValue()).getValue();
            for (int i = 0; i < 3; i++) {

                if (maximum < (cardsPlayed[i + 1].getValue()).getValue()) {
                    maximum = (cardsPlayed[i + 1].getValue()).getValue();
                    winner = i + 1;

                }
            }
        }

        turnCount = 0;

        if ((turn[winner].getName()).equals("west") || (turn[winner].getName()).equals("east")) {
            scoreWE++; //WE pair wins

        } else {
            scoreNS++; //NS pair wins
        }

        System.out.println("");
        System.out.println("Winner: " + turn[winner].getName()); //display the trick's winner
        System.out.println("");
        System.out.println("scoreWE: " + scoreWE);
        System.out.println("scoreNS: " + scoreNS);

        String winnerName = turn[winner].getName();

        changeTurn(winnerName); //makes winner start the next turn
        counter = 0;

        reset(); //cleans up board

    }

    public void changeTurn(String winnerName) { //takes in the string with winners name and turns accordingly

        switch (winnerName) {
            case "west":
                turn[0] = west;
                turn[1] = north;
                turn[2] = east;
                turn[3] = south;
                break;

            case "north":

                turn[0] = north;
                turn[1] = east;
                turn[2] = south;
                turn[3] = west;
                break;

            case "east":

                turn[0] = east;
                turn[1] = south;
                turn[2] = west;
                turn[3] = north;
                break;

            case "south":

                turn[0] = south;
                turn[1] = west;
                turn[2] = north;
                turn[3] = east;
                break;
        }

    }

    public void reset() { //resets the board so players can play the next trick

        if (trick > 8) {
            System.out.println("CLAIM.");

            if (scoreWE > scoreNS) {
                JOptionPane.showMessageDialog(null, "The winner is: West & East with " + scoreWE + " tricks!");
            } else if (scoreNS > scoreWE) {
                JOptionPane.showMessageDialog(null, "The winner is: North & South with " + scoreNS + " tricks!");
            } else {
                JOptionPane.showMessageDialog(null, "It's a draw!");
            }

        } else {
            trick++;
            turnCount = 0;
            play();
        }

    }

    public void play() { //play the turn

        int position = 0;

        Cards temp = (lesson.bestPlay(trick))[turnCount]; //get the best card to play

        if (turnCount < 1) {

            cardsPlayed[0] = temp; //can play any card

        } else {
            boolean[] a = rules.checkHand(turn[turnCount].getHand(), cardsPlayed[0].getSuit()); //get suits allowed to be played

            for (int i = 0; i < 13; i++) {

                if ((temp.toString()).equals((turn[turnCount].getHand()[i]).toString())) { //sets position equals to position in players hand so they can compare to boolean array of cards that can be played

                    position = i;

                    break;
                }
            }
            if (a[position] == true) { //boolean array checked vs position
                cardsPlayed[turnCount] = temp;

            } else {
                System.out.println("Illegal move"); //doesnt let player play the move
            }

        }

        turn[turnCount].removeCard(temp); //take card away from players hand
        counter++;
        turnCount++;
        nextTurn();

    }

    public void quit() {
        System.exit(0);
    }

}
