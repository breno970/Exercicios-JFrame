package breno;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Exercício2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btn1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercício2 frame = new Exercício2();
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
	public Exercício2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A:");
		lblNewLabel.setBounds(36, 42, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(57, 39, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblB = new JLabel("B:");
		lblB.setBounds(34, 84, 25, 14);
		contentPane.add(lblB);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(57, 81, 86, 20);
		contentPane.add(textField_1);
		
		btn1 = new JButton("Mostrar N\u00FAmeros");
		btn1.setBounds(81, 155, 159, 23);
		contentPane.add(btn1);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		int X= Integer.parseInt(textField.getText());
		int y=Integer.parseInt(textField_1.getText());
		do {
			JOptionPane.showMessageDialog(contentPane, ""+X);
			X++;
		
		}while (X<=y);
				
			}
		});
	}
}
