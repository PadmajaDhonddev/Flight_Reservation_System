package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Flight flightToday = new Flight("flight12","airline12",100,67);
        Passenger passengerToday = new Passenger("Street1","city1",
                "maharashtra","John","9420204356","john@gmail.com");

        Ticket ticket = new RegularTicket("3456","Mumbai","Delhi","10-01-2018 01:10:20",
                "10-01-2018 06:05:20","34D",5600.32f,false,
                flightToday,passengerToday,"food");

        String durationOfFlight = ticket.getFlightDuration();

        System.out.println("Duration of flight "+ flightToday+" is: "+durationOfFlight);


    }
}
