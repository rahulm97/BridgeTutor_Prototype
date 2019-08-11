/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgeTutor;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author rahulmarajh
 */
public class Input {
    private String[] bid, west, north, south, east, best;
    private String level, bidder, firstCard;
    
    public Input(){
        readFiles();
    }
    public void readFiles()
    {
        
    
      
        String fileName = "bridgeExample.txt";
        String fN = "Input.txt";

        
        String line = "";
        String lines = "";

        try {
            
            FileReader fileReader = new FileReader(fileName);

            
            BufferedReader bR = new BufferedReader(fileReader);
            line = bR.readLine();
            
            FileWriter fileWriter = new FileWriter(fN);
            BufferedWriter bR2 = new BufferedWriter(fileWriter);

            while(line!=null)
            {
                
                if(!line.contains("//")) {
                    bR2.write(line+"\n");
                } 
                line=bR.readLine();
                if (line.equals("CLAIM")) {
                    break;
                }
            }
        
            bR.close();
            bR2.close();
            
            FileReader fR = new FileReader(fN);

            Scanner sc = new Scanner(fR);
            BufferedReader bR3 = new BufferedReader(fileReader);
            
            lines = sc.nextLine();
            level = lines;
            
            lines=sc.nextLine();
            
            bidder = lines.substring(0,2);
            
            bid=lines.substring(2).split(" ");
            
            String players = sc.nextLine();
            west=players.substring(0, players.length()-1).split(",");
            players = sc.nextLine();
            north=players.substring(0, players.length()-1).split(",");
            players = sc.nextLine();
            east=players.substring(0, players.length()-1).split(",");
            players = sc.nextLine();
            south=players.substring(0, players.length()-1).split(",");
            
            firstCard = sc.nextLine();
            best = new String [10];
            
            for (int i = 0; i < 10; i++) {
                String bestPlay = sc.nextLine();
                best [i]=bestPlay.substring(0, bestPlay.length()-1);
            }   
            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
    
    public String getLevel(){
        return level;
    }
    
    public String getBidder(){
        return bidder;
    }
    
    public String getFirstCard(){
        return firstCard;
    }
    
    public String[] getBid() {
    return bid;
    }
    
    public String[] getWest() {
    return west;
    }
    
    public String[] getNorth() {
    return north;
    }
    
    public String[] getSouth() {
    return east;
    }
    
    public String[] getBest() {
    return best;
    }
}
