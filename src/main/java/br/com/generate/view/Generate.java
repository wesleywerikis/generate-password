package br.com.generate.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.Dimension;

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
		frameGeneratorPassword.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frameGeneratorPassword.getContentPane().setForeground(new Color(249, 176, 6));
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 32, 68));
		panel.setBounds(358, 31, 236, 178);
		frameGeneratorPassword.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnGerar = new JButton("Gerar Senha");
		btnGerar.setBorder(new LineBorder(new Color(249, 176, 6), 2));
		btnGerar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGerar.setFocusable(false);
		btnGerar.setBackground(new Color(249, 176, 6));
		btnGerar.setBounds(59, 43, 118, 25);
		panel.add(btnGerar);
		
		JLabel lblNewLabel = new JLabel("ajNkfO@#$");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(new LineBorder(new Color(249, 176, 6), 2));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 79, 216, 36);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(32, 32, 68));
		panel_1.setBounds(39, 160, 176, 59);
		frameGeneratorPassword.getContentPane().add(panel_1);
		frameGeneratorPassword.setBounds(100, 100, 450, 300);
		frameGeneratorPassword.setBounds(100, 100, 620, 300);
		frameGeneratorPassword.setLocationRelativeTo(null);
		frameGeneratorPassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
