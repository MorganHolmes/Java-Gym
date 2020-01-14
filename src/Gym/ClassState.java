/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gym;

/**
 *
 * @author Morgan
 */
public enum ClassState {
    INPROGRESS,
    CANCELLED,
    UPCOMING;
    
    public static String stateToString(ClassState state){
        switch(state){
            case INPROGRESS:
                return "In Progress";
            case CANCELLED:
                return "Cancelled";
            case UPCOMING:
                return "Upcoming";
        }
        return "Invalid State";
    }
    
    
    
}
