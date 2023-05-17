/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline_ticketing_system;

import airline_ticketing_system.Code.Connect;
import airline_ticketing_system.Code.Flight;


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
	private JTable tblWaitingVerificaiton;
	private JTextField JTF_FlightID;
	private JTextField JTF_Departure;
	private JTextField JTF_Arrival;
	private JTextField JTF_TicketPrice;
	private JTextField JTF_Airline;
	private JTextField JTF_Status;
	private JTextField JTF_SeatsAvailable;
	private JTable tblDeleteFlight;

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
        Connect conn=null;
	/**
	 * Create the application.
	 */
	public AdminWindow() {
		initialize();
                conn = new Connect();
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
		
		tblWaitingVerificaiton = new JTable();
		tblWaitingVerificaiton.setBorder(new LineBorder(new Color(0, 0, 0)));
		tblWaitingVerificaiton.setBounds(10, 79, 310, 150);
		frmAirline.getContentPane().add(tblWaitingVerificaiton);
		
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
		
		JLabel FlightID = new JLabel("FlightID:");
		FlightID.setVerticalAlignment(SwingConstants.BOTTOM);
		FlightID.setHorizontalAlignment(SwingConstants.LEFT);
		FlightID.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		FlightID.setBounds(371, 160, 90, 22);
		frmAirline.getContentPane().add(FlightID);
		
		JLabel FlightDestination = new JLabel("Depature:");
		FlightDestination.setVerticalAlignment(SwingConstants.BOTTOM);
		FlightDestination.setHorizontalAlignment(SwingConstants.LEFT);
		FlightDestination.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		FlightDestination.setBounds(371, 190, 90, 22);
		frmAirline.getContentPane().add(FlightDestination);
		
		JLabel FlightArrival = new JLabel("Arrival:");
		FlightArrival.setVerticalAlignment(SwingConstants.BOTTOM);
		FlightArrival.setHorizontalAlignment(SwingConstants.LEFT);
		FlightArrival.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		FlightArrival.setBounds(371, 220, 90, 22);
		frmAirline.getContentPane().add(FlightArrival);
		
		JLabel TicketPrice = new JLabel("Ticket Price:");
		TicketPrice.setVerticalAlignment(SwingConstants.BOTTOM);
		TicketPrice.setHorizontalAlignment(SwingConstants.LEFT);
		TicketPrice.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		TicketPrice.setBounds(371, 250, 90, 22);
		frmAirline.getContentPane().add(TicketPrice);
		
		JLabel Airline = new JLabel("Airline:");
		Airline.setVerticalAlignment(SwingConstants.BOTTOM);
		Airline.setHorizontalAlignment(SwingConstants.LEFT);
		Airline.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		Airline.setBounds(371, 130, 90, 22);
		frmAirline.getContentPane().add(Airline);
		
		JTF_FlightID = new JTextField();
		JTF_FlightID.setBounds(492, 160, 130
				, 20);
		frmAirline.getContentPane().add(JTF_FlightID);
		JTF_FlightID.setColumns(10);
		
		JTF_Departure = new JTextField();
		JTF_Departure.setColumns(10);
		JTF_Departure.setBounds(492, 190, 130, 20);
		frmAirline.getContentPane().add(JTF_Departure);
		
		JTF_Arrival = new JTextField();
		JTF_Arrival.setColumns(10);
		JTF_Arrival.setBounds(492, 220, 130, 20);
		frmAirline.getContentPane().add(JTF_Arrival);
		
		JTF_TicketPrice = new JTextField();
		JTF_TicketPrice.setColumns(10);
		JTF_TicketPrice.setBounds(492, 250, 130, 20);
		frmAirline.getContentPane().add(JTF_TicketPrice);
		
		JTF_Airline = new JTextField();
		JTF_Airline.setColumns(10);
		JTF_Airline.setBounds(492, 130, 130, 20);
		frmAirline.getContentPane().add(JTF_Airline);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(null);
		panel_1_2.setBackground(Color.BLACK);
		panel_1_2.setBounds(330, 67, 2, 391);
		frmAirline.getContentPane().add(panel_1_2);
		
		JLabel Status = new JLabel("Status:");
		Status.setVerticalAlignment(SwingConstants.BOTTOM);
		Status.setHorizontalAlignment(SwingConstants.LEFT);
		Status.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		Status.setBounds(371, 280, 120, 22);
		frmAirline.getContentPane().add(Status);
		
		JLabel SeatsAvailable = new JLabel("Seats Available:");
		SeatsAvailable.setVerticalAlignment(SwingConstants.BOTTOM);
		SeatsAvailable.setHorizontalAlignment(SwingConstants.LEFT);
		SeatsAvailable.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		SeatsAvailable.setBounds(371, 310, 111, 22);
		frmAirline.getContentPane().add(SeatsAvailable);
		
		JTF_Status = new JTextField();
		JTF_Status.setColumns(10);
		JTF_Status.setBounds(492, 280, 130, 20);
		frmAirline.getContentPane().add(JTF_Status);
		
		JTF_SeatsAvailable = new JTextField();
		JTF_SeatsAvailable.setColumns(10);
		JTF_SeatsAvailable.setBounds(492, 310, 130, 20);
		frmAirline.getContentPane().add(JTF_SeatsAvailable);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBorder(null);
		panel_1_3.setBackground(Color.BLACK);
		panel_1_3.setBounds(200, 37, 230, 2);
		frmAirline.getContentPane().add(panel_1_3);
		
		JButton AddFlightBtn = new JButton("ADD FLIGHT");
		AddFlightBtn.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		AddFlightBtn.setBounds(371, 400, 120, 25);
		frmAirline.getContentPane().add(AddFlightBtn);
		
		tblDeleteFlight = new JTable();
		tblDeleteFlight.setBorder(new LineBorder(new Color(0, 0, 0)));
		tblDeleteFlight.setBounds(10, 282, 310, 150);
		frmAirline.getContentPane().add(tblDeleteFlight);
		
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
        
        //Methods
        public void Permit(){
            
        }
        public void AddFlight(){
            int Price = Integer.parseInt(JTF_TicketPrice.getText());
            //Flight flight = new Flight(JTF_Airline.getText(),JTF_FlightID.getText(),JTF_Departure.getText(),JTF_Arrival.getText(),Price,JTF_SeatsAvailable.getText());
        }
}
