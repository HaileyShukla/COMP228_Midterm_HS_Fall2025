/*
 * This is the driver class.
 * Author: HaileyShukla
 * COMP228Midterm Fall 2025
 */
package com.hs.midterm;

//I created 3 hourly and 3 commission applicants and printed them using the driver class
public class DriverMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hourly Applicants");
		System.out.println("------------------");
        HourlyApplicant h1 = new HourlyApplicant("Hailey", "Shukla", "123-456-789", 25.0, 40);
        HourlyApplicant h2 = new HourlyApplicant("Sam", "Lee", "234-567-890", 20.5, 35);
        HourlyApplicant h3 = new HourlyApplicant("Evan", "Chen", "345-678-901", 30.0, 20);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        System.out.println("\nCommission Applicants");
        System.out.println("-------------------------");
        CommissionApplicant c1 = new CommissionApplicant("Lisa", "Smith", "456-789-012", 10000, 0.12);
        CommissionApplicant c2 = new CommissionApplicant("Maya", "Singh", "567-890-123", 5000, 0.08);
        CommissionApplicant c3 = new CommissionApplicant("Noah", "Nguyen", "678-901-234", 15000, 0.10);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
	}

}
