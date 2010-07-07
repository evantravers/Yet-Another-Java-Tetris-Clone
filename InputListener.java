import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class InputListener implements Runnable, KeyListener {

	private Board GB;
	private int k;

	public InputListener(Board b) {
	
		GB = b;
	}

	public void run() {
	
		while(true)
		{
			switch (k)
			{
				case KeyEvent.VK_UP : GB.rotate(); break;
				case KeyEvent.VK_DOWN : GB.gravity(); break;
				case KeyEvent.VK_LEFT : GB.left(); break;
				case KeyEvent.VK_RIGHT : GB.right(); break;
			}
		}
	}

	public void keyTyped(KeyEvent e) {
		//not used
	}	

	public void keyPressed(KeyEvent e) {

		k = e.KEY_PRESSED;
	}

	public void keyReleased(KeyEvent e) {

		k = -1;
	}
}
