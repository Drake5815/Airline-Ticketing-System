/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline_ticketing_system;

import airline_ticketing_system.Code.Connect;
import airline_ticketing_system.Code.User;

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
	
	private JFrame frmAirlineTransportationTicketing;
	private JPasswordField pfPassword;
	private JPasswordField pscPassword;
	private JButton RegitserBttn;
	private JLabel lblPassword;
	private JLabel lblEmail;
	private JLabel lblRegister;

        private RoundJTextField tfEmail;
        private RoundJTextField jUsername;
        private RoundJTextField tfcEmail;
        
        Connect conn =null;
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
                conn = new Connect();
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
		
		tfEmail = new RoundJTextField();
		tfEmail.setBounds(100, 314, 300, 20);
		frmAirlineTransportationTicketing.getContentPane().add(tfEmail);
		tfEmail.setColumns(10);
		
		pfPassword = new RoundJPassField();
		pfPassword.setBounds(100, 202, 300, 20);
		frmAirlineTransportationTicketing.getContentPane().add(pfPassword);
		
		pscPassword = new RoundJPassField();
		pscPassword.setBounds(100, 258, 300, 20);
		frmAirlineTransportationTicketing.getContentPane().add(pscPassword);
		
		RegitserBttn = new RoundJButton("Register");
		RegitserBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration();
			}
		});
		RegitserBttn.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		RegitserBttn.setBackground(new Color(0, 128, 192));
		RegitserBttn.setForeground(new Color(0, 0, 0));
		RegitserBttn.setBounds(191, 420, 100, 25);
		frmAirlineTransportationTicketing.getContentPane().add(RegitserBttn);
		
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
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(0, 0, 484, 110);
		frmAirlineTransportationTicketing.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
		lblUsername.setBounds(100, 121, 144, 14);
		frmAirlineTransportationTicketing.getContentPane().add(lblUsername);
		
		jUsername = new RoundJTextField();
		jUsername.setColumns(10);
		jUsername.setBounds(100, 146, 300, 20);
		frmAirlineTransportationTicketing.getContentPane().add(jUsername);
		
		JLabel lblConfirmEmail = new JLabel("Confirm E-Mail:");
		lblConfirmEmail.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
		lblConfirmEmail.setBounds(100, 345, 144, 14);
		frmAirlineTransportationTicketing.getContentPane().add(lblConfirmEmail);
		
		tfcEmail = new RoundJTextField();
		tfcEmail.setColumns(10);
		tfcEmail.setBounds(100, 370, 300, 20);
		frmAirlineTransportationTicketing.getContentPane().add(tfcEmail);
	}
	
	//Methodss
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frmAirlineTransportationTicketing.setVisible(b);
	}
        public boolean check(){
            return jUsername.getText().isEmpty()==false ||pfPassword.getText().isEmpty()==false || tfEmail.getText().isEmpty()==false;
        }
        public boolean Confirmatoin(){
            if(pfPassword == pscPassword){
                return true;
            }else {
                JOptionPane.showMessageDialog(this.frmAirlineTransportationTicketing, "Password does not match");
            } 
            
            if(tfEmail == tfcEmail)
                return true;
            else 
                JOptionPane.showMessageDialog(this.frmAirlineTransportationTicketing, "Email does not match");
            
            return false;
        }
        
        public void Registration(){
           if(check()==true ){
            User user = new User(jUsername.getText(),pfPassword.getText(), tfEmail.getText());
            if(conn.registerUser(user))
                JOptionPane.showMessageDialog(this.frmAirlineTransportationTicketing, "New record added");
            else
                JOptionPane.showMessageDialog(this.frmAirlineTransportationTicketing, "Username already existing");
        }else
            JOptionPane.showMessageDialog(this.frmAirlineTransportationTicketing, "All fields are required.");
        }
}
