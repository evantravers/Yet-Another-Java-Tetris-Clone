class Game implements Runnable {
	private Board matrix;
	
	public Game() {
		// needs a board
		matrix = new Board();
	}
	
	public void run() {
		while (true) {
			// display board
			// matrix.display();
			System.out.println(new Piece(4,1));
			System.out.println(new Piece(4,2));
			System.out.println(new Piece(4,3));
			System.out.println(new Piece(4,4));
			Thread.yield();
			// breakpoint
		}
	}
}