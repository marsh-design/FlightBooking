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
public abstract class Passenger {
    
    private String name;
    private int age;

    public Passenger(String n, int a)
    {
        this.name = n;
        this.age = a;
    }
    
    public void setname(String n)
    {
        this.name = n;
    }
    
    public String getname()
    {
        return this.name;
    }
    
    public void setage (int a)
    {
        this.age = a;
    }
    
    public int getage()
    {
        return this.age;
    }
    
    abstract double applyDiscount(double p);
  
}
