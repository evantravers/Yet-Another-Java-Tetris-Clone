import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JPanel{

	private Board gameBoard;
	private int width;
	private int height;
	private int x;
	private int y;
	private final int bW = 25;

	public Gui(Board b){
		
		x = b.getMatrix().length + 1;
		y = b.getMatrix()[0].length + 1;
		width = x * (bW + 2);
		height = y * (bW + 1);
		gameBoard = b;
		setPreferredSize(new Dimension(width, height));
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setColor(Color.black);

		drawActivePiece(g2);
		drawDeadBricks(g2);
		g2.setColor(Color.black);
		drawGrid(g2);
		// more?

		g.dispose();
	}

	public void drawGrid(Graphics2D g) {
		
		// Vertical
		for(int i = 1; i <= x; i++)
			g.drawLine(i * bW, bW, i * bW, y * bW);

		// Horizontal
		for(int i = 1; i <= y; i++)
			g.drawLine(bW, i * bW, x * bW, i * bW);
	}

	public void drawActivePiece(Graphics2D g) {
	
		int ax = gameBoard.getActiveX();
		int ay = gameBoard.getActiveY();
		int[][] pMatrix = gameBoard.getActivePiece().getPoints();
		String type = gameBoard.getActivePiece().getType();
		typeColor(type, g);

		for(int y = 0; y < pMatrix.length; y++)
		{
			for(int x = 0; x < pMatrix[y].length; x++)
			{
				if(pMatrix[x][y] == 1)
				{
					g.fillRect((ax+x)*bW + bW, (ay+y)*bW + bW, bW, bW);
				}
			}
		}		
	}

	public void drawDeadBricks(Graphics2D g) {

		String[][] matrix = gameBoard.getMatrix();
		
		for(int x = 0; x < matrix.length; x++)
		{
			for(int y = 0; y < matrix[x].length; y++)
			{	
				if(matrix[x][y] != null)
				{	
					typeColor(matrix[x][y],g);
					g.fillRect(x*bW + bW, y*bW + bW, bW, bW);
				}
			}
		}
	}

	public void typeColor(String type, Graphics2D g) {

                switch (type.charAt(0))
                {
                        case 'I' : g.setColor(Color.red); break;
                        case 'J' : g.setColor(Color.magenta); break;
                        case 'L' : g.setColor(Color.orange); break;
                        case 'Z' : g.setColor(Color.blue); break;
                        case 'S' : g.setColor(Color.green); break;
                        case 'O' : g.setColor(Color.yellow); break;
                        case 'T' : g.setColor(Color.black); break;
                }
	}
}	
