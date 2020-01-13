
package Gym;

/**
 *
 * @author Morgan
 */
public class Staff extends Person {
    
    //Attributes
    private double wages;
    private JobRoles jobRole;
    
    //Constructor
    public Staff(String forename, String surname, int age, double wages, JobRoles jobRole){
        super(forename, surname, age);
        this.wages = wages;
        this.jobRole = jobRole;
    }
    
    //Methods
    public double getWages(){
        return wages;
    }
    
    public JobRoles getRole(){
        return jobRole;
    }
    
    public void setWages(double wages){
        this.wages = wages;
    }
    
    public String toString(){
        return super.toString() + "\nWages: " + wages + "\nJob Role: " + jobRole;
    }
    
    
}
