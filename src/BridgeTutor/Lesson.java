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
public class Lesson {
    private Deck deck;
    private CardHand playerHand;
    private Cards[] correctPlay;
    private String lessonName;
    private int lessonLevel;
    private double successRate;
    private Input input;
    
    public Lesson(){
        input = new Input();
    }
    public void nextLesson() {
        
    }
    public Cards[] bestPlay(int trick){
    Cards[] bestPlay = new Cards[4];   
    String best = input.getBest(trick);
    String[] temp = best.split(",");
        for (int i = 0; i < 10; i++) {
            
        }
    return bestPlay;
    }
}
