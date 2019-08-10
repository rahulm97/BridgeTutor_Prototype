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
public class Board {
    private Player north, south, west, east;
    private int scoreNS, scoreWE;
    private Player[] turn;
    private int turnCount = 0;
    private Rules rules;
    private Cards[] cardsLeft;
    private Cards[] cardsPlayed;
    private Tutor tutor;
    public Board thisBoard;
    
    public Board(){
        
    }
    
    public Board(Player north, Player south, Player west, Player east){
        this.south = south; //makes all the players in the game
        this.north = north; 
        this.west = west;
        this.east = east;
    }
    
    public void nextTurn(){
        if (turnCount > 3) { // if all players have played reset the counter and check the winner to score the trick, and reset the board
            turnCount = 0;
            //checkWinner()
            //incrementScore
            
            reset();
        }
        else{ //increase the counter and lets player play
           //cardsPlayed[turnCount] = turn[turnCount].play();
           //add card to card played
           turnCount++;
        }
    }
    
    public void checkWinner() {
         int winner = 0;
         int maximum = cardsPlayed[0].getValue().getValue();
        for (int i = 0; i < 2; i++) {
            
             if (cardsPlayed[i].getValue().getValue() < cardsPlayed[i+1].getValue().getValue()) {
                 maximum = cardsPlayed[i+1].getValue().getValue();
                 winner = i+1;
             }
            if (winner == 0 || winner == 2) {
                scoreWE++;
            }
            else{
                scoreNS++;
            }
            //ADD CONDITION FOR CHECKING OTHER SUITS
        }
    }
    
    public void reset() { //resets the board so players can play the next trick
        for (int i = 0; i < 3; i++) { // empty out the cards on table for next trick
                cardsPlayed[i] = null;
            }
    }
    
    public void quit(){
        System.exit(0);
    }
    
}
