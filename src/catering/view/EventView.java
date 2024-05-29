/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.view;

import catering.model.Event;
import java.util.Scanner;

/**
 *
 * @author @minuszeroo
 */
public class EventView {
    
    Scanner scanner = new Scanner(System.in);
    
    public int getEventType() {
        System.out.println("Enter the type of event: ");
        System.out.println("1. Weekday Event");
        System.out.println("2. Weekend Event");
        return scanner.nextInt();
    }
    
    public Event getEventData() {
        System.out.println("Enter the host name: ");
        String name = scanner.next();
        System.out.println("Enter the number of guests: ");
        int guests = scanner.nextInt();
        return new Event(name, guests);        
    }
    
    public void displayCost(double cost) {
        System.out.println("Total Cost: R" + cost);
    }
    
    public void displayWeekendCost(double cost, double extraCost, double totalCost) {
        System.out.println("Cost: R" + cost);
        System.out.println("Extra Cost: R" + extraCost);
        System.out.println("Total Cost: R" + totalCost);       
    }
    
    

    
    
    
}
