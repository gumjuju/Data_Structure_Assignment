/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TTT;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author HP
 */
public class TTT5x5 extends TTTnormalbot{

    @Override
    public void set5x5() {
        super.set5x5(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override 
    public void check(){
        
        if(checkXwin()){
            xWins();
        }
        if(checkOwin()){
            oWins();
        }
        
    }
    
    
    public void oWins(){
        for (JButton button : buttons){
            button.setEnabled(false);
            button.setBackground(Color.GREEN);
        }
        textField.setText("O wins");
    }
    
    public void xWins(){
        for (JButton button : buttons){
            button.setEnabled(false);
            button.setBackground(Color.GREEN);
        }
        textField.setText("O wins");
    }
    
    @Override 
    public boolean checkOwin(){
    
        if(checkVert("O"))return true;
        if(checkHor("O"))return true;
        if(checkDiagonal1("O"))return true;
        if(checkDiagonal2("O"))return true;
        return false;}
    
    @Override 
    public boolean checkXwin(){
        
        if(checkVert("X"))return true;
        if(checkHor("X"))return true;
        if(checkDiagonal1("X"))return true;
        if(checkDiagonal2("X"))return true;
        return false;
    }
    
    public boolean checkVert(String val){
        for(int columntemp =0; columntemp<3;columntemp++){
            if(
                (buttons[0+columntemp].getText()==val)&&
                (buttons[1+columntemp].getText()==val)&&
                (buttons[2+columntemp].getText()==val)
            )return true;
        }
        
        for(int columntemp =5; columntemp<8;columntemp++){
            if(
                (buttons[0+columntemp].getText()==val)&&
                (buttons[1+columntemp].getText()==val)&&
                (buttons[2+columntemp].getText()==val)
            )return true;
        }
        
        for(int columntemp =10; columntemp<13;columntemp++){
            if(
                (buttons[0+columntemp].getText()==val)&&
                (buttons[1+columntemp].getText()==val)&&
                (buttons[2+columntemp].getText()==val)
            )return true;
        }
        
        for(int columntemp =15; columntemp<18;columntemp++){
            if(
                (buttons[0+columntemp].getText()==val)&&
                (buttons[1+columntemp].getText()==val)&&
                (buttons[2+columntemp].getText()==val)
            )return true;
        }
        
        for(int columntemp =20; columntemp<23;columntemp++){
            if(
                (buttons[0+columntemp].getText()==val)&&
                (buttons[1+columntemp].getText()==val)&&
                (buttons[2+columntemp].getText()==val)
            )return true;
        }
        return false;
    }
    
    public boolean checkHor(String val){
        for(int columntemp =0; columntemp<21;columntemp+=5){
            if(
                (buttons[0+columntemp].getText()==val)&&
                (buttons[5+columntemp].getText()==val)&&
                (buttons[10+columntemp].getText()==val)
            )return true;
        }
        
        for(int columntemp =5; columntemp<22;columntemp++){
            if(
                (buttons[1+columntemp].getText()==val)&&
                (buttons[6+columntemp].getText()==val)&&
                (buttons[11+columntemp].getText()==val)
            )return true;
        }
        
        for(int columntemp =10; columntemp<23;columntemp++){
            if(
                (buttons[2+columntemp].getText()==val)&&
                (buttons[7+columntemp].getText()==val)&&
                (buttons[12+columntemp].getText()==val)
            )return true;
        }
        
        for(int columntemp =15; columntemp<24;columntemp++){
            if(
                (buttons[3+columntemp].getText()==val)&&
                (buttons[8+columntemp].getText()==val)&&
                (buttons[13+columntemp].getText()==val)
            )return true;
        }
        
        for(int columntemp =20; columntemp<25;columntemp++){
            if(
                (buttons[4+columntemp].getText()==val)&&
                (buttons[9+columntemp].getText()==val)&&
                (buttons[14+columntemp].getText()==val)
            )return true;
        }
        return false;
    }
    
    public boolean checkDiagonal1(String val){
        if(
                (buttons[0].getText()==val)&&
                (buttons[6].getText()==val)&&
                (buttons[12].getText()==val)
        )return true;
        if(
                (buttons[6].getText()==val)&&
                (buttons[12].getText()==val)&&
                (buttons[18].getText()==val)
        )return true;
        if(
                (buttons[12].getText()==val)&&
                (buttons[18].getText()==val)&&
                (buttons[24].getText()==val)
        )return true;
        if(
                (buttons[1].getText()==val)&&
                (buttons[7].getText()==val)&&
                (buttons[13].getText()==val)
        )return true;
        if(
                (buttons[7].getText()==val)&&
                (buttons[13].getText()==val)&&
                (buttons[19].getText()==val)
        )return true;
        if(
                (buttons[2].getText()==val)&&
                (buttons[8].getText()==val)&&
                (buttons[14].getText()==val)
        )return true;
        if(
                (buttons[5].getText()==val)&&
                (buttons[11].getText()==val)&&
                (buttons[17].getText()==val)
        )return true;
        if(
                (buttons[11].getText()==val)&&
                (buttons[17].getText()==val)&&
                (buttons[23].getText()==val)
        )return true;
        if(
                (buttons[10].getText()==val)&&
                (buttons[16].getText()==val)&&
                (buttons[22].getText()==val)
        )return true;
    return false;
    }
    
    public boolean checkDiagonal2(String val){
        if(
                (buttons[4].getText()==val)&&
                (buttons[8].getText()==val)&&
                (buttons[12].getText()==val)
        )return true;
        if(
                (buttons[8].getText()==val)&&
                (buttons[12].getText()==val)&&
                (buttons[16].getText()==val)
        )return true;
        if(
                (buttons[12].getText()==val)&&
                (buttons[16].getText()==val)&&
                (buttons[20].getText()==val)
        )return true;
        if(
                (buttons[3].getText()==val)&&
                (buttons[7].getText()==val)&&
                (buttons[11].getText()==val)
        )return true;
        if(
                (buttons[7].getText()==val)&&
                (buttons[11].getText()==val)&&
                (buttons[15].getText()==val)
        )return true;
        if(
                (buttons[2].getText()==val)&&
                (buttons[6].getText()==val)&&
                (buttons[10].getText()==val)
        )return true;
        if(
                (buttons[9].getText()==val)&&
                (buttons[13].getText()==val)&&
                (buttons[17].getText()==val)
        )return true;
        if(
                (buttons[13].getText()==val)&&
                (buttons[17].getText()==val)&&
                (buttons[21].getText()==val)
        )return true;
        if(
                (buttons[14].getText()==val)&&
                (buttons[18].getText()==val)&&
                (buttons[22].getText()==val)
        )return true;
    return false;
    }
    
}
