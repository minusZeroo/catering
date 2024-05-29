/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catering.controller;

import catering.model.Event;
import catering.model.WeekendEvent;
import catering.view.EventView;

/**
 *
 * @author @minuszeroo
 */
public class EventController {
    
    private EventView view;
    
    public EventController(EventView view) {
        this.view = view;
    }
    
    
    public void calculateCost(Event event) {
        double cost = event.calculateCost();
        if (event instanceof WeekendEvent) {
            double extraCost = ((WeekendEvent) event).getNumberOfGuests()* ((WeekendEvent) event).WEEKEND_EXTRA_COST;
            double totalCost = cost + extraCost;
            view.displayWeekendCost(cost, extraCost, totalCost);
        } else {
            view.displayCost(cost);
        }       
        
    }
    
    public Event getEvent() {
        int eventType = view.getEventType();
        Event event;
        if (eventType == 2) {
            event = view.getEventData();
            return new WeekendEvent(event.getHostName(), event.getNumberOfGuests());
        } else {
            event = view.getEventData();
            return event;
        }
    }
    
    
    
    
    
}
