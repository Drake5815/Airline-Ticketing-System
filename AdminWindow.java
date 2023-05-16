/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline_ticketing_system;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
/**
 *
 * @author Engilo Grave
 */
public class AdminWindow {
    
	private JFrame frmAirline;
	private JTable table;
	private JTextField JTF_FlightFrom;
	private JTextField JTF_Destination;
	private JTextField JTF_TerminalDeparture; 
	private JTextField JTF_TerminalArrival;
	private JTextField JTF_Airline;
	private JTextField JTF_DepartTime;
	private JTextField JTF_ArrivalTime;
	private JTextField JTF_FlightNum;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminWindow window = new AdminWindow();
					window.frmAirline.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAirline = new JFrame();
		frmAirline.setResizable(false);
		frmAirline.setTitle("Airline Transportation Ticketing System");
		frmAirline.setBounds(100, 100, 700, 508);
		frmAirline.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAirline.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Engilo Grave\\Desktop\\ATTS\\Logo.png"));
		frmAirline.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 79, 310, 150);
		frmAirline.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("Adminstration");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		lblNewLabel.setBounds(200, 11, 250, 30);
		frmAirline.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(null);
		panel.setBounds(10, 240, 320, 2);
		frmAirline.getContentPane().add(panel);
		
		JLabel lblInsertFlight = new JLabel("Insert Flight");
		lblInsertFlight.setVerticalAlignment(SwingConstants.BOTTOM);
		lblInsertFlight.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertFlight.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		lblInsertFlight.setBounds(330, 67, 132, 30);
		frmAirline.getContentPane().add(lblInsertFlight);
		
		JLabel lblRoute = new JLabel("Route:");
		lblRoute.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRoute.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoute.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 16));
		lblRoute.setBounds(340, 97, 54, 22);
		frmAirline.getContentPane().add(lblRoute);
		
		JLabel FirstFlight = new JLabel("From:");
		FirstFlight.setVerticalAlignment(SwingConstants.BOTTOM);
		FirstFlight.setHorizontalAlignment(SwingConstants.LEFT);
		FirstFlight.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		FirstFlight.setBounds(371, 149, 90, 22);
		frmAirline.getContentPane().add(FirstFlight);
		
		JLabel FlightDestination = new JLabel("Destination:");
		FlightDestination.setVerticalAlignment(SwingConstants.BOTTOM);
		FlightDestination.setHorizontalAlignment(SwingConstants.LEFT);
		FlightDestination.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		FlightDestination.setBounds(371, 182, 90, 22);
		frmAirline.getContentPane().add(FlightDestination);
		
		JLabel Depature_Terminal = new JLabel("Terminal 1:");
		Depature_Terminal.setVerticalAlignment(SwingConstants.BOTTOM);
		Depature_Terminal.setHorizontalAlignment(SwingConstants.LEFT);
		Depature_Terminal.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		Depature_Terminal.setBounds(371, 215, 90, 22);
		frmAirline.getContentPane().add(Depature_Terminal);
		
		JLabel Arrival_Terminal = new JLabel("Terminal 2:");
		Arrival_Terminal.setVerticalAlignment(SwingConstants.BOTTOM);
		Arrival_Terminal.setHorizontalAlignment(SwingConstants.LEFT);
		Arrival_Terminal.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		Arrival_Terminal.setBounds(371, 248, 90, 22);
		frmAirline.getContentPane().add(Arrival_Terminal);
		
		JLabel Airline = new JLabel("Airline:");
		Airline.setVerticalAlignment(SwingConstants.BOTTOM);
		Airline.setHorizontalAlignment(SwingConstants.LEFT);
		Airline.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		Airline.setBounds(371, 116, 90, 22);
		frmAirline.getContentPane().add(Airline);
		
		JTF_FlightFrom = new JTextField();
		JTF_FlightFrom.setBounds(492, 149, 130
				, 20);
		frmAirline.getContentPane().add(JTF_FlightFrom);
		JTF_FlightFrom.setColumns(10);
		
		JTF_Destination = new JTextField();
		JTF_Destination.setColumns(10);
		JTF_Destination.setBounds(492, 182, 130, 20);
		frmAirline.getContentPane().add(JTF_Destination);
		
		JTF_TerminalDeparture = new JTextField();
		JTF_TerminalDeparture.setColumns(10);
		JTF_TerminalDeparture.setBounds(492, 215, 130, 20);
		frmAirline.getContentPane().add(JTF_TerminalDeparture);
		
		JTF_TerminalArrival = new JTextField();
		JTF_TerminalArrival.setColumns(10);
		JTF_TerminalArrival.setBounds(492, 248, 130, 20);
		frmAirline.getContentPane().add(JTF_TerminalArrival);
		
		JTF_Airline = new JTextField();
		JTF_Airline.setColumns(10);
		JTF_Airline.setBounds(492, 116, 130, 20);
		frmAirline.getContentPane().add(JTF_Airline);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(null);
		panel_1_2.setBackground(Color.BLACK);
		panel_1_2.setBounds(330, 67, 2, 391);
		frmAirline.getContentPane().add(panel_1_2);
		
		JLabel DepartTime = new JLabel("Departure Time:");
		DepartTime.setVerticalAlignment(SwingConstants.BOTTOM);
		DepartTime.setHorizontalAlignment(SwingConstants.LEFT);
		DepartTime.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		DepartTime.setBounds(371, 281, 120, 22);
		frmAirline.getContentPane().add(DepartTime);
		
		JLabel ArrivalTime = new JLabel("Arrival Time:");
		ArrivalTime.setVerticalAlignment(SwingConstants.BOTTOM);
		ArrivalTime.setHorizontalAlignment(SwingConstants.LEFT);
		ArrivalTime.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		ArrivalTime.setBounds(371, 310, 111, 22);
		frmAirline.getContentPane().add(ArrivalTime);
		
		JTF_DepartTime = new JTextField();
		JTF_DepartTime.setColumns(10);
		JTF_DepartTime.setBounds(492, 283, 130, 20);
		frmAirline.getContentPane().add(JTF_DepartTime);
		
		JTF_ArrivalTime = new JTextField();
		JTF_ArrivalTime.setColumns(10);
		JTF_ArrivalTime.setBounds(492, 311, 130, 20);
		frmAirline.getContentPane().add(JTF_ArrivalTime);
		
		JLabel FlightNum = new JLabel("Flight Number:");
		FlightNum.setVerticalAlignment(SwingConstants.BOTTOM);
		FlightNum.setHorizontalAlignment(SwingConstants.LEFT);
		FlightNum.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		FlightNum.setBounds(371, 343, 111, 22);
		frmAirline.getContentPane().add(FlightNum);
		
		JTF_FlightNum = new JTextField();
		JTF_FlightNum.setColumns(10);
		JTF_FlightNum.setBounds(492, 345, 130, 20);
		frmAirline.getContentPane().add(JTF_FlightNum);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBorder(null);
		panel_1_3.setBackground(Color.BLACK);
		panel_1_3.setBounds(200, 37, 230, 2);
		frmAirline.getContentPane().add(panel_1_3);
		
		JButton btnNewButton = new JButton("ADD FLIGHT");
		btnNewButton.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btnNewButton.setBounds(371, 406, 120, 25);
		frmAirline.getContentPane().add(btnNewButton);
		
		table_1 = new JTable();
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setBounds(10, 282, 310, 150);
		frmAirline.getContentPane().add(table_1);
		
		JLabel DeleteFlight = new JLabel("Delete Flight");
		DeleteFlight.setVerticalAlignment(SwingConstants.BOTTOM);
		DeleteFlight.setHorizontalAlignment(SwingConstants.LEFT);
		DeleteFlight.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		DeleteFlight.setBounds(10, 253, 111, 22);
		frmAirline.getContentPane().add(DeleteFlight);
		
		JLabel Verification = new JLabel("Waiting Verification ");
		Verification.setVerticalAlignment(SwingConstants.BOTTOM);
		Verification.setHorizontalAlignment(SwingConstants.LEFT);
		Verification.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		Verification.setBounds(10, 46, 150, 22);
		frmAirline.getContentPane().add(Verification);

	}
}
