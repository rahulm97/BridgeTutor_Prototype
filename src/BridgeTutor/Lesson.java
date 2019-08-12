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
    private Cards[] bestPlay = new Cards[4];
    private String lessonName;
    private int lessonLevel;
    private double successRate;
    private Input input;

    public Lesson() {
        input = new Input();
        deck = new Deck();
    }

    public void nextLesson() {

    }

    public Cards[] bestPlay(int trick) {
        String best = input.getBest(trick);
        String[] temp = best.split(",");

        int count = 0;
        for (String x : temp) {
            bestPlay[count] = deck.toCard(x);
            count++;
        }
        return bestPlay;
    }

    public Cards[] getBestPlay() {
        return bestPlay;
    }
}
