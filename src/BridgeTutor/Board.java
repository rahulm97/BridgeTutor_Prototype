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
    private int trick = 0;
    private int turnCount = 0;
    private Rules rules;
    private Cards[] cardsLeft;
    private Cards[] cardsPlayed;
    private Tutor tutor;
    private Lesson lesson;
    public Board thisBoard;
    private int counter = 0;
    public Board(){
        cardsPlayed=new Cards[4];
        turn = new Player[4];
        rules=new Rules();
        lesson = new Lesson();
        changeTurn("west");
        
        
        
    }
    
    public Board(Player west, Player north, Player east, Player south){
        this.south = south; //makes all the players in the game
        this.north = north; 
        this.west = west;
        this.east = east;
        cardsPlayed=new Cards[4];
        turn = new Player[4];
        rules=new Rules();
        lesson = new Lesson();
        changeTurn("west");
        
        
    }
    
    public void nextTurn(){
        if (turnCount > 3) { // if all players have played reset the counter and check the winner to score the trick, and reset the board
            
            checkWinner();
            
            
            //reset();
        }
        else{ //increase the counter and lets player play
           //cardsPlayed[turnCount] = turn[turnCount].play();
           //add card to card played
           
           play();
           
        }
    }
    
    public void checkWinner() {
        int heartCounter = 0;
        int winner = 0;
        boolean[] hearts = new boolean[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("\n"+cardsPlayed[i].toString());
        }
        //System.out.println("tricks: " + trick + " count : "+ turnCount);
        for (int i = 0; i < 4; i++) {
            if(cardsPlayed[i].getSuit() == Cards.Suit.HEARTS){
                heartCounter++;
                hearts[i] = true;
            }
        }
        if(heartCounter ==0 || heartCounter == 4)
        {
         
         int maximum = (cardsPlayed[0].getValue()).getValue();
        for (int i = 0; i < 3; i++) {
            //System.out.println("i: "+ i);
            //System.out.println("card played: " + cardsPlayed[i].toString());
            if (maximum < (cardsPlayed[i+1].getValue()).getValue()) {
                 maximum = (cardsPlayed[i+1].getValue()).getValue();
                 winner = i+1;
                // System.out.println("normal max: " + maximum + "winner: " + winner);
             }
        }
        
            
            //ADD CONDITION FOR CHECKING OTHER SUITS  
        }
        else if(heartCounter == 1){
                for (int i = 0; i < 4; i++) {
                if(hearts[i] == true) {
                    winner = i;
                }
            }
                }
        else {
             int maximum = (cardsPlayed[0].getValue()).getValue();
        for (int i = 0; i < 3; i++) {
            //System.out.println("i: "+ i);
            //System.out.println("card played: " + cardsPlayed[i].toString());
            if (maximum < (cardsPlayed[i+1].getValue()).getValue()) {
                 maximum = (cardsPlayed[i+1].getValue()).getValue();
                 winner = i+1;
                // System.out.println("hearts max: " + maximum + "winner: " + winner);
             }
        }
        }
        
        turnCount=0;
        
        if ((turn[winner].getName()).equals("west")||(turn[winner].getName()).equals("east")) {
            scoreWE++;
            //System.out.println("west/east");
        }
        else{
            scoreNS++;
            //System.out.println("north/south");
        }
        //turnCount = 0;
       // trick++;
        System.out.println("scoreWE: " + scoreWE);
        System.out.println("scoreNS: " + scoreNS);
        //System.out.println("winner turn: " + turn[winner].getName());
        String winnerName= turn[winner].getName();
        //System.out.println("winner: " + winner + " " + winnerName);
        
        changeTurn(winnerName);
        counter = 0;
           // System.out.println("play");
        reset();
        
        
    
    }
    
    public void changeTurn(String winnerName)
    {
        
        switch(winnerName){
            case "west":
                turn[0]=west;
                turn[1]=north;
                turn[2]=east;
                turn[3]=south;
                break;
            
            case "north":
                
                turn[0]=north;
                turn[1]=east;
                turn[2]=south;
                turn[3]=west;
                break;
                
            case "east":
                
                turn[0]=east;
                turn[1]=south;
                turn[2]=west;
                turn[3]=north;
                break;
                
            case "south":
                
                turn[0]=south;
                turn[1]=west;
                turn[2]=north;
                turn[3]=east;
                break;
        }
        
        
                
    }
    
    public void reset() { //resets the board so players can play the next trick
      //  for (int i = 0; i < 3; i++) { // empty out the cards on table for next trick
       //         cardsPlayed[i] = null;
          //  }
          if (trick>8){
              System.exit(0);
          }
          else{
        trick++;   
        turnCount = 0;
        play();
          }
        
    }
    
    public void play()
    {
        
        int position = 0;
      //  System.out.println("tick: " +trick + "turnCount: " + turnCount);
      Cards[] temp1 = lesson.bestPlay(trick);
      //System.out.println("length: " + temp1.length);
            
                
         //   System.out.println("here: "+(temp1[counter]).toString() + " trick: " + trick + " turn: " + turnCount);
        
            
        
        Cards temp = (lesson.bestPlay(trick))[turnCount];
       // System.out.println("temp: " + temp.toString());
       // System.out.println("temp: "+temp.toString());
        //System.out.println("fhjvfbn "+ turnCount);
        if(turnCount<1){
            
            cardsPlayed[0]=temp;
            
        }
        else{
        boolean[] a = rules.checkHand(turn[turnCount].getHand(), cardsPlayed[0].getSuit());
        
        for (int i = 0; i < 13; i++) {
            
            if(trick >= 8){
            //    System.out.println("equals "+temp.toString());
              //  System.out.println("turn count: " + turnCount);
             //   System.out.println((turn[turnCount].getHand()[i]).toString());
            }
            if((temp.toString()).equals((turn[turnCount].getHand()[i]).toString())){
          //      System.out.println("found " + i);
                position = i;
                
                break;
            }
        }
        if(a[position] == true){
            cardsPlayed[turnCount]=temp;
            //System.out.println("true "+temp+" turn count: "+turnCount);
        }
        else{
            System.out.println("Illegal move");
        }
        
        }
        
       // System.out.println("temp: " + temp);
         turn[turnCount].removeCard(temp);
        counter++;
        turnCount++;
        nextTurn();
        
    }
    
    public void quit(){
        System.exit(0);
    }
    
}
