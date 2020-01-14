
package Gym;
import java.util.ArrayList;

/**
 *
 * @author Morgan
 */
public class Class {
    //Attribute
    private int numOfPeople;
    private Staff staffMember;
    private int numOfHours;
    private ClassType classType;
    private ClassState situation;
    //Stores the attendes to the session [MWH]
    private ArrayList<Person> attendes = new ArrayList<Person>();
    
    
    //Constructor
    public Class(int numOfPeople, Staff staffMember, int numOfHours, ClassType classType){
        this.numOfPeople = numOfPeople;
        this.numOfHours = numOfHours;
        this.staffMember = staffMember;
        this.classType = classType;
        this.situation = ClassState.UPCOMING;
                
    }
    
    //Methods
    public void addAttende(Member mem){
        attendes.add(mem);
    }
    
    public void removeAttende(int num){
        if(attendes.isEmpty() == false){
            /*For each loop. Goes through the loop.
            Each element of attendes is stored in per.
            Per is then tested and potentially removed from the array list.
            */
            for(Person per : attendes){
                if(per.getNum() == num){
                    attendes.remove(per);
                }
            }
        }
    }
    
    public String getAttende(){
        String listOfAttendes = "";
        if(attendes.isEmpty() == false){
            for(Person per : attendes){
                listOfAttendes = listOfAttendes + "\n" + per.toString();
            }
        }
        return listOfAttendes;
    }
    
    public void setStaffMember(Staff staff){
        this.staffMember = staff;
    }
    
    public void setStatus(ClassState state){
        this.situation = state;
    }
    
    public String getStatus(){
        return ClassState.stateToString(situation); 
    }
    
    public int getNumOfPeople(){
        return numOfPeople;
    }
    
    public void setStatus(String state){
        if(state.equals(ClassState.stateToString(ClassState.INPROGRESS))){
            this.situation = ClassState.INPROGRESS;
        }
        else if(state.equals(ClassState.stateToString(ClassState.CANCELLED))){
                this.situation = ClassState.CANCELLED;
        }
        else if(state.equals(ClassState.stateToString(ClassState.UPCOMING))){
                this.situation = ClassState.UPCOMING;
        }
    }
    
    
    
    
}
