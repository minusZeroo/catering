/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catering;

import catering.controller.EventController;
import catering.model.Event;
import catering.view.EventView;

/**
 *
 * @author @minuszeroo
 */
public class Catering {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EventView view = new EventView();
        EventController controller = new EventController(view);
        Event event = controller.getEvent();
        controller.calculateCost(event);
        
    }
    
}
