package Gym;

/**
 *
 * @author Morgan
 */
public interface GymInterface{
    //Methods
    public String getAllStaff();
    public String getStaff(int staffNumber);
    public void addStaff(Staff newStaff);
    public void removeStaff(int staffNumber);
    
    public void addClass();
    public void removeClass();
    
    public void removeEquipment();
    public void addEquipment();
    
    public String getMembers();
    public void addMember();
    public void removeMember();
    
    
   
    
    
}
