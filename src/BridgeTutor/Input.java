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
 *
 */
public class Input {

    private String[] bid, west, north, east, south, best;
    private String level, bidder, firstCard;

    public Input() {
        readFiles();
    }

    public void readFiles() {

        String fileName = "bridgeExample.txt"; // Reads in given textfile name
        String fN = "Input.txt"; //Creates new streamlined textfile

        String line = "";
        String lines = "";

        try {

            FileReader fileReader = new FileReader(fileName); //read from given textfile

            BufferedReader bR = new BufferedReader(fileReader);// wrap the given textfile in a buffered reader
            line = bR.readLine();

            FileWriter fileWriter = new FileWriter(fN);//write to new textfile
            BufferedWriter bR2 = new BufferedWriter(fileWriter);//wrap new textfile in buffered reader

            while (line != null) {

                if (!line.contains("//")) //removing comments from given textfile
                {
                    bR2.write(line + "\n");
                }
                line = bR.readLine();
                if (line.equals("CLAIM")) {
                    break;
                }
            }

            bR.close();
            bR2.close();

            FileReader fR = new FileReader(fN);// reading new textfile

            Scanner sc = new Scanner(fR);
            BufferedReader bR3 = new BufferedReader(fileReader);

            lines = sc.nextLine();
            level = lines; //determining the level of difficulty

            lines = sc.nextLine();

            bidder = lines.substring(0, 2); //determining who is the initial bidder

            bid = lines.substring(2).split(" "); //what the bid is

            String players = sc.nextLine();
            west = players.substring(0, players.length() - 1).split(",");//The cards generated to west
            players = sc.nextLine();
            north = players.substring(0, players.length() - 1).split(",");//The cards generated to north
            players = sc.nextLine();
            east = players.substring(0, players.length() - 1).split(",");//The cards generated to east
            players = sc.nextLine();
            south = players.substring(0, players.length() - 1).split(",");//The cards generated to south

            firstCard = sc.nextLine(); //finding what the first card to be played is
            best = new String[10]; // the best possible sequence of events
            if (sc.hasNextLine()) {
                for (int i = 0; i < 10; i++) {
                    String bestPlay = sc.nextLine();
                    best[i] = bestPlay.substring(0, bestPlay.length() - 1); // adding the best possible plays to an array
                }
            }
        } catch (FileNotFoundException ex) { // error handling
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");

        }
    }

    public String getLevel() { 
        return level;
    }

    public String getBidder() {
        return bidder;
    }

    public String getFirstCard() {
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

    public String[] getEast() {
        return east;
    }

    public String[] getSouth() {
        return south;
    }

    public String getBest(int trick) { //string method which returns the best possible play for a particular hand
        return best[trick];
    }
}
