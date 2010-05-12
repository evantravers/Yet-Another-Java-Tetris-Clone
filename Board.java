import java.util.ArrayList;

class Board {
	// for modeling/display 
	// should be 10x20
	
	/*
	 0  1  2  3  4  5  6  7  8  9  10
	[ ][ ][ ][ ][T][ ][ ][ ][ ][ ][ ]0
	[ ][ ][ ][T][T][T][ ][ ][ ][ ][ ]1
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]2
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]3
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]4
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]5
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]6
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]7
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]8
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]9
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]10
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]11
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]12
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]13
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]14
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]15
	[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]16
	[L][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]17
	[L][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]18
	[L][L][ ][ ][ ][ ][ ][ ][ ][ ][ ]19
	*/
	
	
	private int matrix[][];
	
	// the current bricks X coord
	private int activeX;
	// Y coord
	private int activeY;
	
	// these are the bricks that are already laid.
	// bricks contain their own rotation, so that should be fine.
	private ArrayList bricks;
	private ArrayList coords;
	
	public Board() {
		// make a new board with nothing on it.
		matrix = new int[10][20];
	}
	
	public void add(Piece p) {
		// add the brick to the list
		bricks.add(p);
		// position it at the top middle of the frame
		activeX=2;
		activeY=0;
	}
	
	public void add() {
		// adds a completely random piece
		bricks.add(new Piece());
		// position it at the top middle of the frame
		activeX=2;
		activeY=0;
	}
	
	public void checkRows() {
		// TODOlooks to see if there any rows to clear
		System.out.println("none here boss");
	}
	
	public void left() {
		// moves the brick to left
		// TODO collision
		activeX--;
	}
	
	public void right() {
		// moves brick to right
		// TODO collision
		activeX++;
	}
	
	public void display() {
		String output = "";
		// TODO implement this graphically
		for (int y=0;y<20 ;y++ ) {
			for (int x=0;x<10 ;x++ ) {
				if (matrix[x][y]==0) {
					output+="[ ]";
				}
				else {
					output+=("["+matrix[x][y]+"]");
				}
			}
			output+=("\n");
		}
		output+=("\n\n");
		System.out.print(output);
	}
	
	public void refresh() {
		for (int i=0;i<bricks.size() ;i++ ) {
			
		}
	}
	
	public void gravity() {
		// move active brick down
		activeY++;
		// TODO detect collision
	}
}