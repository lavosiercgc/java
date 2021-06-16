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
	
	String mc, mr, ms, mMais, mMenos;
	Integer somar = 0, subtrair = 0, multiplicar = 0, dividir = 0;
	Integer zero, um, dois, tres, quatro, cinco, seis, sete, oito, nove;
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
		btnMemoriaMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mMenos = "-" + textTela.getText();
				System.out.println(mMenos);
			}
		});
		btnMemoriaMenos.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnVoltar = new JButton("<---");
		btnVoltar.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText("");
				textExpressao.setText("");
				um = 1;
				dois = 2;
				tres = 3;
				quatro = 4;
				cinco = 5;
				seis = 6;
				sete = 7;
				oito = 8;
				nove = 9;
				somar = 0;
				subtrair = 0;
				multiplicar = 0;
				dividir = 0;
				valor1 = 0.0; valor2 = 0.0; resultado = 0.0;
				somar = 0; subtrair = 0; multiplicar = 0; dividir = 0;
			}
		});
		btnCE.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText("");
				textExpressao.setText("");
				um = 1;
				dois = 2;
				tres = 3;
				quatro = 4;
				cinco = 5;
				seis = 6;
				sete = 7;
				oito = 8;
				nove = 9;
				somar = 0;
				subtrair = 0;
				multiplicar = 0;
				dividir = 0;
				valor1 = 0.0; valor2 = 0.0; resultado = 0.0;
				somar = 0; subtrair = 0; multiplicar = 0; dividir = 0;
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
				String raiz = String.valueOf(Math.sqrt(valor1));
				textTela.setText(raiz);
				textExpressao.setText("Sqrt(" + valor1 + ")");

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
				} else {
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
				zero = 0;
			}
		});
		btn0.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valor1 > 0) {
					valor2 = Double.valueOf(um);
					String v2 = String.valueOf(um);
					textTela.setText("");
					textTela.setText(textTela.getText()+v2);
					
				}else {
				um = 1;
				valor1= Double.valueOf(um);
				String v1 = String.valueOf(um);
				textTela.setText(textTela.getText()+v1);
				}
			}
		});
		btn1.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valor1 > 0) {
					valor2 = Double.valueOf(dois);
					String v2 = String.valueOf(dois);
					textTela.setText("");
					textTela.setText(v2+textTela.getText());
					
				}else {
				dois = 2;
				valor1= Double.valueOf(dois);
				String v1 = String.valueOf(dois);
				textTela.setText(v1+textTela.getText());
				}
	
			}
		});
		btn2.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valor1 > 0) {
					valor2 = Double.valueOf(tres);
					String v2 = String.valueOf(tres);
					textTela.setText("");
					textTela.setText(v2+textTela.getText());
					
				}else {
				tres = 3;
				valor1= Double.valueOf(tres);
				String v1 = String.valueOf(tres);
				textTela.setText(v1+textTela.getText());
				}

				
			}
		});
		btn3.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valor1 > 0) {
					valor2 = Double.valueOf(quatro);
					String v2 = String.valueOf(quatro);
					textTela.setText("");
					textTela.setText(v2+textTela.getText());
					
				}else {
				quatro = 4;
				valor1= Double.valueOf(quatro);
				String v1 = String.valueOf(quatro);
				textTela.setText(v1+textTela.getText());
				}

			}
		});
		btn4.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valor1 > 0) {
					valor2 = Double.valueOf(cinco);
					String v2 = String.valueOf(cinco);
					textTela.setText("");
					textTela.setText(v2+textTela.getText());
					
				}else {
				cinco = 5;
				valor1= Double.valueOf(cinco);
				String v1 = String.valueOf(cinco);
				textTela.setText(v1+textTela.getText());
				}

			}
		});
		btn5.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valor1 > 0) {
					valor2 = Double.valueOf(seis);
					String v2 = String.valueOf(seis);
					textTela.setText("");
					textTela.setText(v2+textTela.getText());
					
				}else {
				seis = 6;
				valor1= Double.valueOf(seis);
				String v1 = String.valueOf(seis);
				textTela.setText(v1+textTela.getText());
				}

			}
		});
		btn6.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valor1 > 0) {
					valor2 = Double.valueOf(sete);
					String v2 = String.valueOf(sete);
					textTela.setText("");
					textTela.setText(v2+textTela.getText());
					
				}else {
				sete = 7;
				valor1= Double.valueOf(sete);
				String v1 = String.valueOf(sete);
				textTela.setText(v1+textTela.getText());
				}

			}
		});
		btn7.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valor1 > 0) {
					valor2 = Double.valueOf(oito);
					String v2 = String.valueOf(oito);
					textTela.setText("");
					textTela.setText(v2+textTela.getText());
					
				}else {
				oito = 8;
				valor1= Double.valueOf(oito);
				String v1 = String.valueOf(oito);
				textTela.setText(v1+textTela.getText());
				}

			}
		});
		btn8.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (valor1 > 0) {
					valor2 = Double.valueOf(nove);
					String v2 = String.valueOf(nove);
					textTela.setText("");
					textTela.setText(v2+textTela.getText());
					
				}else {
				nove = 9;
				valor1= Double.valueOf(nove);
				String v1 = String.valueOf(nove);
				textTela.setText(v1+textTela.getText());
				}

			}
		});
		btn9.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(valor2>0 && valor1>0) {
					qo.dividir(valor1,valor2);
					resultado=qo.dividir(valor1,valor2);
					String agora = String.valueOf(qo.dividir(valor1,valor2));
					textTela.setText(agora);
					valor1=resultado;
				}

				dividir = 1;
			}
		});
		btnDividir.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnVezes = new JButton("*");
		btnVezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(valor2>0 && valor1>0) {
					qo.multiplicar(valor1,valor2);
					resultado=qo.multiplicar(valor1,valor2);
					String agora = String.valueOf(qo.multiplicar(valor1,valor2));
					textTela.setText(agora);
					valor1=resultado;
				}

				multiplicar = 1;
			}
		});
		btnVezes.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(valor2>0 && valor1>0) {
					qo.subtrair(valor1,valor2);
					resultado=qo.subtrair(valor1,valor2);
					String agora = String.valueOf(qo.subtrair(valor1,valor2));
					textTela.setText(agora);
					valor1=resultado;
				}

				subtrair = 1;
			}
		});
		btnMenos.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnMais = new JButton("+");
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(valor2>0 && valor1>0) {
					qo.somar(valor1,valor2);
					resultado=qo.somar(valor1,valor2);
					String agora = String.valueOf(qo.somar(valor1,valor2));
					textTela.setText(agora);
					valor1=resultado;
				}
				somar = 1;
				
			}
		});
		btnMais.setFont(new Font("Segoe UI", Font.PLAIN, 11));

		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuatroOperacoes qo = new QuatroOperacoes();
				if(somar==1){qo.somar(valor1, valor2);
				resultado=qo.somar(valor1,valor2);
				String agora = String.valueOf(qo.somar(valor1,valor2));
				textTela.setText(agora);
				valor1=resultado;
				}
				if(subtrair==1){qo.subtrair(valor1, valor2);
				resultado=qo.subtrair(valor1,valor2);
				String agora = String.valueOf(qo.subtrair(valor1,valor2));
				textTela.setText(agora);
				valor1=resultado;
				}
				if(multiplicar==1){qo.multiplicar(valor1, valor2);
				resultado=qo.multiplicar(valor1,valor2);
				String agora = String.valueOf(qo.multiplicar(valor1,valor2));
				textTela.setText(agora);
				valor1=resultado;
				}
				if(dividir==1){qo.dividir(valor1, valor2);
				resultado=qo.dividir(valor1,valor2);
				String agora = String.valueOf(qo.dividir(valor1,valor2));
				textTela.setText(agora);
				valor1=resultado;
				}
				
				
				
				um = 1;
				dois = 2;
				tres = 3;
				quatro = 4;
				cinco = 5;
				seis = 6;
				sete = 7;
				oito = 8;
				nove = 9;
				somar = 0;
				subtrair = 0;
				multiplicar = 0;
				dividir = 0;
				valor1 = 0.0; valor2 = 0.0; resultado = 0.0;
				somar = 0; subtrair = 0; multiplicar = 0; dividir = 0;

			}
		});
		btnIgual.setFont(new Font("Segoe UI", Font.PLAIN, 16));

		JButton button_22 = new JButton(",");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

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
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addComponent(btnMc, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnMr, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnMs, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addGap(14)
								.addComponent(btnMemoraiMais, GroupLayout.PREFERRED_SIZE, 59,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE).addComponent(
										btnMemoriaMenos, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(btnCE, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addGap(10)
								.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addGap(14)
								.addComponent(btnMaiMenos, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addGap(11)
								.addComponent(btnRaiz, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING,
								gl_contentPane.createSequentialGroup()
										.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
										.addGap(10)
										.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
										.addGap(14)
										.addComponent(btnDividir, GroupLayout.PREFERRED_SIZE, 59,
												GroupLayout.PREFERRED_SIZE)
										.addGap(11).addComponent(btnPercentual, GroupLayout.PREFERRED_SIZE, 59,
												GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING,
								gl_contentPane.createSequentialGroup()
										.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
										.addGap(6)
										.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
										.addGap(10)
										.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
										.addGap(14)
										.addComponent(btnVezes, GroupLayout.PREFERRED_SIZE, 59,
												GroupLayout.PREFERRED_SIZE)
										.addGap(11).addComponent(btn1x, GroupLayout.PREFERRED_SIZE, 59,
												GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING,
								gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane
												.createParallelGroup(
														Alignment.TRAILING)
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 59,
																GroupLayout.PREFERRED_SIZE)
														.addGap(6)
														.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 59,
																GroupLayout.PREFERRED_SIZE)
														.addGap(10)
														.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 59,
																GroupLayout.PREFERRED_SIZE)
														.addGap(14)
														.addComponent(
																btnMenos, GroupLayout.PREFERRED_SIZE, 59,
																GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 124,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(button_22, GroupLayout.PREFERRED_SIZE, 59,
																GroupLayout.PREFERRED_SIZE)
														.addGap(14).addComponent(btnMais, GroupLayout.PREFERRED_SIZE,
																59, GroupLayout.PREFERRED_SIZE)))
										.addGap(11).addComponent(btnIgual, GroupLayout.PREFERRED_SIZE, 59,
												GroupLayout.PREFERRED_SIZE))
						.addComponent(textExpressao, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
						.addComponent(textTela, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
				.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addComponent(textExpressao, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE).addGap(1)
				.addComponent(
						textTela, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane
						.createParallelGroup(Alignment.BASELINE).addComponent(btnMc).addComponent(btnMemoriaMenos)
						.addComponent(btnMemoraiMais).addComponent(btnMr).addComponent(btnMs))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(btnVoltar)
						.addComponent(btnCE).addComponent(btnC).addComponent(btnMaiMenos).addComponent(btnRaiz))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(btn7).addComponent(btn8)
						.addComponent(btn9).addComponent(btnDividir).addComponent(btnPercentual))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(btn4).addComponent(btn5)
						.addComponent(btn6).addComponent(btnVezes).addComponent(btn1x))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(btn1)
										.addComponent(btn2).addComponent(btn3).addComponent(btnMenos))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(button_22)
										.addComponent(btnMais).addComponent(btn0)))
						.addComponent(btnIgual, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addContainerGap(13, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
