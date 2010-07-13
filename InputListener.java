import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class InputListener implements KeyListener, Runnable {

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
			k = -1;
			Thread.yield();
		}
	}

	public void keyTyped(KeyEvent e) {
		//not used
	}	

	public void keyPressed(KeyEvent e) {

	/*	switch (e.getKeyCode())
		{
			case KeyEvent.VK_UP : GB.rotate(); break;
			case KeyEvent.VK_DOWN : GB.gravity(); break;
			case KeyEvent.VK_LEFT : GB.left(); break;
			case KeyEvent.VK_RIGHT : GB.right(); break;
		}*/

		k = e.getKeyCode();
	}

	public void keyReleased(KeyEvent e) {
		//not used
	}
}
