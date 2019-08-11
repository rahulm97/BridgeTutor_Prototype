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
    private Input input;
    public Deck(){
         populate();
         input = new Input();
    }
    public Deck(String textFile){
        
    }
    public void populate() {
        values[0] = Cards.CardValue.TWO; 
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
        
       
    }   
        
    public Cards[] shuffle(int start) {
        String[] west, south, east, north;
        Cards[] hand = new Cards[13];// make random order of cards to shuffle
        for (int i = 0; i < 13; i++) {
            hand[i] = cards[start + i];
            
            //code to use lessons input
            
            int val = 0;
            west = input.getWest();
            for(String x: west){
                switch(x.substring(0, 1)) {
                    case "S":
                        for (int j = 1; j < x.length()-1; j++) {
                            String firstLetter = x.substring(j,j+1);
                            
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    
                                }
                            }
                            
                        }
                    case "H":
                        
                    case "D":
                        
                    case "C":
                        
                }
                    
                }
            }
            south =input.getSouth();
            east =input.getEast();
            north = input.getNorth();
            
            return hand;
        }
    
    }

