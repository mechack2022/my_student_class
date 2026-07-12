package org.ncsp.oop.ticket_booking;

import java.util.ArrayList;


public class TicketMain {
     public static void main(String[] args) {

        ArrayList<MovieTicket> ticket = new ArrayList<>();
        MovieTicket m1 = new MovieTicket("Dune", "A1", 12.50);
        MovieTicket m2 = new MovieTicket("motana", "B2", 15.00);
        MovieTicket m3 = new MovieTicket("Harrypotter", "C1", 40.50);
        MovieTicket m4 = new MovieTicket("Badland", "D7", 60.00);
        MovieTicket m5 = new MovieTicket();
        m5.setMovieName("fast and furious");
        m5.setSeatNumber("E1");
        m5.setPrice(70.0);
        ticket.add(m1);
        ticket.add(m2);
        ticket.add(m3);
        ticket.add(m4);
        ticket.add(m5);
        double totalrevenue = 0;
        for(MovieTicket e : ticket){
              String ticketInfo = e.printTicket();
              System.out.println(ticketInfo);
                totalrevenue += e.getPrice();
        }
        System.out.println("Total Revenue: $" + totalrevenue);
}


}




