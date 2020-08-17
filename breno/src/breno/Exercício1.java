package breno;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;

public class Exercício1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercício1 frame = new Exercício1();
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
	public Exercício1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setBounds(10, 45, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(10, 70, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(41, 39, 94, 20);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(51, 70, 84, 20);
		contentPane.add(textPane_1);
		
		JButton btn1 = new JButton("Ok");
		btn1.setBounds(41, 125, 89, 23);
		contentPane.add(btn1);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textPane.getText().equals("admin") && textPane_1.getText().equals("swordfish")) {
					JOptionPane.showMessageDialog(contentPane, "Bem vindo.");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Senha ou Login Incorretos.");
				}
			}
		});
		
	}
}
