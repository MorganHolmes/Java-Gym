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
public class Tester {
    public static void main(String[] args){
        Staff staffOne = new Staff("Barry","Cole",50,1000,JobRoles.MANAGER);
        System.out.println(staffOne.toString());
        Member memOne = new Member("Morgan","Holmez",21,177,177.8,GymGoal.BiggerByTheDay);
        System.out.println(memOne.toString());
    
        
    }
   
    
    
    
}
