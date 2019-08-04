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
public class Tutor {
    private int mistakes;
    private Lesson lesson;
    
    public Tutor (){
        
    }
    
    public Tutor(Lesson lesson){
        this.lesson = lesson;
    }
    
    public Cards[] remainingCards(){
        Cards[] cards = null;
        cards[0] = new Cards();
        return cards;
    }
    
    public String helpMe(Board board){
        return "";
    }
    
    public String explain(Lesson lesson){
        return "";
    }
    
    public void playHand(Board board){
        
    }
}
