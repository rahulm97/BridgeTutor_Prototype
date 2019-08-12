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
    
    public Player(Cards[] hand, String name){
        this.hand = hand;
        this.name = name;
    }
    
    /*public void play(Cards card){ //use buttons for input of cards, if clicked hide...
        for (int i = 0; i < 13; i++) {
            if (hand[i] == card) {
                hand[i] = null;
            }
        } // maybe return card played and give parameter as a user input
        
    }*/
     public void removeCard(Cards card){
         ///System.out.println("removed method");
         //System.out.println("\nplayer name " + name);
        
         
         //System.out.println("card: " + );
        // System.out.println("\nplayer removed " + name);
        for (int i = 0; i < 13; i++) {
            
            if(card.toString().equals((this.hand[i]).toString())){
                //System.out.println("card: " + card.toString());
                
                this.hand[i] = new Cards(Cards.Suit.NONE, Cards.CardValue.ZERO);
                
               
               
            }
            else{
                
            }
           // System.out.print(this.hand[i] + " ");
        }
    }
     
    public Cards[] getHand(){
        return hand;
    }
    
    public String getName(){
        return name;
    }
}
