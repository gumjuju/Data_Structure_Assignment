/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuzumeGUI;

import Map.FinalMap;
import TTT.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.Arrays;
import page.Exit;
/**
 *
 * @author HP
 */
public class Main {
    static FinalMap map = new FinalMap();
    private static final int TIME_STEP = 30;
    private static Timer clockTimer = null;
    
    public static void main(String[] args) {
        startGame();
    }
    
    public static void startGame() {
	SuzumeFloor floor = new SuzumeFloor(map.getFin());
	SuzumeFrame frame = new SuzumeFrame("Suzume", floor);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	floor.addFloorListener(frame.getSuzumeComponent());

	Action doOneStep = new AbstractAction()
	{
	    public void actionPerformed(ActionEvent e) {
		tick(frame, floor);
	    }
	};
	clockTimer = new Timer(TIME_STEP, doOneStep);
	clockTimer.setCoalesce(true);
	clockTimer.start();
    }
    
      private static void gameOver(SuzumeFrame frame, SuzumeFloor floor) {
	clockTimer.stop();
	frame.dispose();
	Exit launch = new Exit();
        launch.setVisible(true);
    }

    private static void tick(SuzumeFrame frame, SuzumeFloor floor) {
	if (floor.getIsGameOver()) {
	    gameOver(frame, floor);
	} 
        else if(floor.isGetTTT()){
            floor.setGetTTT(false);
            TTTnormalbot tictactoe = new TTTnormalbot();
//            TTT.setVisible(true);
//            frame.add(TTT);
         
        }
        else {
	    floor.notifyListeners();
	}
    }
}
