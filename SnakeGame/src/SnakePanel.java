import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


@SuppressWarnings("serial")
public class SnakePanel extends JPanel implements ActionListener {

	JPanel hoofdpaneel = new JPanel();
	hoofdpaneel.setBackground(Color.red);
	hoofdpaneel.setBounds(0,0,50,50);
	
	
    SnakePanel() {
		
	}
	
	public void StartGame() {
		
	}
	
	public void paintComponent (Graphics g) {
		
	}
	
	public void draw(Graphics g) {
		
	}
	
	public void move() {
		
	}
	
	public void Appels() {
		
	}
	
	public void Botsingen() {
		
	}
	
	public void GameOver(Graphics g) {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	}
	
	public static void main(String[] args) {
	   
		JFrame frame = new JFrame("SNAKE-VUB");
		frame.setSize(800,800);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		    
	    frame.setVisible(true);
		frame.setResizable(false);
	    frame.getContentPane().setBackground(Color.blue);
	    JPanel hoofdpaneel = new SnakePanel();	        
	    frame.add(hoofdpaneel);
		
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
		
		
	}
}