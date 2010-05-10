import java.util.Random;

class Piece {
	private int[][] points;
	private int rotation; 
	
	Random generator = new Random();
	
	// 0, 1, 2, 3, 4, 5, 6
	// I, J, L, O, S, T, Z
	public Piece() {
		// picks a random piece type
		int type = generator.nextInt(6);
		points = getPoints(type);
		rotation = 0;
	}
	
	public Piece(int n) {
		points = getPoints(n);
		rotation = 0;
	}
	
	private int[][] getPoints(int type) {
		int[][] value = new int[4][4];
		switch (type) {
			// line
			case 0:
			value[0][0]=1;
			value[0][1]=1;
			value[0][2]=1;
			value[0][3]=1;
			break;
			// J
			case 1: 
			value[1][0]=1;
			value[1][1]=1;
			value[1][2]=1;
			value[0][2]=1;
			break;
			// L
			case 2:
			value[0][0]=1;
			value[0][1]=1;
			value[0][2]=1;
			value[1][2]=1;
			break;
			// square
			case 3:
			value[0][0]=1;
			value[0][1]=1;
			value[1][0]=1;
			value[1][1]=1;
			break;
			// S
			case 4:
			value[1][0]=1;
			value[2][0]=1;
			value[1][1]=1;
			value[0][1]=1;
			break;
			// T
			case 5:
			value[0][0]=1;
			value[1][0]=1;
			value[2][0]=1;
			value[1][1]=1;
			break;
			// Z
			case 6:
			value[0][0]=1;
			value[1][0]=1;
			value[1][1]=1;
			value[2][1]=1;
			break;			
		}
		return value;
	}
	public String toString() {
		String printString="";
		for (int i=0;i<4 ;i++ ) {
			for (int j=0;j<4 ;j++ ) {
				printString+=" "+points[i][j];
			}
			printString+="\n";
		}
		return printString;
	}
}