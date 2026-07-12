package org.ncsp.oop.ticket_booking;

public class MovieTicket {

    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName, String seatNumber, double price){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    

    }
    public String getName(){
        return movieName;   
    }
    public String getseatNumber(){
        return seatNumber;
    }
    public double getprice(){
        return price;
    }

   public void printTicket(){
    System.out.println("Ticket: " +  movieName + "," + " Seat: " + seatNumber + "," + " price: $" + price);
     




   } 


}
