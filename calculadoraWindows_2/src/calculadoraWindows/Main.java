package calculadoraWindows;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {

	public static void main(String[] argv) throws Exception {

		JTextField textField = new JTextField();
		textField.setFocusable(false);

		textField.addKeyListener(new MKeyListenerNow());

		JFrame jframe = new JFrame();

		jframe.add(textField);

		jframe.setSize(400, 350);

		jframe.setVisible(true);

	}
}

class MKeyListenerNow extends KeyAdapter{
	@Override
	public void keyPressed(KeyEvent event) {

		char ch = event.getKeyChar();

		if (ch == 'a' || ch == 'b' || ch == 'c') {

			System.out.println(event.getKeyChar());

		}

		if (event.getKeyCode() == KeyEvent.VK_HOME) {

			System.out.println("Key codes: " + event.getKeyCode());

		}
	}
}
