package Paquete;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.BorderLayout;

public class Login extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public Login() {
		setBackground(Color.ORANGE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(179, 101, 91, 67);
		add(lblNewLabel);
		
	}
	
}
