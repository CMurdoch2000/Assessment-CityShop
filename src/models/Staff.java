/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * Date 20/04/18
 * @author Callum Murdoch
 */
public class Staff extends User {
    /**
     * Staff class with getters & setters and constructors
     */
    private double salary;
    private String position;

    public Staff() {
        super();
    }

    public Staff(double salary, String position, String userName, String password, String firstName, String lastName) {
        super(userName, password, firstName, lastName);
        this.salary = salary;
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff{" + "salary=" + salary + ", position=" + position + '}';
    }
    
}
