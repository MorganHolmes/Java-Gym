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
public class Member extends Person {
    //Attributes
    private int weight;
    private double height;
    private GymGoal goal;
    
    
    //Constructors
    public Member(String forename, String surname, int age, int weight, double height, GymGoal goal){
        super(forename, surname, age);
        this.weight = weight;
        this.height = height;
        this.goal = goal;
    }
    
    //Methods
    public int getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }
    public GymGoal getGoal(){
        return goal;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public String toString(){
        return super.toString() + "\nWeight: " + weight + "\nHeight: " + height + "\nGym Goal: " + goal;
    }
}
