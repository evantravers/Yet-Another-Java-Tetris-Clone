class Board {
	private int matrix[][];
	// should be 10x20
	public Board() {
		// make a new board with nothing on it.
		matrix = new int[10][20];
	}
	
	public void checkRows() {
		// looks to see if there any rows to clear
		System.out.println("none here boss");
	}
	
	public void display() {
		for (int i=0;i<10 ;i++ ) {
			for (int j=0;j<20 ;j++ ) {
				System.out.print(matrix[i][j]);
			}
			System.out.print("\n");
		}
	}
}