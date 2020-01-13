
package Gym;

/**
 *
 * @author Morgan
 */
public abstract class Person {
    //Attributes
    private String forename;
    private String surname;    
    private int age;
    
    //Constructor
    public Person(String forename, String surname, int age){
        this.forename = forename;
        this.surname = surname;
        this.age = age;
    }
   

    //Methods
    public String getFullName(){
        return forename + " " + surname;
    }
    
    public String getForename(){
        return forename;
    }
    
    public int getAge(){
       return age;
    }
    
    public String toString(){
        return "Forename: " + forename + "\nSurname: " + surname + "\nAge: " + age;
    }
}
