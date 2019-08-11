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

            south =input.getSouth();
            east =input.getEast();
            north = input.getNorth();
            
            return hand;
        }
    
    public Cards toCard(String convert) {
        Cards cardWanted = new Cards();
        for (int i = 0; i < 4; i++) {
            if (convert.substring(1).equals(suits[i].toString())) {
                for (int j = 0; j < 13; j++) {
                    if (convert.substring(0, 1).equals(values[j].toString())) {
                        cardWanted = cards[i*13+j];
                        break;
                    }
                }
            }
            
        }
        return cardWanted;
    }
    
    public Cards[] getWestHand(){
        Cards[] hand = new Cards[13];
         String [] west = input.getWest();
            int count = 0;
            int position = 0;
            for(String x: west){
                
                //lenggth of array + 1
                switch(x.substring(0, 1)) {
                    case "S":
                        for (int j = 1; j < x.length(); j++) {
                            
                            String firstLetter = x.substring(j,j+1);
                            
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[0], values[k]);
                                    hand[position] = temp;
                                    position++;
                                   
                                }
                            }
                            
                        }
                        break;
                    case "H":
                        for (int j = 1; j < x.length(); j++) {
                            
                            String firstLetter = x.substring(j,j+1);
                            //position = x.indexOf("H")-1;
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[1], values[k]);
                                    hand[position] = temp;
                                    position++;
                                    
                                }
                            }
                            
                        }
                        break;
                    case "D":
                        for (int j = 1; j < x.length(); j++) {
                           
                            String firstLetter = x.substring(j,j+1);
                            //int position = x.indexOf("D")-1;
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[2], values[k]);
                                    hand[position] = temp;
                                    position++;
                                    
                                }
                            }
                            
                        }
                        break;
                    case "C":
                        for (int j = 1; j < x.length(); j++) {
                           
                            String firstLetter = x.substring(j,j+1);
                            //int position = x.indexOf("H")-1;
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[3], values[k]);
                                    hand[position] = temp;
                                    position++;
                                   
                                }
                            }
                            
                        }
                        break;
                }
                   
                }
            return hand;
    }
    public Cards[] getNorthHand(){
        Cards[] hand = new Cards[13];
         String [] north = input.getNorth();
            int position = 0;
            for(String x: north){
                
                switch(x.substring(0, 1)) {
                    case "S":
                        for (int j = 1; j < x.length(); j++) {
                            
                            String firstLetter = x.substring(j,j+1);
                            
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[0], values[k]);
                                    hand[position] = temp;
                                    position++;
                                   
                                }
                            }
                            
                        }
                        break;
                    case "H":
                        for (int j = 1; j < x.length(); j++) {
                            
                            String firstLetter = x.substring(j,j+1);
                            //position = x.indexOf("H")-1;
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[1], values[k]);
                                    hand[position] = temp;
                                    position++;
                                   
                                }
                            }
                            
                        }
                        break;
                    case "D":
                        for (int j = 1; j < x.length(); j++) {
                            
                            String firstLetter = x.substring(j,j+1);
                            //int position = x.indexOf("D")-1;
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[2], values[k]);
                                    hand[position] = temp;
                                    position++;
                                    
                                }
                            }
                            
                        }
                        break;
                    case "C":
                        for (int j = 1; j < x.length(); j++) {
                            
                            String firstLetter = x.substring(j,j+1);
                            //int position = x.indexOf("H")-1;
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[3], values[k]);
                                    hand[position] = temp;
                                    position++;
                                    
                                }
                            }
                            
                        }
                        break;
                }
                }
            return hand;
    }
    public Cards[] getEastHand(){
        Cards[] hand = new Cards[13];
         String [] east = input.getEast();
            int position = 0;
            for(String x: east){
                
                switch(x.substring(0, 1)) {
                    case "S":
                        for (int j = 1; j < x.length(); j++) {
                            
                            String firstLetter = x.substring(j,j+1);
                            
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[0], values[k]);
                                    hand[position] = temp;
                                    position++;
                                   
                                }
                            }
                            
                        }
                        break;
                    case "H":
                        for (int j = 1; j < x.length(); j++) {
                            
                            String firstLetter = x.substring(j,j+1);
                            //position = x.indexOf("H")-1;
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[1], values[k]);
                                    hand[position] = temp;
                                    position++;
                                    
                                }
                            }
                            
                        }
                        break;
                    case "D":
                        for (int j = 1; j < x.length(); j++) {
                           
                            String firstLetter = x.substring(j,j+1);
                            //int position = x.indexOf("D")-1;
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[2], values[k]);
                                    hand[position] = temp;
                                    position++;
                                  
                                }
                            }
                            
                        }
                        break;
                    case "C":
                        for (int j = 1; j < x.length(); j++) {
                           
                            String firstLetter = x.substring(j,j+1);
                            //int position = x.indexOf("H")-1;
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[3], values[k]);
                                    hand[position] = temp;
                                    position++;
                                   
                                }
                            }
                            
                        }
                        break;
                }
                }
            return hand;
    }
    public Cards[] getSouthHand(){
        Cards[] hand = new Cards[13];
         String [] south = input.getSouth();
            int position = 0;
            for(String x: south){
                
                switch(x.substring(0, 1)) {
                    case "S":
                        for (int j = 1; j < x.length(); j++) {
                            
                            String firstLetter = x.substring(j,j+1);
                            
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[0], values[k]);
                                    hand[position] = temp;
                                    position++;
                                    
                                }
                            }
                            
                        }
                        break;
                    case "H":
                        for (int j = 1; j < x.length(); j++) {
                            
                            String firstLetter = x.substring(j,j+1);
                            //position = x.indexOf("H")-1;
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[1], values[k]);
                                    hand[position] = temp;
                                    position++;
                                    
                                }
                            }
                            
                        }
                        break;
                    case "D":
                        for (int j = 1; j < x.length(); j++) {
                           
                            String firstLetter = x.substring(j,j+1);
                            //int position = x.indexOf("D")-1;
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[2], values[k]);
                                    hand[position] = temp;
                                    position++;
               
                                }
                            }
                            
                        }
                        break;
                    case "C":
                        for (int j = 1; j < x.length(); j++) {
                            
                            String firstLetter = x.substring(j,j+1);
                            //int position = x.indexOf("H")-1;
                            for (int k = 0; k < values.length; k++) {
                                if ((firstLetter.equals(values[k].toString().substring(0, 1)))) {
                                    Cards temp = new Cards(suits[3], values[k]);
                                    hand[position] = temp;
                                    position++;
                                    
                                }
                            }
                            
                        }
                        break;
                }
                }
            return hand;
    }
    
    }

