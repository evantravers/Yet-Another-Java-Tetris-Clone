import java.awt.Container;

class Game implements Runnable {
	private Board matrix;
	
	public Game() {
		// needs a board
		matrix = new Board();
		// TODO gravity timer
		Container GUI = new Container();
		GUI.addKeyListener(new InputListener(matrix));
		// TODO scoreboard / thread that also handles lines.
	}
	
	public void run() {
		while (true) {
			// display board
			matrix.display();
			Thread.yield();
			// breakpoint
		}
	}
}
