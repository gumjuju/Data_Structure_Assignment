package SuzumeGUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.KeyEvent; 

public class SuzumeFrame extends JFrame{
    
    private SuzumeFloor floor;
    private SuzumeComponent suzumeComponent;
    
    
    
    public SuzumeFrame(final String title, SuzumeFloor floor) throws HeadlessException {
	super(title);
	this.floor = floor;
	this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	suzumeComponent = new SuzumeComponent(floor);
	floor.createPlayer(suzumeComponent, floor);
	setKeyStrokes();

	this.setLayout(new BorderLayout());
	this.add(suzumeComponent, BorderLayout.CENTER);
	this.pack();
	this.setVisible(true);
    }
    
    public SuzumeComponent getSuzumeComponent() {
	return suzumeComponent;
    }
    
    private boolean askUser(String question) {
	return JOptionPane.showConfirmDialog(null, question, "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }
    
    private void setKeyStrokes() {
	KeyStroke stroke = KeyStroke.getKeyStroke(KeyEvent.VK_W, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
	suzumeComponent.getInputMap().put(stroke, "q");
	suzumeComponent.getActionMap().put("q", quit);
    }
    
    private final Action quit = new AbstractAction(){
	public void actionPerformed(ActionEvent e) {
		dispose();
	    
	}
    };
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
