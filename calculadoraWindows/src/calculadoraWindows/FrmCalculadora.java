package calculadoraWindows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;



public class FrmCalculadora extends JFrame {
	
	 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textTela;
	String valorIgual;
	
	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, UnsupportedLookAndFeelException {
		try {
	        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	        
	    } catch (IllegalAccessException e) {
	        // TODO
	    }
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCalculadora frame = new FrmCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmCalculadora() {
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
		textTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textTela.setHorizontalAlignment(SwingConstants.RIGHT);
		textTela.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textTela.setText("0");
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
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnVoltar.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText("");
			}
		});
		btnCE.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText("");
			}
		});
		btnC.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btnMaiMenos = new JButton("+_");
		btnMaiMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText("-"+textTela.getText());
			}
		});
		btnMaiMenos.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btnRaiz = new JButton("V'''");
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer raizQuadrada = Integer.valueOf(textTela.getText());
				Double rq = Math.sqrt(raizQuadrada);
				String str = String.valueOf(rq);			
				textTela.setText(str);
			}
		});
		btnRaiz.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText(textTela.getText()+"7");
			}
		});
		btn7.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText(textTela.getText()+"8");
			}
		});
		btn8.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText(textTela.getText()+"9");
			}
		});
		btn9.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText(textTela.getText()+"/");
			}
		});
		btnDividir.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btnPercentual = new JButton("%");
		btnPercentual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//INICIO DO TRY CATCH PARA CALCULO percentage = (x/y)*100
				try {
					String str= textTela.getText();
					String str1 = String.valueOf(str);

					char[] operadores = { '+', '-', '/', '*' };
					char operadorSelecionado = 0;
					

					String valor = str1;
					String y = "";

					// Qual a operação ?
					for (int i = 0; i < operadores.length; i++) {
						if (valor.indexOf(operadores[i]) != -1) {
							operadorSelecionado = operadores[i];
							break;
						}
					}

					String parte1 = valor.substring(0, valor.indexOf(operadorSelecionado));
					String parte2 = valor.substring(valor.indexOf(operadorSelecionado) + 1);

					switch (operadorSelecionado) {
					case '+':
						y = String.valueOf(Double.parseDouble(parte1) + Double.parseDouble(parte2)/100);
						break;
					case '-':
						y = String.valueOf(Double.parseDouble(parte1) - Double.parseDouble(parte2)/100);
						break;
					case '/':
						y = String.valueOf(Double.parseDouble(parte1) / Double.parseDouble(parte2)/100);
						break;
					case '*':
						y = String.valueOf(Double.parseDouble(parte1) * Double.parseDouble(parte2)/100);
						break;
					default:
						System.out.println("Operador desconhecido");
						break;

					}
					
					System.out.println(y);
					textTela.setText(y);
					
					

				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
// FIM DO TRY CATCH PARA CALCULO DO PERCENTUAL			
				
			}
		});
		btnPercentual.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText(textTela.getText()+"4");
			}
		});
		btn4.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText(textTela.getText()+"5");
			}
		});
		btn5.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText(textTela.getText()+"6");
			}
		});
		btn6.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btnVezes = new JButton("*");
		btnVezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText(textTela.getText()+"*");
			}
		});
		btnVezes.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btn1x = new JButton("1/x");
		btn1x.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textTela.setText(textTela.getText()+"1");
			}
		});
		btn1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText(textTela.getText()+"2");
			}
		});
		btn2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText(textTela.getText()+"3");
			}
		});
		btn3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText(textTela.getText()+"-");
			}
		});
		btnMenos.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
// INICIO DO TRY CATCH PARA EXECUÇÃO DO CALCULO
				
				try {
					String str = String.valueOf(textTela.getText());

					char[] operadores = { '+', '-', '/', '*' };
					char operadorSelecionado = 0;
					

					String valor = str;
					String y = "";

					// Qual a operação ?
					for (int i = 0; i < operadores.length; i++) {
						if (valor.indexOf(operadores[i]) != -1) {
							operadorSelecionado = operadores[i];
							break;
						}
					}

					String parte1 = valor.substring(0, valor.indexOf(operadorSelecionado));
					String parte2 = valor.substring(valor.indexOf(operadorSelecionado) + 1);

					switch (operadorSelecionado) {
					case '+':
						y = String.valueOf(Double.parseDouble(parte1) + Double.parseDouble(parte2));
						break;
					case '-':
						y = String.valueOf(Double.parseDouble(parte1) - Double.parseDouble(parte2));
						break;
					case '/':
						y = String.valueOf(Double.parseDouble(parte1) / Double.parseDouble(parte2));
						break;
					case '*':
						y = String.valueOf(Double.parseDouble(parte1) * Double.parseDouble(parte2));
						break;
					default:
						System.out.println("Operador desconhecido");
						break;

					}
					System.out.println(y);
					textTela.setText(y);

				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
// FIM DO TRY CATCH PARA EXECUÇÃO DO CALCULO
			}
		});
		btnIgual.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText(textTela.getText()+"0");
			}
		});
		btn0.setFont(new Font("Segoe UI", Font.PLAIN, 11));
				
		JButton button_22 = new JButton(",");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText(textTela.getText()+".");
			}
		});
		button_22.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton btnMais = new JButton("+");
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textTela.setText(textTela.getText()+"+");
			}
		});
		btnMais.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnMc, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnMr, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnMs, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addComponent(btnMemoraiMais, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
							.addComponent(btnMemoriaMenos, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
						.addComponent(textTela, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
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
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addComponent(btnDividir, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(btnPercentual, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addComponent(btnVezes, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(btn1x, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addGap(14)
									.addComponent(btnMenos, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addGap(11))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button_22, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addGap(14)
									.addComponent(btnMais, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addGap(11)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnIgual, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(textTela, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnMc)
						.addComponent(btnMemoriaMenos)
						.addComponent(btnMemoraiMais)
						.addComponent(btnMr)
						.addComponent(btnMs))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnVoltar)
						.addComponent(btnCE)
						.addComponent(btnC)
						.addComponent(btnMaiMenos)
						.addComponent(btnRaiz))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btn7)
						.addComponent(btn8)
						.addComponent(btn9)
						.addComponent(btnDividir)
						.addComponent(btnPercentual))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btn4)
						.addComponent(btn5)
						.addComponent(btn6)
						.addComponent(btnVezes)
						.addComponent(btn1x))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btn1)
								.addComponent(btn2)
								.addComponent(btn3)
								.addComponent(btnMenos))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_22)
								.addComponent(btnMais)
								.addComponent(btn0)))
						.addComponent(btnIgual, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
