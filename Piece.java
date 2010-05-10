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
	}
	
	private int[][] getPoints(int type) {
		int[][] value = new int[4][4];
		System.out.println(value);
		switch (type) {
			// line
			case 1:
			value[0][0]=1;
			value[0][1]=1;
			value[0][2]=1;
			value[0][3]=1;
			break;
			// J
			case 2:
			
			break;
			// square
			case 3:
			value[0][0]=1;
			value[0][1]=1;
			value[1][0]=1;
			value[1][1]=1;
			break;			
		}
		return value;
	}
}