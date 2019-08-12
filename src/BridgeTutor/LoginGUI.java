/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgeTutor;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class LoginGUI extends JFrame implements ActionListener {
public static void main(String[] args){
    SwingUtilities.invokeLater(new Runnable() {
   public void run() {
    JFrame oth= new LoginGUI();
            oth.setVisible(true);
        }
    });
}
/**Initializing the variables 
**/
JLabel searchlab, userlab, usernlab, passwlab;
JTextField txfuser, txfpass;
JButton inbtn, startbtn;
 JPasswordField password;
   
	LoginGUI() {
        //setting the components of the login gui and the dimensions of all the components
        super("Login");
        setContentPane(new JLabel(new ImageIcon("background.jpg")));
        usernlab = new JLabel("Username:");
        usernlab.setBounds(20, 20, 100, 20);
        passwlab = new JLabel("Password:");
        password = new JPasswordField(20);
        passwlab.setLabelFor(password);
        passwlab.setBounds(20, 40, 100, 20);
        txfpass = new JTextField(20);
        txfpass.setBounds(130, 20, 200, 20);
        password.setBounds(130, 40, 200, 20);
 
        inbtn = new JButton("Sign in");
        inbtn.setBounds(180, 70, 100, 20);
        inbtn.addActionListener(this);

        searchlab = new JLabel("Searching...");
        searchlab.setBounds(100, 100, 450, 30);
        searchlab.setForeground(Color.red);
        searchlab.setFont(new Font("Serif", Font.BOLD, 20));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 250);

        userlab = new JLabel("User:");
        userlab.setBounds(20, 140, 100, 20);
       txfuser = new JTextField(50);
       txfuser.setBounds(130, 140, 200, 20);
	startbtn = new JButton("START");
       startbtn.setBounds(180,190, 100, 20);
        startbtn.addActionListener(this);    
 
                setLayout(null);
 
//adding to the JFrame all the intizalized components
	add(usernlab);
        add(passwlab);
        add(password);
        add(txfpass);
        add(inbtn);
        add(searchlab);
        add(userlab);
        add(txfuser);
	add(startbtn);
        txfuser.setEditable(false);
            }
 
 /** Search method from Search.java Search if the person who is signing in is already a user if they are a user then 
  * print out their name and if they are not state that they are not registered
**/
  
    public void actionPerformed(ActionEvent e){
    if (e.getSource() == inbtn){
        String finduser = txfpass.getText();
        //start search
        Search sc = new Search();
        String result=sc.Search(finduser);
       txfuser.setText(result);
       txfpass.setText("");
       password.setText("");
       }
   else{
      if(e.getSource() == startbtn){
          //move to home page
         OptionsGUI g= new OptionsGUI();
        }
      }
}
}
