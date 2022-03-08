package Paquete;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class AfterLogin extends JPanel {

	/**
	 * Create the panel.
	 */
	public AfterLogin() {
		setForeground(Color.GREEN);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("After Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(149, 85, 138, 82);
		add(lblNewLabel);

	}

}
