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
    
    public void addClass(Class newClass);
    public void removeClass(int x);
    
    public void removeEquipment();
    public void addEquipment();
    
    public String getMembers();
    public void addMember();
    public void removeMember();
    
    
   
    
    
}
