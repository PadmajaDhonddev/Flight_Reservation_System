package com.company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegularTicket extends Ticket{

    private String specialServices;
    public RegularTicket(){}

    public RegularTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Passenger passenger, String specialServices) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled,
                flight, passenger);
        this.specialServices = specialServices;
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

}
