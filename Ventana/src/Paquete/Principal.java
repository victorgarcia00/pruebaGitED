package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Principal extends JFrame {

	
	
	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 985, 579);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fila");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Login");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lo = new Login();
				nuevoPanel(lo);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("AfterLogin");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AfterLogin lo = new AfterLogin();
				nuevoPanel(lo);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUser = new JTextField();
		txtUser.setBounds(353, 108, 175, 25);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(353, 177, 175, 25);
		contentPane.add(pass);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(213, 108, 95, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasena = new JLabel("Contrasena");
		lblContrasena.setBounds(213, 177, 95, 25);
		lblContrasena.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblContrasena);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(398, 265, 104, 44);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				char[] clave = pass.getPassword();
				String un = txtUser.getText();
				String claveFinal = new String(clave);
				
				if(un.equals("Liviu") && claveFinal.equals("1234")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Loign Successful");
					Login lo = new Login();
					lo.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Loign Fail");
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnLogin);
		
		
	}
	
	
		private void nuevoPanel(JPanel panelActual) {
			contentPane.removeAll();
			contentPane.add(panelActual);
			contentPane.repaint();
			contentPane.revalidate();
		}
}
