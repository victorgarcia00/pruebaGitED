package Paquete;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Login extends JPanel {
	private JTextField txtuser;
	private JPasswordField pass;

	/**
	 * Crear el JPanel
	 */
	public Login() {
		setBackground(new Color(250, 235, 215));
		setLayout(null);
		
		/**
		 * Crear un Jlabel que es la caja de Username
		 */
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(278, 197, 145, 50);
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblNewLabel);
		 
		/**
		 * Crear un Jlabel que es la caja de Contransena
		 */
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(278, 272, 145, 50);
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblNewLabel_1);
		
		txtuser = new JTextField();
		txtuser.setBounds(433, 210, 176, 33);
		add(txtuser);
		txtuser.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(433, 285, 176, 33);
		add(pass);
		
		/**
		 * Crear el boton que contiene la estructura de la operacion de iniciar sesion.
		 */
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(323, 365, 226, 93);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] clave = pass.getPassword();
				String un = txtuser.getText();
				String claveFinal = new String(clave);
				
				if(un.equals("Juanxxiii_2022") && claveFinal.equals("juanxxiii")) {
					JOptionPane.showMessageDialog(null, "Sesion Finalizada", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
					AfterLogin af = new AfterLogin();
					af.setVisible(true);
					Window w = SwingUtilities.getWindowAncestor(Login.this);
				    w.setVisible(false);
					
				}else {
					JOptionPane.showMessageDialog(null, "Usuario o contrasena incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
					txtuser.setText("");
					pass.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 28));
		add(btnNewButton);
		
		/**
		 * Crear un Jlabel que es la caja de INICIAR SESION
		 */
		JLabel lblNewLabel_2 = new JLabel("INICIAR SESI\u00D3N");
		lblNewLabel_2.setBounds(198, 6, 494, 241);
		lblNewLabel_2.setForeground(new Color(192, 192, 192));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 35));
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(10, 6, 1507, 750);
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/Paquete/fondo.jpg")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(255, 0, 255));
		lblNewLabel_3.setBackground(new Color(184, 134, 11));
		add(lblNewLabel_3);
		
	}
	
	

	
}
	
	
