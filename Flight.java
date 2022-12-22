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
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private  int numberOfSeatsLeft;
    private double originalPrice;
    
    public Flight(int num, String start, String end, String deptime, int cap, double price)
    {
        flightNumber = num;
        origin = start;
        destination = end;
        departureTime= deptime;
        capacity = cap;
        numberOfSeatsLeft = cap;
        originalPrice = price;
        //All instance variables of the class have been instantiated.
        //NumberofSeatsLeft equals capacity as the plane is full
        
        if(origin.equals(destination)== true)  
        {
           throw new IllegalArgumentException("Origin and destination are the same");   
        }
           
    }

    public int getflightNumber()
    {
        return flightNumber;
    }
    public void setflightNumber(int n)
    {
        flightNumber = n;
    }
    public String getorigin()
    {
        return origin;
    }
    public void setorigin(String o)
    {
        origin = o;
    }
    public String getdestination()
    {
        return destination;
    }
    public void setDestination(String d)
    {
        destination = d;
    }
    public String getdeparturetime()
    {
        return departureTime;
    }
    public void setdeparturetime(String d)
    {
        departureTime = d;
    }
    public int getcapacity()
    {
        return capacity;
    }
    public void setcapacity(int c)
    {
        capacity = c;
    }
    public int getNumberofSeats()
    {
        return numberOfSeatsLeft;
    }
    public void setNumberofSeats(int n)
    {
        numberOfSeatsLeft =n;
    }
    public double getoriginalPrice()
    {
        return originalPrice;
    }
    public void setoriginalPrice(double p)
    {
        originalPrice = p;
    }
    public boolean bookaSeat()
    {
        if (numberOfSeatsLeft >0)
        {
            numberOfSeatsLeft --;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //Override a toString method
    @Override
    public String toString()
    {
        return ("Flight " + this.flightNumber + ", " + this.origin + " to " + 
                this.destination + " departing, " + this.departureTime + 
                ", original price: $ " + this.originalPrice+ ".");
    }
    
}
