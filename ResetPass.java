/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline_ticketing_system;

import airline_ticketing_system.Code.Connect;
import airline_ticketing_system.Code.User;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Engilo Grave
 */
public class ResetPass {
        private JFrame frmAtts;
	private JPasswordField passwordField;
	private JPasswordField ConfirmPasswordField;

        private String username;
        private Connect conn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResetPass window = new ResetPass();
					window.frmAtts.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ResetPass() {
		initialize();
	}
        public ResetPass(String username){
            initialize();
            this.username = username;
            conn = new Connect();
        }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAtts = new JFrame();
		frmAtts.getContentPane().setBackground(new Color(58, 88, 120));
		frmAtts.setResizable(false);
		frmAtts.setTitle("ATTS");
		frmAtts.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Engilo Grave\\Desktop\\ATTS\\Logo.png"));
		frmAtts.setBounds(100, 100, 250, 300);
		frmAtts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAtts.getContentPane().setLayout(null);
		
		passwordField = new RoundJPassField();
		passwordField.setBounds(10, 71, 214, 20);
		frmAtts.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Reset Password");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 17));
		lblNewLabel.setBounds(53, 11, 123, 14);
		frmAtts.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 17));
		lblPassword.setBounds(10, 46, 110, 14);
		frmAtts.getContentPane().add(lblPassword);
		
		ConfirmPasswordField = new RoundJPassField();
		ConfirmPasswordField.setBounds(10, 145, 214, 20);
		frmAtts.getContentPane().add(ConfirmPasswordField);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setForeground(new Color(255, 255, 255));
		lblConfirmPassword.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 17));
		lblConfirmPassword.setBounds(10, 120, 166, 14);
		frmAtts.getContentPane().add(lblConfirmPassword);
		
		JButton btnNewButton = new RoundJButton("Reset Password");
                btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(passwordField.getText().equals(ConfirmPasswordField.getText())){
                                    resetPass(username, passwordField.getText());
                                } else {
                                    JOptionPane.showMessageDialog(null, "Password Does Not Match!");
                                }
			}
		});
		btnNewButton.setBounds(10, 227, 214, 23);
		frmAtts.getContentPane().add(btnNewButton);
	}
        
        //Methods:
        public void show(boolean bool){
            this.frmAtts.setVisible(bool);
        }
        
        public void resetPass(String username, String password){
            System.out.println(username + "," + password);
            User a = new User(username, password);
            if(conn.ResetPass(a) ==  true ){
                JOptionPane.showMessageDialog(null, "Success!");
            } else {
                JOptionPane.showMessageDialog(null, "Something went wrong do it again");
            }
        }
}
