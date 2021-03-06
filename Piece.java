import java.util.Random;

class Piece {
	private int[][] points;
	// should be 0-4
	private int rotation; 
	private String type;
	
	Random generator = new Random();
	
	// 0, 1, 2, 3, 4, 5, 6
	// I, J, L, O, S, T, Z
	public Piece() {
		// picks a random piece type
		int type = generator.nextInt(7);
		points = setPoints(type);
		
		// randomly rotates
		rotation = generator.nextInt(3);
		for (int i=0;i<rotation ;i++ ) {
			rotateR();
		}
	}
	
	public Piece(int n, int rotation) {
		points = setPoints(n);
		for (int i=0;i<rotation ;i++ ) {
			rotateR();
		}
	}

	public Piece(Piece p) {

		this.points = p.getPoints();
		this.rotation = p.getRotation();
		this.type = p.getType();
	}
	
	public void rotateR() {
		// Completed rotate 90 right
		int[][] temp = new int[4][4];
		for (int x=0;x<4 ;x++ ) {
			for (int y=0;y<4 ;y++ ) {
				temp[x][3-y]=points[y][x];
			}
		}
		this.points=temp;
	}
	
	public void rotateL() {
		// complete rotate code
		rotateR();
		rotateR();
		rotateR();
	}
	
	private int[][] setPoints(int type) {
		int[][] value = new int[4][4];
		switch (type) {
			// line
			case 0:
			value[0][0]=1;
			value[0][1]=1;
			value[0][2]=1;
			value[0][3]=1;
			this.type="I";
			break;
			// J
			case 1: 
			value[1][0]=1;
			value[1][1]=1;
			value[1][2]=1;
			value[0][2]=1;
			this.type="J";
			break;
			// L
			case 2:
			value[0][0]=1;
			value[0][1]=1;
			value[0][2]=1;
			value[1][2]=1;
			this.type="L";
			break;
			// square
			case 3:
			value[0][0]=1;
			value[0][1]=1;
			value[1][0]=1;
			value[1][1]=1;
			this.type="O";
			break;
			// S
			case 4:
			value[1][0]=1;
			value[2][0]=1;
			value[1][1]=1;
			value[0][1]=1;
			this.type="S";
			break;
			// T
			case 5:
			value[0][0]=1;
			value[1][0]=1;
			value[2][0]=1;
			value[1][1]=1;
			this.type="T";
			break;
			// Z
			case 6:
			value[0][0]=1;
			value[1][0]=1;
			value[1][1]=1;
			value[2][1]=1;
			this.type="Z";
			break;			
		}
		return value;
	}

	public int[][] getPoints() {

		return points;
	}

	public String getType() {

		return type;
	}

	public int getRotation() {

		return rotation;
	}
	public String toString() {
		String printString="";
		for (int i=0;i<4 ;i++ ) {
			for (int j=0;j<4 ;j++ ) {
				if (points[i][j]==1) {
					printString+=" "+this.type;
				}
				else {
					printString+="  ";
				}
			}
			printString+="\n";
		}
		return printString;
	}
	
	public static void main(String[] args) {
		System.out.println();
		System.out.println("Here are the pieces:\n");
		for (int i=0;i<7 ;i++ ) {
			Piece tmp = new Piece(i,0);
			System.out.println(tmp);
		}
		System.out.println("Testing Rotation:\n");
		System.out.println(new Piece(2,1));
		System.out.println(new Piece(2,2));
		System.out.println(new Piece(2,3));
		System.out.println(new Piece(2,4));
	}
}
