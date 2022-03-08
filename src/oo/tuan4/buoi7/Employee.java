/*
*  created date: Mar 08, 2022
*  author: cgm
*/
package oo.tuan4.buoi7;

import java.util.Scanner;

import oo.tuan4.buoi7.testprotected.Person;

public class Employee extends Person{

    private double salary;

    public Employee(String name, String birthday, double salary){
        super(name, birthday);
        this.salary = salary;
    }

    Scanner nhap;

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Employee [salary=" + salary + "]" + super.toString();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    
    
    
    

    
    
}
