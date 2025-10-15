/*
 * Author: HaileyShukla
 * COMP228Midterm Fall 2025
 */
package com.hs.midterm;

//for hourly applicant: earnings = wage * hours
public class HourlyApplicant extends Applicant {
	private double wage; //hourly wage
	private double hours; //number of hours worked
	
	//five-arguement constructor
	public HourlyApplicant(String firstName, String lastName, String socialInsurance, double wage, double hours) {
		super (firstName, lastName, socialInsurance);
		
		//throw exception when wage is not valid
		if (wage < 0.0) {
			throw new IllegalArgumentException("Wage must be greater than or equal to 0.0");
		}
		
		// throw exception when hours are not valid
        if (hours < 0.0) {
            throw new IllegalArgumentException("Hours must be greater than or equal to 0.0");
        }
		this.wage = wage;
		this.hours = hours;
	}
	//assign setters
	public void setWage(double wage) {
        if (wage < 0.0) throw new IllegalArgumentException("Wage must be greater than or equal to 0.0");
        this.wage = wage;
    }
    public void setHours(double hours) {
        if (hours < 0.0) throw new IllegalArgumentException("Hours must be greater than or equal to 0.0");
        this.hours = hours;
    }
    
    //add getters
    public double getWage() {return wage;}
    public double getHours() {return hours;}
    
    //Overriding
    @Override 
    public double earnings() {
    	return wage *hours;
    }
    @Override 
    public String toString() {
    	return String.format(
                "Hourly applicant: %s%nwage: %.2f%nhours: %.2f%nearnings: %.2f",
                super.toString(), getWage(), getHours(), earnings());
    }
}


