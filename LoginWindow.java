/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline_ticketing_system;
import airline_ticketing_system.Code.Connect;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
/**
 *
 * @author Engilo Grave
 */
public class LoginWindow {
    
	private Color red = new Color(255,0,0);
	
	private JFrame frmAirlineTransportationTicketing;
	private JTextField jUsername;
	
	private JLabel lblNewLabel_5 = new JLabel("Wrong Password!!!");
	
	private Border emptyBorder = BorderFactory.createEmptyBorder();
	private JPasswordField jPassword;
        
        private AdminWindow aw;
        
        Connect conn;
	
        private ResetPass rp;
        /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
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
	public LoginWindow() {	
		initialize();
                conn = new Connect();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAirlineTransportationTicketing = new JFrame();
		frmAirlineTransportationTicketing.setTitle("Airline Transportation Ticketing System");
		frmAirlineTransportationTicketing.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Engilo Grave\\Desktop\\ATTS\\Logo.png"));
		frmAirlineTransportationTicketing.setBackground(new Color(0, 128, 255));
		frmAirlineTransportationTicketing.getContentPane().setBackground(new Color(255, 255, 255));
		frmAirlineTransportationTicketing.getContentPane().setForeground(new Color(0, 0, 0));
		frmAirlineTransportationTicketing.setBounds(100, 100, 650, 500);
                frmAirlineTransportationTicketing.setResizable(false);
		frmAirlineTransportationTicketing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAirlineTransportationTicketing.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(null);
		panel.setBounds(350, 0, 284, 461);
		frmAirlineTransportationTicketing.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("M A B U H A Y  M I L E S");
		lblNewLabel.setBounds(21, 64, 153, 17);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 11));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(255, 128, 64));
		panel_1.setForeground(new Color(255, 128, 64));
		panel_1.setBounds(10, 80, 79, 4);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Not a member yet?");
		lblNewLabel_1.setBounds(10, 123, 203, 74);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("Manage your flight account now");
		lblNewLabel_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_2.setBounds(32, 178, 247, 32);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register();
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(72, 300, 135, 36);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Log-in to your Account");
		lblNewLabel_3.setForeground(new Color(0, 64, 128));
		lblNewLabel_3.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 25));
		lblNewLabel_3.setBounds(10, 40, 316, 29);
		frmAirlineTransportationTicketing.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Member ID or Email Address");
		lblNewLabel_4.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
		lblNewLabel_4.setBounds(36, 130, 238, 36);
		frmAirlineTransportationTicketing.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Password");
		lblNewLabel_4_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(36, 208, 238, 36);
		frmAirlineTransportationTicketing.getContentPane().add(lblNewLabel_4_1);
		
		jUsername = new RoundJTextField();
		jUsername.setBounds(36, 177, 290, 20);
		frmAirlineTransportationTicketing.getContentPane().add(jUsername);
		jUsername.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("Log-in\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login();
			}
		});
		btnNewButton.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(79, 198, 255));
		btnNewButton.setBounds(191, 414, 135, 36);
		frmAirlineTransportationTicketing.getContentPane().add(btnNewButton);
		
		JButton btnForgotPassword = new JButton("Forgot password");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jUsername.getText().equals("")) {
                                    JOptionPane.showMessageDialog(null, "Please put your username");
                                } else {
                                    ForgotPassword(jUsername.getText());
                                    
                                }
			}
		});
		btnForgotPassword.setBorder(emptyBorder);
		btnForgotPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		btnForgotPassword.setVerticalAlignment(SwingConstants.BOTTOM);
		btnForgotPassword.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 10));
		btnForgotPassword.setBackground(new Color(255, 255, 255));
		btnForgotPassword.setBounds(217, 233, 109, 20);
		frmAirlineTransportationTicketing.getContentPane().add(btnForgotPassword);
		
		
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblNewLabel_5.setBounds(100, 290, 161, 36);
		frmAirlineTransportationTicketing.getContentPane().add(lblNewLabel_5);
		
		jPassword = new RoundJPassField();
		jPassword.setBounds(36, 255, 290, 20);
		frmAirlineTransportationTicketing.getContentPane().add(jPassword);
		frmAirlineTransportationTicketing.setResizable(false);
	}
	
	//Methods
	public void show(boolean b) {
		frmAirlineTransportationTicketing.setVisible(b);
	}
        
        public void Register() {
		//opens another window
		new RegisterWindow().setVisible(true);
		frmAirlineTransportationTicketing.setVisible(false);
	}
        
        public void Login(){
                int result = conn.login(jUsername.getText(),jPassword.getText());
            switch (result){
                case 0:
                    JOptionPane.showMessageDialog(this.frmAirlineTransportationTicketing, "Incorrect username/password.");
                    break;
                case 1:
                    System.out.println("System Right on track");
                    break;
                case 2:
                    aw = new AdminWindow();
                    aw.show(true);
                    System.out.println("System Right on track");
                    frmAirlineTransportationTicketing.setVisible(false);
                    break;
                default:
                    break;
            }
        }
        public void ForgotPassword(String username){
            rp = new ResetPass(username);
            rp.show(true);
        }
}
