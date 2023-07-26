package HesapMakinesi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private double answer,number;
	private double answer2,number2;
	int operation;
	int operation2;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void calculate() {
		switch(operation) {
		case 1:
			answer=number+Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer=number-Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer=number*Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer=number/Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
		case 5:
			answer=Math.sqrt(number);
			input.setText(Double.toString(answer));
		}
	}
	public void calculator() {
		switch(operation2) {
		case 1:
			answer=Math.pow(number,Double.parseDouble(input.getText()));
			input.setText(Double.toString(answer));
		}
	}

	
	
	public void addInput(String str) {
		input.setText(input.getText()+str);
	}
	public Calculator() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 10, 483, 88);
		contentPane.add(panel);
		panel.setLayout(null);
		
		input = new JTextField();
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Verdana", Font.BOLD, 20));
		input.setBounds(20, 33, 463, 49);
		panel.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setBackground(Color.WHITE);
		lbl.setFont(new Font("Verdana", Font.BOLD, 16));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(20, 10, 425, 23);
		panel.add(lbl);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 108, 490, 339);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 3, 10, 10));
		
		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			addInput(e.getActionCommand());
			}
		});
		button_1.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(button_1);
		
		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_4.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_5.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(button_5);
		
		JButton button_2_2 = new JButton("+");
		button_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation=1;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		button_2_2.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(button_2_2);
		
		JButton button_1_3 = new JButton("-");
		button_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation =2;
				input.setText("");
				lbl.setText(number+e.getActionCommand());
			}
		});
		
		JButton button_3_1 = new JButton("*");
		button_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation=3;
				input.setText("");
				lbl.setText(number+e.getActionCommand());
			}
		});
		button_3_1.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(button_3_1);
		
		JButton button_6 = new JButton("4");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_6.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(button_6);
		
		
		JButton button_3_3 = new JButton("6");
		button_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4.setFont(new Font("Verdana", Font.BOLD, 17));
		panel_1.add(btnNewButton_4);
		button_3_3.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(button_3_3);
		button_1_3.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(button_1_3);
		
		JButton button = new JButton("/");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation=4;
				input.setText("");
				lbl.setText(number+e.getActionCommand());
			}
		});
		button.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(button);
		
		JButton button_2_1 = new JButton("3");
		button_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		
		JButton button_1_2 = new JButton("2");
		button_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		
		JButton button_3_2 = new JButton("1");
		button_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_3_2.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(button_3_2);
		button_1_2.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(button_1_2);
		button_2_1.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(button_2_1);
		
		JButton button_3 = new JButton("=");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				calculator();
				lbl.setText("");
			}
		});
		button_3.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(button_3);
		
		JButton btnNewButton_3 = new JButton("üs");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation2=1;
				input.setText("");
				lbl.setText(number+e.getActionCommand());
				
			}
		});
		btnNewButton_3.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Yüzde");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number=Double.parseDouble(input.getText());
				input.setText("");
				lbl.setText(number+e.getActionCommand());
			}
  		});
		
		JButton button_2 = new JButton("0");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		btnC.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(btnC);
		button_2.setFont(new Font("Verdana", Font.BOLD, 18));
		panel_1.add(button_2);
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 14));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Karekök");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation=5;
				input.setText("");
				lbl.setText(number+e.getActionCommand());
				calculate();
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 13));
		panel_1.add(btnNewButton);
	}
}
