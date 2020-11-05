package Frame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import classe.*;


public class connexionouregister extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JPasswordField passwordField;
	private JPasswordField passwordField2;
	private int t;
	private double tr;
	connexionouregister conec=new connexionouregister();
	Person p=new Person();
	client c=new client();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					connexionouregister frame = new connexionouregister();
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
	public connexionouregister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.ORANGE);
		tabbedPane.setBounds(10, -31, 515, 304);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		tabbedPane.addTab("tab2", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		tabbedPane.addTab("tab1", null, panel, null);
		panel.setLayout(null);
		
		
		JLabel lblt2 = new JLabel("Salle Bosquet Wallon");
		lblt2.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblt2.setBounds(154, 11, 165, 34);
		panel_1.add(lblt2);
		
		JLabel lblNewLabel_1 = new JLabel("Nom :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(95, 74, 47, 17);
		panel_1.add(lblNewLabel_1);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		textField1.setBounds(169, 72, 116, 22);
		panel_1.add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel_2= new JLabel("Mot de passe :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(86, 115, 89, 17);
		panel_1.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(185, 115, 134, 20);
		panel_1.add(passwordField);
		
		JButton btnconnecter = new JButton("Se connecter");
		btnconnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					p.login(textField1.getText(), passwordField.getText());
				}
				catch(Exception ex) {				
					conec.setVisible(true);
				}
				
			}
		});
		btnconnecter.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnconnecter.setBounds(62, 170, 134, 25);
		panel_1.add(btnconnecter);
		
	
		JButton btnsenregistrer2_1 = new JButton("S'enregistrer");
		btnsenregistrer2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnsenregistrer2_1.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnsenregistrer2_1.setBounds(216, 170, 133, 25);
		panel_1.add(btnsenregistrer2_1);
		
		
		JLabel lblt;
		lblt = new JLabel("Salle Bosquet Wallon");
		lblt.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblt.setBounds(115, 11, 174, 44);
		panel.add(lblt);
		
		JLabel lblNewLabel_4;
		lblNewLabel_4 = new JLabel("Nom :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_4.setBounds(78, 82, 59, 33);
		panel.add(lblNewLabel_4);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		textField2.setBounds(172, 89, 151, 20);
		panel.add(textField2);
		textField2.setColumns(10);
		
		JLabel lblNewLabel_3;
		lblNewLabel_3 = new JLabel("Mot de passe :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_3.setBounds(66, 140, 106, 14);
		panel.add(lblNewLabel_3);
		
		passwordField2 = new JPasswordField();
		passwordField2.setBounds(172, 139, 151, 20);
		panel.add(passwordField2);
		
	
		JButton btnsenregistrer1;
		btnsenregistrer1 = new JButton("S'enregistrer");
		btnsenregistrer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					c.register(textField2.getText(), n, pr,passwordField2.getText());
					conec.setVisible(true);
				}
				catch(Exception ex) {
					textField2.setText(null);
					passwordField2.setText(null);
				}
			}
		});
		btnsenregistrer1.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnsenregistrer1.setBounds(146, 184, 133, 23);
		panel.add(btnsenregistrer1);
	}
}
