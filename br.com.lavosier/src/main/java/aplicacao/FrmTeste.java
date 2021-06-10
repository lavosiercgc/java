package aplicacao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import services.ConsultaBanco;
import services.ServicePessoa;

public class FrmTeste extends JFrame {

	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public static JTextField textNome;
	public static JTextField textEmail;
	public static JTextField textId;

	ServicePessoa sp = new ServicePessoa();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTeste frame = new FrmTeste();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws UnsupportedLookAndFeelException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws ClassNotFoundException
	 */

	public FrmTeste() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			UnsupportedLookAndFeelException {

		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Nome Completo:");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel lblEmailValido = new JLabel("Email Valido:");
		lblEmailValido.setForeground(Color.BLUE);
		lblEmailValido.setFont(new Font("Tahoma", Font.BOLD, 12));

		textNome = new JTextField();
		textNome.setColumns(10);

		textEmail = new JTextField();
		textEmail.setColumns(10);

		final JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sp.cadastroPessoa(textNome.getText(), textEmail.getText());
				textNome.setText("");
				textEmail.setText("");
			}
		});

		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(Color.BLUE);
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setForeground(Color.BLUE);
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaBanco cb = new ConsultaBanco();
				btnNewButton.setEnabled(false);
				textNome.setEnabled(false);
				textEmail.setEnabled(false);
				System.out.println(cb);
			}
		});

		JButton btnLimpar = new JButton("Limpar Campos");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNome.setEnabled(true);
				textEmail.setEnabled(true);
				textId.setText("");
				textNome.setText("");
				textEmail.setText("");
				btnNewButton.setEnabled(true);
			}
		});
		btnLimpar.setForeground(Color.BLUE);
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.BLUE);

		textId = new JTextField();
		textId.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textNome, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
						.addComponent(lblEmailValido)
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(btnNewButton)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnConsultar).addGap(18)
								.addComponent(btnLimpar).addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblNewLabel)
								.addPreferredGap(ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1).addGap(20).addComponent(textId, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(textEmail, GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
				.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(textId, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGap(11)
						.addComponent(textNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(lblEmailValido).addGap(18)
						.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton)
								.addComponent(btnConsultar).addComponent(btnLimpar).addComponent(btnSair))
						.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}

	public static JTextField getTextNome() {
		return textNome;
	}

	public static void setTextNome(JTextField textNome) {
		FrmTeste.textNome = textNome;
	}

	public static JTextField getTextEmail() {
		return textEmail;
	}

	public static void setTextEmail(JTextField textEmail) {
		FrmTeste.textEmail = textEmail;
	}

	public static JTextField getTextId() {
		return textId;
	}

	public static void setTextId(JTextField textId) {
		FrmTeste.textId = textId;
	}
}
