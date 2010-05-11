class Game implements Runnable {
	private Board matrix;
	private Thread t;
	
	public Game() {
		// needs a board
		Board matrix = new Board();
		t = new Thread();
	}
	
	public void run() {
		while (true) {
			// display board
			matrix.display();
			// breakpoint
		}
	}
	
	public void start() {
		if (t == null)
    	{
			t = new Thread(this);
    		t.run();
    	}
	}
}