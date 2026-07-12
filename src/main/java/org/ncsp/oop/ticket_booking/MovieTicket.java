package org.ncsp.oop.ticket_booking;

public class MovieTicket {

    private String movieName;
    private String seatNumber;
    private double price;

public MovieTicket(String movieName, String seatNumber, double price) {
    this.movieName = movieName;
    this.seatNumber = seatNumber;
    this.price = price;
 }

 public MovieTicket(){
 }
    
    public String getName(){
        return movieName;   
   }
    public String getSeatNumber(){
        return seatNumber;
    }
    public double getPrice(){
        return price;
    }

    
   public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public void setPrice(double price) {
        this.price = price;
    }
   public String printTicket(){
    return " Ticket: " + getName() + ", seat: " + getSeatNumber() + "," + " Price: $" + getPrice() ;

   }


}
