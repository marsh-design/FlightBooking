/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author h36grewa
 */
public class Ticket {
    private Passenger passenger; 
    private Flight flight; 
    private double price;
    private static int ticketnum;

    public Ticket(Passenger p, Flight flight, double price)
    {
        this.passenger = p;
        this.flight = flight;
        this.price = price;
    }
    
    public void setpassenger (Passenger p)
    {
        this.passenger =p;
    }
    
    public Passenger getpassenger()
    {
        return this.passenger;
    }
    
    public void setflight(Flight f)
    {
        this.flight = f;
    }
    
    public Flight getFlight()
    {
        return this.flight;
    }
    
    public void setprice(double p)
    {
        this.price =p;
    }
    
    public double getprice()
    {
        return this.price;
    }
    
    @Override
    public String toString()
    {
        return (passenger.getname() + ", Flight " + flight.getflightNumber() + ", " + 
                flight.getorigin() + " to "+ flight.getdestination() + " , " 
                + flight.getdeparturetime() + ", original price: " + 
                flight.getoriginalPrice() + "$, ticket price: " + 
                this.price);
    }
              
    
}
