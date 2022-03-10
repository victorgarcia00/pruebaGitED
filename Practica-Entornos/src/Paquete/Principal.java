package Paquete;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Principal extends JFrame {

	
	private JPanel contentPane;

	/**
	 * Inicia la aplicacion
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
	 * Creamos el frame.
	 */
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/Paquete/logoW.png")));
		
		setFont(new Font("Dialog", Font.BOLD, 12));
		setBackground(Color.PINK);
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1557, 882);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		/**
		 * Aniadimos a la bara de menu el Jmenu 'File'
		 */
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu);
		
		/**
		 * Aniadir otro Jmenu a la bara de menu
		 */
		JMenuItem login = new JMenuItem("Inicia Sesion");
		login.setHorizontalAlignment(SwingConstants.LEFT);
		login.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				nuevoPanel(l);
			}
		});
		
		/**
		 * Aniadir otro JMenu en cual llamamos a la funcion nuevoPanel() que contiene el codigo del JFrame(Principal)
		 */
		JMenuItem mntmNewMenuItem = new JMenuItem("Inicio");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nuevoPanel();
			}
		});
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mnNewMenu.add(mntmNewMenuItem);
		mnNewMenu.add(login);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/Paquete/fondo4.jpg")));
		contentPane.add(lblNewLabel, "name_89387166184500");
	}
	
	/**
	 * Crear un menu a cual le pasamos como parametro el JPanel que queremos cargar
	 * @param panelActual
	 */
	public void nuevoPanel(JPanel panelActual) {
		contentPane.removeAll();
		contentPane.add(panelActual);
		contentPane.repaint();
		contentPane.revalidate();
	}
	/**
	 * La funcion que contiene el codigo del JFrame(Principal)
	 */
	public void nuevoPanel() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setBackground(Color.PINK);
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1557, 882);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu);
		
		JMenuItem login = new JMenuItem("Login");
		login.setHorizontalAlignment(SwingConstants.LEFT);
		login.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				nuevoPanel(l);
			}
		});
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Inicio");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevoPanel();
			}
		});
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mnNewMenu.add(mntmNewMenuItem);
		mnNewMenu.add(login);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/Paquete/fondo4.jpg")));
		contentPane.add(lblNewLabel, "name_89387166184500");
	}
}

	


