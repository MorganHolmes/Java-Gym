
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
    private static int uniNum = 0;
    
    //Constructor
    public Person(String forename, String surname, int age){
        this.forename = forename;
        this.surname = surname;
        this.age = age;
        uniNum++;
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
    
    public int getNum(){
        return uniNum;
    }
    
    public String toString(){
        return "Number: " + getNum() + "\nForename: " + forename + "\nSurname: " + surname + "\nAge: " + age;
    }
}
