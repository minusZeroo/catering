/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.model;

/**
 *
 * @author @minuszeroo
 */
public class WeekendEvent extends Event{
    
    public static final double WEEKEND_EXTRA_COST = 5.00;
    private static final double WEEKEND_FLAT_RATE = 200.00;

    public WeekendEvent() {
    }

    public WeekendEvent(String hostName, int numberOfGuests) {
        super(hostName, numberOfGuests);
    }
    
    
    
    public double calaculateCost() {
        return super.calculateCost() + WEEKEND_FLAT_RATE + (numberOfGuests * WEEKEND_EXTRA_COST);
    }
    
}
