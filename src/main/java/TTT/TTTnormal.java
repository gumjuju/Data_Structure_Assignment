/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TTT;

/**
 *
 * @author HP
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TTTnormal implements ActionListener{

    Random rand = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;
    int tiles = 9;
    
    public void set5x5(){
        this.buttons = new JButton[25];
        this.tiles =25;
    }
    
    
    TTTnormal(){
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400,400);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        textField.setBackground(new Color(25,25,25));
        textField.setForeground(new Color(25,255,0));
        textField.setFont(new Font("Ink Fres",Font.BOLD,75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("TicTacToe");
        textField.setOpaque(true);
        
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,400,100);
        
        
        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(150,150,150));
        
        for(int i=0; i<tiles; i++){
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        
        title_panel.add(textField);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);
        
        firstTurn();
    }
    
    
    public void firstTurn() {
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        if(rand.nextInt(2)==0){
            
            textField.setText("X turn");
        }
        
        else{
            player1_turn=true;
            textField.setText("X turn");
                }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0; i<tiles; i++){
            if(e.getSource()==buttons[i]){
                if(player1_turn){
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        player1_turn=false;
                        textField.setText("O turn");
                        check();
                    }
                }
                else{
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("O");
                        player1_turn=true;
                        textField.setText("X turn");
                        check();
                    }
                }
            }
        }
    }
    
    
    
    public void check(){
        if(
                (buttons[0].getText()=="X")&&
                (buttons[1].getText()=="X")&&
                (buttons[2].getText()=="X")
                ){
            xWins(0, 1, 2);
        }
        if(
                (buttons[3].getText()=="X")&&
                (buttons[4].getText()=="X")&&
                (buttons[5].getText()=="X")
                ){
            xWins(3, 4, 5);
        }if(
                (buttons[6].getText()=="X")&&
                (buttons[7].getText()=="X")&&
                (buttons[8].getText()=="X")
                ){
            xWins(6, 7, 8);
        }if(
                (buttons[0].getText()=="X")&&
                (buttons[3].getText()=="X")&&
                (buttons[6].getText()=="X")
                ){
            xWins(0, 3, 6);
        }if(
                (buttons[1].getText()=="X")&&
                (buttons[4].getText()=="X")&&
                (buttons[7].getText()=="X")
                ){
            xWins(1, 4, 7);
        }if(
                (buttons[2].getText()=="X")&&
                (buttons[5].getText()=="X")&&
                (buttons[8].getText()=="X")
                ){
            xWins(2, 5, 8);
        }if(
                (buttons[0].getText()=="X")&&
                (buttons[4].getText()=="X")&&
                (buttons[8].getText()=="X")
                ){
            xWins(0, 4, 8);
        }if(
                (buttons[2].getText()=="X")&&
                (buttons[4].getText()=="X")&&
                (buttons[6].getText()=="X")
                ){
            xWins(2, 4, 6);
        }
        
        if(
                (buttons[0].getText()=="O")&&
                (buttons[1].getText()=="O")&&
                (buttons[2].getText()=="O")
                ){
            oWins(0, 1, 2);
        }
        if(
                (buttons[3].getText()=="O")&&
                (buttons[4].getText()=="O")&&
                (buttons[5].getText()=="O")
                ){
            oWins(3, 4, 5);
        }if(
                (buttons[6].getText()=="O")&&
                (buttons[7].getText()=="O")&&
                (buttons[8].getText()=="O")
                ){
            oWins(6, 7, 8);
        }if(
                (buttons[0].getText()=="O")&&
                (buttons[3].getText()=="O")&&
                (buttons[6].getText()=="O")
                ){
            oWins(0, 3, 6);
        }if(
                (buttons[1].getText()=="O")&&
                (buttons[4].getText()=="O")&&
                (buttons[7].getText()=="O")
                ){
            oWins(1, 4, 7);
        }if(
                (buttons[2].getText()=="O")&&
                (buttons[5].getText()=="O")&&
                (buttons[8].getText()=="O")
                ){
            oWins(2, 5, 8);
        }if(
                (buttons[0].getText()=="O")&&
                (buttons[4].getText()=="O")&&
                (buttons[8].getText()=="O")
                ){
            oWins(0, 4, 8);
        }if(
                (buttons[2].getText()=="O")&&
                (buttons[4].getText()=="O")&&
                (buttons[6].getText()=="O")
                ){
            oWins(2, 4, 6);
        }
    }
    
    public void xWins(int a,int b, int c){
        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);
        
        for (JButton button : buttons){
            button.setEnabled(false);
        }
        textField.setText("X wins");
    }
    
    public void oWins(int a,int b, int c){
        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);
        
        for (JButton button : buttons){
            button.setEnabled(false);
        }
        textField.setText("O wins");
    }
}
