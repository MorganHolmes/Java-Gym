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
        
        Member memTwo = new Member("Morgan","Craig",23,177,177.8,GymGoal.BiggerByTheDay);
        
        Member memThree = new Member("Barry","Craig",23,177,177.8,GymGoal.BiggerByTheDay);
        
        Member memFour = new Member("Nigel","WB",23,200,177.8,GymGoal.BiggerByTheDay);
        
        
        Class class1 = new Class(3,new Staff("Barry","Craig",22,100,JobRoles.MANAGER),2,ClassType.CORE);
        class1.addAttende(memOne);
        class1.addAttende(memTwo);
        class1.addAttende(memThree);
        class1.addAttende(memFour);
        
        Class class2 = new Class(5,new Staff("Frim","Craig",45,100,JobRoles.PT),2,ClassType.HIIT);
        class2.addAttende(memTwo);
        class2.addAttende(memThree);
        class2.addAttende(memOne);
        
        System.out.println(class1.toString());
        System.out.println(class2.toString());
    
        
    }
   
    
    
    
}
