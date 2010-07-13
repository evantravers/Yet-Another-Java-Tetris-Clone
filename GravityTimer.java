public class GravityTimer implements Runnable {

	Board gameBoard;

	public GravityTimer(Board b) {

		gameBoard = b;
	}

	public void run() {

		while(true)
		{
			try { Thread.sleep(250); } catch(InterruptedException e) { }
			gameBoard.gravity();
			Thread.yield();
		}
	}

}
