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
public class Deck {
    private Cards[] cards = new Cards[52];
    private Cards pop;
    private Cards.CardValue[] values = new Cards.CardValue[13];
    private Cards.Suit[] suits = new Cards.Suit[4];
    public Deck(){
         populate();
    }
    public void populate() {
        values[0] = Cards.CardValue.TWO; //= [Cards.CardValue.TWO, Cards.CardValue.THREE, Cards.CardValue.THREE, Cards.CardValue.THREE, Cards.CardValue.THREE, Cards.CardValue.THREE, Cards.CardValue.THREE, Cards.CardValue.THREE, Cards.CardValue.THREE, Cards.CardValue.THREE, Cards.CardValue.THREE, Cards.CardValue.THREE,Cards.CardValue.THREE];
        values[1] = Cards.CardValue.THREE;
        values[2] = Cards.CardValue.FOUR;
        values[3] = Cards.CardValue.FIVE;
        values[4] = Cards.CardValue.SIX;
        values[5] = Cards.CardValue.SEVEN;
        values[6] = Cards.CardValue.EIGHT;
        values[7] = Cards.CardValue.NINE;
        values[8] = Cards.CardValue.TEN;
        values[9] = Cards.CardValue.JACK;
        values[10] = Cards.CardValue.QUEEN;
        values[11] = Cards.CardValue.KING;
        values[12] = Cards.CardValue.ACE;
        
        suits[0] = Cards.Suit.SPADES;
        suits[1] = Cards.Suit.HEARTS;
        suits[2] = Cards.Suit.DIAMONDS;
        suits[3] = Cards.Suit.CLUBS;
        int i = 0;
        for (Cards.Suit x: suits) {
            for(Cards.CardValue y : values){
                pop = new Cards(x, y);
                cards[i] = pop;
                i++;
            }
        }
        
        for (int j = 0; j < 52; j++) {
            System.out.println(cards[j]);
        }
    }   
        
    public Cards[] shuffle() {
        // make random order of cards to shuffle
    return cards;
    }
}
