package br.com.generate.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;

public class Generate {

	private JFrame frameGeneratorPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Generate window = new Generate();
					window.frameGeneratorPassword.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Generate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameGeneratorPassword = new JFrame();
		frameGeneratorPassword.setTitle("· Generator Password");
		frameGeneratorPassword.setResizable(false);
		frameGeneratorPassword.getContentPane().setBackground(new Color(32, 32, 68));
		frameGeneratorPassword.getContentPane().setLayout(null);
		
		JLabel lblGenerator_SenhasFortes = new JLabel("Senhas fortes em");
		lblGenerator_SenhasFortes.setForeground(new Color(196, 196, 227));
		lblGenerator_SenhasFortes.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblGenerator_SenhasFortes.setBackground(Color.WHITE);
		lblGenerator_SenhasFortes.setBounds(57, 47, 281, 43);
		frameGeneratorPassword.getContentPane().add(lblGenerator_SenhasFortes);
		
		JLabel lblGenerator_EmClique = new JLabel("um clique");
		lblGenerator_EmClique.setForeground(new Color(196, 196, 227));
		lblGenerator_EmClique.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblGenerator_EmClique.setBounds(57, 77, 216, 43);
		frameGeneratorPassword.getContentPane().add(lblGenerator_EmClique);
		
		JLabel lblGenerator_BackgroundSenhasFortes = new JLabel("Senhas fortes em");
		lblGenerator_BackgroundSenhasFortes.setForeground(new Color(255, 0, 255));
		lblGenerator_BackgroundSenhasFortes.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblGenerator_BackgroundSenhasFortes.setBackground(Color.WHITE);
		lblGenerator_BackgroundSenhasFortes.setBounds(58, 48, 281, 43);
		frameGeneratorPassword.getContentPane().add(lblGenerator_BackgroundSenhasFortes);
		
		JLabel lblGenerator_BackgroundEmClique_ = new JLabel("um clique");
		lblGenerator_BackgroundEmClique_.setForeground(new Color(255, 0, 255));
		lblGenerator_BackgroundEmClique_.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblGenerator_BackgroundEmClique_.setBounds(58, 78, 216, 43);
		frameGeneratorPassword.getContentPane().add(lblGenerator_BackgroundEmClique_);
		
		Panel panelGenerator_Copyright = new Panel();
		panelGenerator_Copyright.setLayout(null);
		panelGenerator_Copyright.setBounds(226, 222, 151, 20);
		frameGeneratorPassword.getContentPane().add(panelGenerator_Copyright);
		
		JLabel lblIconCopyright = new JLabel("©");
		lblIconCopyright.setForeground(new Color(196, 196, 227));
		lblIconCopyright.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblIconCopyright.setBounds(0, 3, 10, 14);
		panelGenerator_Copyright.add(lblIconCopyright);
		
		JLabel lblCopyright = new JLabel("Copyright");
		lblCopyright.setForeground(new Color(196, 196, 227));
		lblCopyright.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		lblCopyright.setBounds(10, 3, 44, 14);
		panelGenerator_Copyright.add(lblCopyright);
		
		JLabel lblAllRightsReserved = new JLabel("All rights reserved");
		lblAllRightsReserved.setForeground(new Color(196, 196, 227));
		lblAllRightsReserved.setFont(new Font("Microsoft YaHei", Font.PLAIN, 10));
		lblAllRightsReserved.setBounds(57, 3, 95, 14);
		panelGenerator_Copyright.add(lblAllRightsReserved);
		frameGeneratorPassword.setBounds(100, 100, 450, 300);
		frameGeneratorPassword.setBounds(100, 100, 620, 300);
		frameGeneratorPassword.setLocationRelativeTo(null);
		frameGeneratorPassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
