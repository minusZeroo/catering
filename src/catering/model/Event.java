/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.model;

/**
 *
 * @author @minuszeroo
 */
public class Event {
    
    protected int numberOfGuests;
    private String hostName;
    private final double COST_PER_GUEST = 100.00;

    public Event() {
        this.numberOfGuests = 0;
        this.hostName = "No host";
    }

    public Event(int numberOfGuests, String hostName) {
        this.numberOfGuests = numberOfGuests;
        this.hostName = hostName;
    }   
    
    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
    
    public double calculateCost() {
        return this.numberOfGuests * COST_PER_GUEST;
    }
    
    @Override
    public String toString() {
        return "Event hosted by " + hostName + ", with " + numberOfGuests + " guests.";
    }
    
    
    
    
    
}
