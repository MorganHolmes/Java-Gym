
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
    //Stores the attendes to the session [MWH]
    private ArrayList<Person> attendes = new ArrayList<Person>();
    
    
    //Constructor
    public Class(int numOfPeople, Staff staffMember, int numOfHours, ClassType classType){
        this.numOfPeople = numOfPeople;
        this.numOfHours = numOfHours;
        this.staffMember = staffMember;
        this.classType = classType;
                
    }
    
    //Methods
    public void addAttende(Member mem){
        attendes.add(mem);
    }
    
    public void removeAttende(){}
    
    
    
    
}
