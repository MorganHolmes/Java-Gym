
package Gym;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;


/**
 *
 * @author Morgan
 */
public class Gym implements GymInterface {
    //Attributes
    private String gymName;
    private ArrayList<Class> classes = new ArrayList<Class>();
    private ArrayList<Equipment> gymEquipment = new ArrayList<Equipment>();
    private HashMap<Integer,Member> gymMembers = new HashMap<Integer,Member>();
    private HashMap<Integer,Staff> staff = new HashMap<Integer,Staff>();
    
    
    public Gym(String gymName){
        this.gymName = gymName;
        setUpMembers();
        setUpStaff();
        setUpEquipment();
        setUpClasses();
    }
    
    //Methods
    public String getAllStaff(){
        String staffDet = "";
        for (Map.Entry mapElement : staff.entrySet()) { 
            //String key = (String)mapElement.getKey(); 
  
            Staff temp = (Staff)mapElement.getValue();
            staffDet = staffDet + temp.toString();
 
        } 
        
        return staffDet;
    };
    
    public String getStaff(int staffNum){
        if(staff.get(staffNum) == null){
            return "No Staff With The Searched Number";
        }else{
            return staff.get(staffNum).toString();
        }
    };
    
    public void addStaff(Staff newStaff){
        staff.put(newStaff.getNum(),newStaff);
    }
    
    public void removeStaff(int staffNumber){
        //Removes the staff from the hashmap [MWH]
        staff.remove(staffNumber);
        
    }
   
    public void addClass(){
        
    };
    public void removeClass(){
        
    };
    
    public void removeEquipment(){
        
    };
    public void addEquipment(){
        
    };
    
    public String getMembers(){
        return "";
    };
    public void addMember(){
        
    };
    public void removeMember(){
        
    };
    
    //Set up methods [MWH]
    private void setUpMembers(){
        Member memOne = new Member("Morgan","Holmez",21,170,177,GymGoal.BiggerByTheDay);
        gymMembers.put(memOne.getNum(),memOne);
        
        Member memTwo = new Member("Craig","BigArms",20,199,110,GymGoal.SmallerByTheDay);
        gymMembers.put(memTwo.getNum(),memTwo);
        
        Member memThree = new Member("Barry","BigBoy",30,300,100,GymGoal.BiggerByTheDay);
        gymMembers.put(memThree.getNum(), memThree);
        
        Member memFour = new Member("Nigel","OneTickle",34,350,180,GymGoal.SmallerByTheDay);
        gymMembers.put(memFour.getNum(), memFour);
        
    }
    private void setUpStaff(){
        Staff staffOne = new Staff("Lando","January",50,100.0,JobRoles.MANAGER);
        staff.put(staffOne.getNum(), staffOne);
        
        Staff staffTwo = new Staff("Craig","Joey",43,64.9,JobRoles.PT);
        staff.put(staffTwo.getNum(), staffTwo);
        
        Staff staffThree = new Staff("Craig","Goodman",23,43,JobRoles.HELPER);
        staff.put(staffThree.getNum(), staffThree);
        
    }
    private void setUpEquipment(){
        Equipment epOne = new Equipment("Preacher Machine","Apollo");
        gymEquipment.add(epOne);
        
        Equipment epTwo = new Equipment("Smith","Apollo");
        gymEquipment.add(epTwo);
        
        Equipment epThree = new Equipment("Dumbell Rack","Apollo");
        gymEquipment.add(epThree);
        
        Equipment epFour = new Equipment("Squat Rack","Porc");
        gymEquipment.add(epFour);
    }
    private void setUpClasses(){
        Class classOne = new Class(10, staff.get(5),2, ClassType.LIFTING);
        classes.add(classOne);
        
        Class classTwo = new Class(15, staff.get(5), 1, ClassType.CORE);
        classes.add(classTwo);
        
        Class classThree = new Class(11, staff.get(5), 2, ClassType.HIIT);
        classes.add(classThree);
    }
    
 
    
    
}
