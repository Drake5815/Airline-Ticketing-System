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
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

import java.sql.*;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Engilo Grave
 */
public class AdminWindow {
    
	private JFrame frmAirline;
        
	private JTable VerifySearch;
	private JTable FlightTable;
        
	private JTextField tfSearchFlight;
        private JTextField textField;
	private JTextField tfAirline;
	private JTextField tfFlightID;
	private JTextField tfDeparture;
	private JTextField tfArrival;
	private JTextField tfTicketPrice;
	private JTextField tfStatus;
	private JTextField tfSeats;
        
        private JDateChooser DepartureDate;
        private JDateChooser ArrivalDate;
        
        private ArrayList<Flight> flight;
        private DefaultTableModel tbl;
        
        private int Status = 0;
	
        private ResetPass rp;
        
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
                display();
                displayFlight();
	}

        public AdminWindow(String s){}
        
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAirline =  new JFrame();
		frmAirline.setResizable(false);
		frmAirline.setTitle("Airline Transportation Ticketing System");
		frmAirline.setBounds(100, 100, 650, 500);
		frmAirline.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAirline.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Engilo Grave\\Desktop\\ATTS\\Logo.png"));
		frmAirline.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 50, 614, 400);
		frmAirline.getContentPane().add(tabbedPane);
		
		JPanel pnl_NewFlight = new JPanel();
		tabbedPane.addTab("Add New Flight", null, pnl_NewFlight, null);
		pnl_NewFlight.setLayout(null);
		
		JLabel lblAirline = new JLabel("Airline:");
		lblAirline.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		lblAirline.setBounds(10, 11, 60, 14);
		pnl_NewFlight.add(lblAirline);
		
		JLabel lblFlightID = new JLabel("FlightID:");
		lblFlightID.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		lblFlightID.setBounds(10, 42, 60, 14);
		pnl_NewFlight.add(lblFlightID);
		
		JLabel lblDeparture = new JLabel("Departure:");
		lblDeparture.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		lblDeparture.setBounds(10, 73, 75, 14);
		pnl_NewFlight.add(lblDeparture);
		
		JLabel lblArrival = new JLabel("Arrival:");
		lblArrival.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		lblArrival.setBounds(10, 104, 75, 14);
		pnl_NewFlight.add(lblArrival);
		
		JLabel lblTicketPrice = new JLabel("Ticket Price:");
		lblTicketPrice.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		lblTicketPrice.setBounds(10, 138, 90, 14);
		pnl_NewFlight.add(lblTicketPrice);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		lblStatus.setBounds(10, 166, 90, 14);
		pnl_NewFlight.add(lblStatus);
		
		JLabel lblSeats = new JLabel("Seats Available:");
		lblSeats.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		lblSeats.setBounds(10, 197, 115, 14);
		pnl_NewFlight.add(lblSeats);
		
		tfAirline = new JTextField();
		tfAirline.setBounds(135, 8, 86, 20);
		pnl_NewFlight.add(tfAirline);
		tfAirline.setColumns(10);
		
		tfFlightID = new JTextField();
		tfFlightID.setBounds(135, 39, 86, 20);
		pnl_NewFlight.add(tfFlightID);
		tfFlightID.setColumns(10);
		
		tfDeparture = new JTextField();
		tfDeparture.setBounds(135, 70, 86, 20);
		pnl_NewFlight.add(tfDeparture);
		tfDeparture.setColumns(10);
		
		tfArrival = new JTextField();
		tfArrival.setBounds(135, 101, 86, 20);
		pnl_NewFlight.add(tfArrival);
		tfArrival.setColumns(10);
		
		tfTicketPrice = new JTextField();
		tfTicketPrice.setBounds(135, 135, 86, 20);
		pnl_NewFlight.add(tfTicketPrice);
		tfTicketPrice.setColumns(10);
		
		tfStatus = new JTextField();
		tfStatus.setBounds(135, 163, 86, 20);
		pnl_NewFlight.add(tfStatus);
		tfStatus.setColumns(10);
		
		tfSeats = new JTextField();
		tfSeats.setBounds(135, 194, 86, 20);
		pnl_NewFlight.add(tfSeats);
		tfSeats.setColumns(10);
		
		JLabel lblFlightDepartureDate = new JLabel("Flight Departure Date:");
		lblFlightDepartureDate.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		lblFlightDepartureDate.setBounds(280, 11, 160, 14);
		pnl_NewFlight.add(lblFlightDepartureDate);
		
		DepartureDate = new JDateChooser();
		DepartureDate.setBounds(450, 5, 125, 20);
		pnl_NewFlight.add(DepartureDate);
		
		JLabel lblFlightArrivalDate = new JLabel("Flight Arrival Date:");
		lblFlightArrivalDate.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		lblFlightArrivalDate.setBounds(280, 42, 160, 14);
		pnl_NewFlight.add(lblFlightArrivalDate);
		
		ArrivalDate = new JDateChooser();
		ArrivalDate.setBounds(450, 36, 125, 20);
		pnl_NewFlight.add(ArrivalDate);
		
		JButton AddFlight = new JButton("Add Flight");
		AddFlight.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		AddFlight.setBounds(207, 321, 200, 40);
		AddFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                                if(getDay(DepartureDate) > getDay(ArrivalDate)){
                                    JOptionPane.showMessageDialog(frmAirline, "Error");
                                } else {
                                    AddFlight();
                                }
                                Reset();
			}
		});
                pnl_NewFlight.add(AddFlight);
		
		JPanel pnlDeleteFlight = new JPanel();
		tabbedPane.addTab("Delete Flight", null, pnlDeleteFlight, null);
		pnlDeleteFlight.setLayout(null);
		
		FlightTable = new JTable();
		FlightTable.setBounds(10, 11, 589, 350);
                FlightTable.setModel(new DefaultTableModel(
                        new Object[][]{},new String[]{"Ariline","Departure Time","Departure","Arrival"}
                ){
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false
                    };
                    public boolean isCellEditable(int rowIndex, int columnIndex){
                        return canEdit [columnIndex];
                    }
                });
                FlightTable.addMouseListener(new MouseAdapter(){
                    public void mouseClicked(MouseEvent evt){
                        FlightTableMouseClicked(evt);
                    }
                });
		pnlDeleteFlight.add(FlightTable);
		
		JLabel lblNewLabel = new JLabel("ADMINISTRATION");
		lblNewLabel.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 16));
		lblNewLabel.setBounds(247, 11, 139, 14);
		frmAirline.getContentPane().add(lblNewLabel);

	}
        

    //Getters
    public JDateChooser getDepartureDate(){return DepartureDate;}
    
    public JDateChooser getArrivalDate() {return ArrivalDate;}

    public JFrame getFrmAirline() {return frmAirline;}
    
    //Methods
    public void show(boolean bool){
        AdminWindow window = new AdminWindow();
        window.frmAirline.setVisible(bool);
    }
    
    private void Reset(){
        tfAirline.setText("");
        tfFlightID.setText("");
        tfDeparture.setText("");
        tfArrival.setText("");
        tfTicketPrice.setText("");
        tfStatus.setText("");
        tfSeats.setText("");
        DepartureDate.setCalendar(null);
        ArrivalDate.setCalendar(null);
        
    }
    
    private void display(){
        String data[] = {"-Airline-","-Departure Time-","-Departure-","-Arrival-"};
        tbl = (DefaultTableModel) FlightTable.getModel();
        tbl.addRow(data);
    }
    
    public void displayFlight(){
        flight = conn.displayFlights();
        for(Flight c: flight){
            String data[] = {c.getAirline(),c.getDateofDeparture(),c.getDeparture(),c.getArrival()};
            tbl = (DefaultTableModel) FlightTable.getModel();
            tbl.addRow(data);
        }
    }
        
    public void AddFlight(){
        int Price = Integer.parseInt(tfTicketPrice.getText());
        int Seats = Integer.parseInt(tfSeats.getText());
        
        String dateDeparture = getDate(DepartureDate);
        String dateArrival = getDate(ArrivalDate);
        
            Flight flight = new Flight(tfAirline.getText(), tfFlightID.getText(), tfDeparture.getText(), tfArrival.getText(),Price,tfStatus.getText(),Seats,dateDeparture,dateArrival);
            if(conn.AddFlight(flight))
                JOptionPane.showMessageDialog(this.frmAirline, "New record added");
            else
                JOptionPane.showMessageDialog(this.frmAirline, "Flight already exsist");
    
            displayFlight();
    
    }
    
    public void FlightTableMouseClicked(MouseEvent evt){
        int choice = JOptionPane.showConfirmDialog(null, "Do you wanna DELETE flight", "Warning", JOptionPane.YES_NO_OPTION);
        
        int index = FlightTable.getSelectedRow();
        String airline = (String) FlightTable.getValueAt(index, 0);
        
        if(choice == JOptionPane.YES_OPTION){
            conn.DeleteFlight(airline);
        } else {
            JOptionPane.showMessageDialog(null, "Skip");
        }
    }
    
    public int getDay(JDateChooser Date){
        int day = 0;
        
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dFormat.format(Date.getDate());
        LocalDate DepartureDay = LocalDate.parse(date);
        day = DepartureDay.getDayOfMonth();
        
        return day;
    }
    
    public String getDate(JDateChooser date){
        String setDate;
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        setDate = dFormat.format(date.getDate());
        return setDate;
    }
    
}
