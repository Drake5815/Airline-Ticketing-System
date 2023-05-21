/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline_ticketing_system.Code;
import airline_ticketing_system.Code.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author Engilo Grave
 */
public class Connect {
    Connection conn=null;
    public Connect(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atts","root","");
            //JOptionPane.showMessageDialog(null, "Connected");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean registerUser(User user){
        Statement stmt;
        String sql=null;
        ResultSet rs=null;
        try {
            stmt = conn.createStatement();
            sql="select * from user where USERNAME='"+user.getUsername()+"'";
            rs =stmt.executeQuery(sql);
            if(rs.next()==false){
                sql="insert into user values('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getEmail()+"')";
                stmt.executeUpdate(sql);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    public int login(String username, String password){
        Statement stmt;
        String sql;
        ResultSet rs;
        String email = "Admin";
        try {
            stmt = conn.createStatement();
            sql = "select * from user where username='"+username+"' and password='"+password+"'";
            rs = stmt.executeQuery(sql);
            if (rs.next()==true) {
                sql = "select * from user where username='"+username+"' and password='"+password+"' and email='"+email+"'";
                rs = stmt.executeQuery(sql);
                if(rs.next() == true){
                    return 2;
                } else {
                    return 1;
                }
                
            }
            else
                return 0;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public boolean AddFlight(Flight flight){
        
        Statement stmt;
        String sql=null;
        ResultSet rs=null;
        try {
            stmt = conn.createStatement();
            sql="select * from flights where Airline='"+flight.getAirline()+"'";
            rs =stmt.executeQuery(sql);
            if(rs.next()==false){
                sql="insert into flights values('"+flight.getAirline()+"','"+flight.getFlightID()+"','"+flight.getDeparture()+"','"+flight.getArrival()+"','"+flight.getTicketPrice()+"','"+flight.getStatus()+"','"+flight.getSeatsAvailable()+"','"+flight.getDateofDeparture()+"','"+flight.getDateofArrival()+"')";
                stmt.executeUpdate(sql);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return false;
    }
    
    public void DeleteFlight(String airline){
        String sql;
        Statement stmt;
        ResultSet rs;
        
        try{
            stmt = conn.createStatement();
            sql = "Delete from flights where Airline ='"+airline+"'";
            stmt.executeUpdate(sql);
        } catch (SQLException ex){
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Flight> displayFlights(){
        ArrayList<Flight> flight = new ArrayList<Flight>();
        String sql = "select * from flights";
        Statement stmt;
        ResultSet rs;
        
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                Flight a = new Flight(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9));
                //a.setFlightID(FlightID);
                flight.add(a);
            }
        } catch (SQLException ex){
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flight;
    }
    
    public User getUser(String username){
        User user;
        String sql;
        Statement stmt;
        ResultSet rs;
        
        try {
            sql = "select * from user where USERNAME ='"+username+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            user = new User(rs.getString(1),rs.getString(2),rs.getString(3));
            return user;
        } catch (SQLException ex){
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public boolean ResetPass(User user){
        String sql;
        Statement stmt;
 
        
        String username = getUser(user.getUsername()).getUsername();
        String email = getUser(user.getUsername()).getEmail();
        
        
        try{
            sql = "update user set PASSWORD='"+user.getPassword()+"' where USERNAME='"+user.getUsername()+"'";
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            
        } catch(SQLException ex){
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    
}
