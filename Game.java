import javax.swing.*;
import java.awt.*;

class Game implements Runnable {
	
	private Gui gui;
	private Board gameBoard;
	
	public Game() {

		gameBoard = new Board();
		gui = new Gui(gameBoard);
		// GUI setup
		JFrame gameFrame = new JFrame("Yet-Another-Java-Tetris-Clone");
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container content = gameFrame.getContentPane();
		content.add(gui);
		
		// Input Listener Setup
		InputListener l = new InputListener(gameBoard);
		Thread lt = new Thread(l);
		lt.start();
		content.addKeyListener(l);

		gameFrame.pack();
		gameFrame.setVisible(true);
		
		// TODO gravity timer
		// TODO scoreboard / thread that also handles lines.
	}
	
	public void run() {

		gameBoard.add();
		while (true) {

			gameBoard.gravity();
			try{ Thread.sleep(1000); }catch(InterruptedException e) { }
			gui.repaint();
			Thread.yield();
			// breakpoint
		}
	}
}
