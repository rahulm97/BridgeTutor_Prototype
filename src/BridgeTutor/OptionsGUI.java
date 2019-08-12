/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgeTutor;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JCheckBox;
public class OptionsGUI extends JFrame implements ActionListener{
    public static void main(String[] args){
    SwingUtilities.invokeLater(new Runnable() {
   public void run() {
    JFrame oth= new LoginGUI();
    oth.setVisible(true);
  
           
        }
    });
}
/**Initializing all the variables
**/
JLabel stratlabel, difflabel, stratlabcon, difflabcon;
JTextField txf1, txf2;
JButton lessonSbtn;
JCheckBox Strategy_1, Strategy_2, Strategy_3, Strategy_4, diff_1, diff_2, diff_3;
  
    OptionsGUI() {
         //setting the components of the options/home page gui and the dimensions of all the components
         super("Home Page");
         setContentPane(new JLabel(new ImageIcon("background.jpg")));
             //selecting the strategy
        stratlabel = new JLabel("STRATEGIES");
        stratlabel.setBounds(100, 20, 450, 30);
        stratlabel.setForeground(Color.black);
        stratlabel.setFont(new Font("Calibri", Font.BOLD, 20));

         Strategy_1= new JCheckBox("Strategy 1");
         Strategy_1.setBounds(100, 60, 100, 20);
         Strategy_1.addActionListener(this);
         Strategy_2 = new JCheckBox("Strategy 2");
         Strategy_2.setBounds(100,80 , 140, 20);
         Strategy_2.addActionListener(this);
         Strategy_3 = new JCheckBox("Strategy 3");
         Strategy_3.setBounds(100,100, 160, 20);
         Strategy_3.addActionListener(this);
         Strategy_4 = new JCheckBox("Strategy 4");
         Strategy_4.setBounds(100,120, 180, 20);
         Strategy_4.addActionListener(this); 
         
         //selecting the difficulty
         
        difflabel = new JLabel("DIFFICULTY");
        difflabel.setBounds(100, 180, 450, 30);
        difflabel.setForeground(Color.black);
        difflabel.setFont(new Font("Calibri", Font.BOLD, 20));
      
         diff_1= new JCheckBox("Beginner");
         diff_1.setBounds(100, 220, 100, 20);
         diff_1.addActionListener(this);
         diff_2 = new JCheckBox("Intermediate");
         diff_2.setBounds(100,240 , 140, 20);
         diff_2.addActionListener(this);
         diff_3 = new JCheckBox("Expert");
         diff_3.setBounds(100,260, 160, 20);
         diff_3.addActionListener(this);
         
        //start lessons button 
        lessonSbtn = new JButton("START LESSON");
        lessonSbtn.setBounds(100, 400, 100, 20);
        lessonSbtn.addActionListener(this);
        

        txf1 = new JTextField(50);
        txf1.setBounds(100, 300, 200, 20);
        
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 450);
        setLayout(null);
 
        //Add components to the JFrame
        add(lessonSbtn);
        add(stratlabel);
        add(difflabel);
        add(Strategy_1);
        add(Strategy_4);
        add(Strategy_3);
        add(Strategy_2);
        add(diff_1);
        add(diff_2);
        add(diff_3);
        add(txf1);
       
               
       

            }
  // method for each strategy and level of difficulty 
 
    public void actionPerformed(ActionEvent e){
 
    if (e.getSource() == Strategy_1){
       txf1.setText("Stategy 1");
   
       }
    else if(e.getSource() == Strategy_4){
         txf1.setText("Stategy 2");
       
        }
     
    else if(e.getSource() == Strategy_3){
        txf1.setText("Stategy 3");
      
        }
       
    else if(e.getSource() == Strategy_2){
         txf1.setText("Stategy 4");
        
        }
    else if(e.getSource() == diff_1){
         txf1.setText("Beginner");
     
        }
    else if(e.getSource() == diff_2){
         txf1.setText("Intermediate");
       
        }
    else if(e.getSource() == diff_3){
         txf1.setText("Expert");
        
        }
    else{
      if(e.getSource() == lessonSbtn){
         GameGUI s= new GameGUI();
         //start lessons by moving to next GUI
        }
      }
   
 
    
    
    
}
    
}
