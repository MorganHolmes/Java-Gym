package Gym;

/**
 *
 * @author Morgan
 */
public class Equipment {
    //Attributes
    private String equipmentType;
    private String manufacturer;
    
    //Constructor
    public Equipment(String equipmentType, String manufacturer){
        this.equipmentType = equipmentType;
        this.manufacturer = manufacturer;
    }
    
    public String getType(){
        return equipmentType;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public String toString(){
        return "Type: " + equipmentType + "\nManufacturer: " + manufacturer;
    }
    
}
