package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;

public class Practica {

	private JFrame frmGestinCamping;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnAcceder;
	private JButton btnLimpiar;
	private JLabel lblUsuario;
	private JLabel lblContrasenia;
	private JPasswordField passwordField;
	private JTextField txtUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practica window = new Practica();
					window.frmGestinCamping.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Practica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestinCamping = new JFrame();
		frmGestinCamping.setTitle("Gestión camping");
		frmGestinCamping.setBounds(new Rectangle(0, 0, 600, 400));
		frmGestinCamping.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestinCamping.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frmGestinCamping.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{88, 200, 52, 0};
		gbl_panel.rowHeights = new int[]{19, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblUsuario = new JLabel("Usuario");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 1;
		panel.add(lblUsuario, gbc_lblUsuario);
		
		txtUsuario = new JTextField();
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.gridx = 1;
		gbc_txtUsuario.gridy = 1;
		panel.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContrasenia = new JLabel("Contraseña");
		lblContrasenia.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagConstraints gbc_lblContrasenia = new GridBagConstraints();
		gbc_lblContrasenia.anchor = GridBagConstraints.EAST;
		gbc_lblContrasenia.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasenia.gridx = 0;
		gbc_lblContrasenia.gridy = 2;
		panel.add(lblContrasenia, gbc_lblContrasenia);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 2;
		panel.add(passwordField, gbc_passwordField);
		
		panel_1 = new JPanel();
		frmGestinCamping.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		btnLimpiar = new JButton("Limpiar");
		panel_1.add(btnLimpiar);
		
		btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new BtnAccederActionListener());
		panel_1.add(btnAcceder);
	}
	private class BtnAccederActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MainMenu m = new MainMenu();
			m.setVisible(true);
		}
	}
}
