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
    
    public Player(){
        
    }
    
    public Player(Cards[] hand){
        this.hand = hand;
    }
    
    public void play(Cards card){
        for (int i = 0; i < 13; i++) {
            if (hand[i] == card) {
                hand[i] = null;
            }
        } // maybe return card played and give parameter as a user input
        
    }
    
    public Cards[] getHand(){
        return hand;
    }
}
