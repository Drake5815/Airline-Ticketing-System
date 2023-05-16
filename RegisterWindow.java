/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atts;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Engilo Grave
 */
public class RegisterWindow {
        private Color red = new Color(255,0,0);
	private Color white = new Color(255,255,255);
	
	private ButtonGroup gender = new ButtonGroup();
	
	private JFrame frmAirlineTransportationTicketing;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JButton btnNewButton;
	private JLabel lblPassword;
	private JLabel lblEmail;
	private JLabel lblRegister;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterWindow window = new RegisterWindow();
					window.frmAirlineTransportationTicketing.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegisterWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAirlineTransportationTicketing = new JFrame();
		frmAirlineTransportationTicketing.getContentPane().setBackground(new Color(255, 255, 255));
		frmAirlineTransportationTicketing.setTitle("Airline Transportation Ticketing System");
		frmAirlineTransportationTicketing.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Engilo Grave\\Desktop\\ATTS\\Logo.png"));
		frmAirlineTransportationTicketing.setBounds(100, 100, 500, 500);
		frmAirlineTransportationTicketing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAirlineTransportationTicketing.setResizable(false);
		frmAirlineTransportationTicketing.getContentPane().setLayout(null);
		
		textField = new RoundJTextField();
		textField.setBounds(100, 314, 300, 20);
		frmAirlineTransportationTicketing.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new RoundJPassField();
		passwordField.setBounds(100, 202, 300, 20);
		frmAirlineTransportationTicketing.getContentPane().add(passwordField);
		
		passwordField_1 = new RoundJPassField();
		passwordField_1.setBounds(100, 258, 300, 20);
		frmAirlineTransportationTicketing.getContentPane().add(passwordField_1);
		
		btnNewButton = new RoundJButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(0, 128, 192));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(191, 420, 100, 25);
		frmAirlineTransportationTicketing.getContentPane().add(btnNewButton);
		
		JLabel ConfirmPass = new JLabel("Confirm Password:");
		ConfirmPass.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
		ConfirmPass.setBounds(100, 233, 154, 14);
		frmAirlineTransportationTicketing.getContentPane().add(ConfirmPass);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
		lblPassword.setBounds(100, 177, 144, 14);
		frmAirlineTransportationTicketing.getContentPane().add(lblPassword);
		
		lblEmail = new JLabel("E-Mail:");
		lblEmail.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
		lblEmail.setBounds(100, 289, 144, 14);
		frmAirlineTransportationTicketing.getContentPane().add(lblEmail);
		
		lblRegister = new JLabel("R e g i s t e r\r\n");
		lblRegister.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 28));
		lblRegister.setBounds(165, 50, 170, 35);
		frmAirlineTransportationTicketing.getContentPane().add(lblRegister);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(100, 371, 109, 23);
		rdbtnNewRadioButton.setBackground(white);
		gender.add(rdbtnNewRadioButton);
		frmAirlineTransportationTicketing.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(211, 371, 109, 23);
		rdbtnNewRadioButton_1.setBackground(white);
		gender.add(rdbtnNewRadioButton_1);
		frmAirlineTransportationTicketing.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblGre = new JLabel("Gender:");
		lblGre.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
		lblGre.setBounds(100, 341, 144, 14);
		frmAirlineTransportationTicketing.getContentPane().add(lblGre);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(0, 0, 484, 110);
		frmAirlineTransportationTicketing.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
		lblUsername.setBounds(100, 121, 144, 14);
		frmAirlineTransportationTicketing.getContentPane().add(lblUsername);
		
		RoundJTextField textField_1 = new RoundJTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 146, 300, 20);
		frmAirlineTransportationTicketing.getContentPane().add(textField_1);
	}
	
	//Methodss
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frmAirlineTransportationTicketing.setVisible(b);
	}
}
