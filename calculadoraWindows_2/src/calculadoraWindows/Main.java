package calculadoraWindows;

import javax.swing.JFrame;
import javax.swing.JTextField;

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