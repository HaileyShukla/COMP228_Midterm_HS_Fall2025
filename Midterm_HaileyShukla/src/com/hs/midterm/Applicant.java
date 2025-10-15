/*
 * This is the abstract class for all the applicants.
 * Author: HaileyShukla
 * COMP228Midterm Fall 2025
 */
package com.hs.midterm;

public abstract class Applicant {
	private String firstName;
	private String lastName;
	private String socialInsurance; // I'll keep this as string since only basic validation is required.
	
	//basic validation check for null and to ensure its not empty
	public Applicant(String firstName, String lastName, String socialInsurance) {
		if (firstName ==null||firstName.trim().isEmpty())
			throw new IllegalArgumentException("First name cannot be empty");
		if (lastName ==null|| lastName.trim().isEmpty())
			throw new IllegalArgumentException("Last name cannot be empty");
		if (socialInsurance ==null|| socialInsurance.trim().isEmpty())
			throw new IllegalArgumentException("Social insurance cannot be empty");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialInsurance = socialInsurance;
	}
	
	//getter methods
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public String getSocialInsurance() {return socialInsurance;} 
	
	//every subclass needs to implement this
	public abstract double earnings();
	
	@Override
	public String toString() {
		return String.format("%s %s (SIN: %s)", getFirstName(), getLastName(), getSocialInsurance());
	}
	
	
}
