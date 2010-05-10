class Tetris {
	// main plays a game of tetris
	public static void main(String args[]) {
		System.out.println("time to play tetris!");
		Game theGame = new Game();
		Thread t = new Thread(theGame);
		t.run();
	}
	
	// game
	// 	thread that contains
	// 		board
	// 		pieces
	// 		on each moves, waits
}