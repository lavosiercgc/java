package calculadoraWindows;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @Autor Lavosier
 * 
 */

public class FrmCalculadora2 extends JFrame {
	Integer somar = 0, subtrair = 0, multiplicar = 0, dividir = 0;
	Double zero, um, dois, tres, quatro, cinco, seis, sete, oito, nove;
	Double valor1 = 0.0, valor2 = 0.0, resultado = 0.0;
	String operador;

	QuatroOperacoes qo = new QuatroOperacoes();
	Scanner sc = new Scanner(System.in);

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textTela;
	String valorIgual;
	private JTextField textExpressao;

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, UnsupportedLookAndFeelException {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		} catch (IllegalAccessException e) {

		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCalculadora2 frame = new FrmCalculadora2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrmCalculadora2() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 361);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnExibir = new JMenu("Exibir      ");
		mnExibir.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnExibir);

		JMenu mnEditar = new JMenu("Editar      ");

		mnEditar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnEditar);

		JMenu mnAjuda = new JMenu("Ajuda");
		mnAjuda.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnAjuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		textTela = new JTextField();
		textTela.setEditable(false);
		textTela.requestFocus();
		textTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		textTela.setHorizontalAlignment(SwingConstants.RIGHT);
		textTela.setFocusable(isFocusable());
		textTela.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textTela.setColumns(20);

		JButton btnMc = new JButton("MC");
		btnMc.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnMr = new JButton("MR");
		btnMr.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnMs = new JButton("MS");
		btnMs.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnMemoraiMais = new JButton("M+");
		btnMemoraiMais.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnMemoriaMenos = new JButton("M-");
		btnMemoriaMenos.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnVoltar = new JButton("<---");
		btnVoltar.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText("");
				textExpressao.setText("");
			}
		});
		btnCE.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText("");
				textExpressao.setText("");
			}
		});
		btnC.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnMaiMenos = new JButton("+_");
		btnMaiMenos.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnRaiz = new JButton("V'''");
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double valor1 = Double.valueOf(textTela.getText());
				Math.sqrt(valor1);
				String raiz=String.valueOf(Math.sqrt(valor1));
				textTela.setText(raiz);
				textExpressao.setText("Sqrt("+valor1+")");
				
				
			}
		});
		btnRaiz.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		// JButton btnDividir = new JButton("/");
		// btnDividir.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnPercentual = new JButton("%");
		btnPercentual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				QuatroOperacoes qo = new QuatroOperacoes();
				valor2 = Double.valueOf(textTela.getText());

				if (operador.equals("*")) {
					qo.percent(valor1, valor2);
					String resultado = String.valueOf(qo.percent(valor1, valor2));
					textTela.setText(resultado);
				} else{
					textExpressao.setText("operação Invalida");
				}
			}
		});
		btnPercentual.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn1x = new JButton("1/x");
		btn1x.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textTela.getText().equals("0")){
					textTela.setText("0");
				}
				textTela.setText(textTela.getText() + "0");
				textExpressao.setText(textExpressao.getText() + "0");
				zero=0.0;
				
			}
		});
		btn0.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textTela.getText().equals("0")){
					textTela.setText("");
				}
				textTela.setText(textTela.getText() + "1");	
				textExpressao.setText(textExpressao.getText() + "1");
				um = 1.0;
				
				
			}
		});
		btn1.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textTela.getText().equals("0")){
					textTela.setText("");
				}
				textTela.setText(textTela.getText() + "2");
				textExpressao.setText(textExpressao.getText() + "2");
				dois=2.0;
				
			}
		});
		btn2.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textTela.getText().equals("0")){
					textTela.setText("");
				}
				textTela.setText(textTela.getText() + "3");
				textExpressao.setText(textExpressao.getText() + "3");
				tres=3.0;
				
			}
		});
		btn3.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textTela.getText().equals("0")){
					textTela.setText("");
				}
				textTela.setText(textTela.getText() + "4");
				textExpressao.setText(textExpressao.getText() + "4");
				quatro=4.0;
				
			}
		});
		btn4.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textTela.getText().equals("0")){
					textTela.setText("");
				}
				textTela.setText(textTela.getText() + "5");
				textExpressao.setText(textExpressao.getText() + "5");
				cinco=5.0;
				
			}
		});
		btn5.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textTela.getText().equals("0")){
					textTela.setText("");
				}
				textTela.setText(textTela.getText() + "6");
				textExpressao.setText(textExpressao.getText() + "6");
				seis=6.0;
				
			}
		});
		btn6.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textTela.getText().equals("0")){
					textTela.setText("");
				}
				textTela.setText(textTela.getText() + "7");
				textExpressao.setText(textExpressao.getText() + "7");
				sete=7.0;
				
			}
		});
		btn7.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textTela.getText().equals("0")){
					textTela.setText("");
				}
				textTela.setText(textTela.getText() + "8");
				textExpressao.setText(textExpressao.getText() + "8");
				oito=8.0;
				
			}
		});
		btn8.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textTela.getText().equals("0")){
					textTela.setText("");
				}
				textTela.setText(textTela.getText() + "9");
				textExpressao.setText(textExpressao.getText() + "9");
				nove=9.0;
				
				
			}
		});
		btn9.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textExpressao.setText(textTela.getText() + "/");
				valor1 = Double.valueOf(textTela.getText());
				textTela.setText("");
				textTela.setText("/");
				operador = textTela.getText();
				textTela.setText("");
				dividir = 1;
			}
		});
		btnDividir.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnVezes = new JButton("*");
		btnVezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textExpressao.setText(textTela.getText() + "*");
				valor1 = Double.valueOf(textTela.getText());
				textTela.setText("");
				textTela.setText("*");
				operador = textTela.getText();
				textTela.setText("");
				multiplicar = 1;
			}
		});
		btnVezes.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textExpressao.setText(textTela.getText() + "-");
				valor1 = Double.valueOf(textTela.getText());
				textTela.setText("");
				textTela.setText("-");
				operador = textTela.getText();
				textTela.setText("");
				subtrair = 1;
			}
		});
		btnMenos.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnMais = new JButton("+");
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
				textExpressao.setText(textTela.getText() + "+");
				valor1 = Double.valueOf(textTela.getText());
				textTela.setText("");
				textTela.setText("+");
				operador = textTela.getText();
				textTela.setText("");
				somar = 1;

			}
		});
		btnMais.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				QuatroOperacoes qo = new QuatroOperacoes();
				valor2 = Double.valueOf(textTela.getText());

				if (operador.equals("+")) {
					qo.somar(valor1, valor2);
					String resultado = String.valueOf(qo.somar(valor1, valor2));
					textTela.setText(resultado);

				} else if (operador.equals("-")) {
					qo.subtrair(valor1, valor2);
					String resultado = String.valueOf(qo.subtrair(valor1, valor2));
					textTela.setText(resultado);
				} else if (operador.equals("*")) {
					qo.multiplicar(valor1, valor2);
					String resultado = String.valueOf(qo.multiplicar(valor1, valor2));
					textTela.setText(resultado);
				} else if (operador.equals("/")) {
					qo.dividir(valor1, valor2);
					String resultado = String.valueOf(qo.dividir(valor1, valor2));
					textTela.setText(resultado);
				} else {
					System.out.println("operador desconhecido");
				}if(dois==2){
					System.out.println("agora foi");
					}um=0.0;dois=0.0;tres=0.0;quatro=0.0;cinco=0.0;seis=0.0;sete=0.0;oito=0.0;nove=0.0;

			}
		});
		btnIgual.setFont(new Font("Segoe UI", Font.PLAIN, 16));

		JButton button_22 = new JButton(",");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textTela.getText().equals(".")){
					textTela.setText("");
				}
				textTela.getText();
				textExpressao.getText();
				textTela.setText(textTela.getText()+".");
				textExpressao.setText(textExpressao.getText()+".");
			}
		});
		button_22.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		textExpressao = new JTextField();
		textExpressao.setEditable(false);
		textExpressao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		textExpressao.setHorizontalAlignment(SwingConstants.RIGHT);
		textExpressao.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textExpressao.setColumns(20);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap().addGroup(gl_contentPane
								.createParallelGroup(
										Alignment.LEADING)
								.addGroup(Alignment.TRAILING,
										gl_contentPane.createSequentialGroup()
												.addComponent(btnMc, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btnMr, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(btnMs, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addGap(14)
												.addComponent(btnMemoraiMais, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
												.addComponent(btnMemoriaMenos, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING,
										gl_contentPane.createSequentialGroup()
												.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addGap(6)
												.addComponent(btnCE, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addGap(14)
												.addComponent(btnMaiMenos, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addGap(11).addComponent(btnRaiz, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING,
										gl_contentPane.createSequentialGroup()
												.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addGap(6)
												.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addGap(14)
												.addComponent(btnDividir, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addGap(11).addComponent(btnPercentual, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING,
										gl_contentPane.createSequentialGroup()
												.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addGap(6)
												.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addGap(14)
												.addComponent(btnVezes, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE)
												.addGap(11).addComponent(btn1x, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING,
										gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
														.addGroup(gl_contentPane.createSequentialGroup()
																.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 59,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 59,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(10)
																.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 59,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(14).addComponent(btnMenos,
																		GroupLayout.PREFERRED_SIZE, 59,
																		GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_contentPane.createSequentialGroup()
																.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 124,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(button_22, GroupLayout.PREFERRED_SIZE, 59,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(14).addComponent(btnMais,
																		GroupLayout.PREFERRED_SIZE, 59,
																		GroupLayout.PREFERRED_SIZE)))
												.addGap(11).addComponent(btnIgual, GroupLayout.PREFERRED_SIZE, 59,
														GroupLayout.PREFERRED_SIZE))
								.addComponent(textExpressao, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
								.addComponent(textTela, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
						.addContainerGap()));
		gl_contentPane
				.setVerticalGroup(
						gl_contentPane
								.createParallelGroup(
										Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
										.addComponent(textExpressao, GroupLayout.PREFERRED_SIZE, 33,
												GroupLayout.PREFERRED_SIZE)
										.addGap(1)
										.addComponent(textTela, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(btnMc).addComponent(btnMemoriaMenos)
												.addComponent(btnMemoraiMais).addComponent(btnMr).addComponent(btnMs))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnVoltar).addComponent(btnCE).addComponent(btnC)
												.addComponent(btnMaiMenos).addComponent(btnRaiz))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btn7).addComponent(btn8).addComponent(btn9)
												.addComponent(btnDividir).addComponent(btnPercentual))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btn4).addComponent(btn5).addComponent(btn6)
												.addComponent(btnVezes).addComponent(btn1x))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(Alignment.LEADING,
																false)
														.addGroup(
																gl_contentPane.createSequentialGroup()
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(btn1)
																						.addComponent(btn2)
																						.addComponent(btn3)
																						.addComponent(btnMenos))
																		.addPreferredGap(ComponentPlacement.UNRELATED)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(button_22)
																						.addComponent(btnMais)
																						.addComponent(btn0)))
														.addComponent(btnIgual, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addContainerGap(13, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}