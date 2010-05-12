class Tetris {
	// main plays a game of tetris
	public static void main(String args[]) {
		String tetrisLogo = " ___________________  ________\n/_  __/ __/_  __/ _ \\/  _/ __/\n / / / _/  / / / , _// /_\\ \\  \n/_/ /___/ /_/ /_/|_/___/___/\n\n";
		
		System.out.println(tetrisLogo);
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