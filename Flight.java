/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline_ticketing_system.Code;

/**
 *
 * @author Engilo Grave
 */
public class Flight {
    private String Airline;
    private String FlightID;
    private String Departure;
    private String Arrival;
    private String Status;
    
    private int TicketPrice;

    private int SeatsAvailable;
    
    private String DateofDeparture;
    private String DateofArrival;

    public Flight(String Airline, String FlightID, String Departure, String Arrival, int TicketPrice, String Status, int SeatsAvailable, String DateofDeparture, String DateofArrival) {
        this.Airline = Airline;
        this.FlightID = FlightID;
        this.Departure = Departure;
        this.Arrival = Arrival;
        this.TicketPrice = TicketPrice;
        this.Status = Status;
        this.SeatsAvailable = SeatsAvailable;
        this.DateofDeparture = DateofDeparture;
        this.DateofArrival = DateofArrival;
    }
    
    public Flight(String DateofDeparture, String DateofArrival) {
        this.DateofDeparture = DateofDeparture;
        this.DateofArrival = DateofArrival;
    }
    
    public Flight(String Airline, String FlightID, String Departure, String Arrival, int TicketPrice, int SeatsAvailable, String Status) {
        this.Airline = Airline;
        this.FlightID = FlightID;
        this.Departure = Departure;
        this.Arrival = Arrival;
        this.TicketPrice = TicketPrice;
        this.Status = Status;
        this.SeatsAvailable = SeatsAvailable;
    }
    
    

    public String getDateofDeparture() {
        return DateofDeparture;
    }

    public String getDateofArrival() {
        return DateofArrival;
    }
    
    public void setDateofDeparture(String DateofDeparture) {
        this.DateofDeparture = DateofDeparture;
    }

    public void setDateofArrival(String DateofArrival) {
        this.DateofArrival = DateofArrival;
    }
    
    public String getAirline() {
        return Airline;
    }

    public void setAirline(String Airline) {
        this.Airline = Airline;
    }

    public String getFlightID() {
        return FlightID;
    }

    public void setFlightID(String FlightID) {
        this.FlightID = FlightID;
    }

    public String getDeparture() {
        return Departure;
    }

    public void setDeparture(String Departure) {
        this.Departure = Departure;
    }

    public String getArrival() {
        return Arrival;
    }

    public void setArrival(String Arrival) {
        this.Arrival = Arrival;
    }

    public int getTicketPrice() {
        return TicketPrice;
    }

    public void setTicketPrice(int TicketPrice) {
        this.TicketPrice = TicketPrice;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getSeatsAvailable() {
        return SeatsAvailable;
    }

    public void setSeatsAvailable(int SeatsAvailable) {
        this.SeatsAvailable = SeatsAvailable;
    }
    
}
