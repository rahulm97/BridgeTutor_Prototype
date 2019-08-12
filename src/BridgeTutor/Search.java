/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgeTutor;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Search{

 public String Search(String a) { // search using a variable or the input of the username from LoginGui

    File file = new File("data.txt");
    String username =a;
    String s="";
  
    try {
        //loop through the file until the username has been found 
        Scanner sc = new Scanner(file).useDelimiter( ",");
        while (sc.hasNext()) {
            final String line = sc.nextLine();
            if (line.contains(username)) {
                s=username;
                //if the username is in the file then set the variable s to the name
                break;  
            }
            else{ //username is not found
                s="User Not Registered";
            }
        }
    } catch (IOException e) {
        s="";
    }
    return s;
 }
}