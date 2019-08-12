/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgeTutor;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class GameGUI extends JFrame implements ActionListener{
    public static void main(String[] args){
    SwingUtilities.invokeLater(new Runnable() {
   public void run() {
    JFrame oth= new OptionsGUI();
    oth.setVisible(true);
  
           
        }
    });
}
    //initialize variables
    JButton hintbtn, lessonsbtn, reversebtn;
    JLabel lessonlab;
    
GameGUI(){
    super("Bridge Lesson");
    //set dimensions and characterisitcs of components
         setContentPane(new JLabel(new ImageIcon("background.jpg")));
        lessonlab = new JLabel("LESSON");
        lessonlab.setBounds(100, 20, 450, 30);
        lessonlab.setForeground(Color.red);
        lessonlab.setFont(new Font("Calibri", Font.BOLD, 20));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        
        hintbtn = new JButton("HINT");
        hintbtn.setBounds(50, 400, 80, 20);
        hintbtn.addActionListener(this);
        
        lessonsbtn = new JButton("LESSONS");
        lessonsbtn.setBounds(200, 400, 80, 20);
        lessonsbtn.addActionListener(this);
        
        reversebtn = new JButton("REVERSE");
        reversebtn.setBounds(400, 400, 80, 20);
        reversebtn.addActionListener(this);
 
        setLayout(null);
        
        //add elements to the panel
        add(lessonlab);
        add(hintbtn);
        add(lessonsbtn);
        add(reversebtn);
    
}
// method to add functionality to the buttons
public void actionPerformed(ActionEvent e){

    if (e.getSource() == hintbtn){
        
     JOptionPane.showMessageDialog(null,"Use an Ace of Spades");
       }
    else if (e.getSource() == lessonsbtn){
     
       }
    else if (e.getSource() == reversebtn){
     
       }
}
}