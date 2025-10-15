/*
 * Author: HaileyShukla
 * COMP228Midterm Fall 2025
 */
package com.hs.midterm;

//commission applicant: earnings = grossSales * comissionRate 
public class CommissionApplicant extends Applicant {
	private double grossSales; //weekly sales
	private double commissionRate; //percentage 
	
	//constructors with 5 arguments
	public CommissionApplicant(String firstName, String lastName, String socialInsurance,
            double grossSales, double commissionRate) {
		super(firstName, lastName, socialInsurance);
		
		//if grossSales is invalid throw an exception
		if (grossSales <0.0) {
			throw new IllegalArgumentException("Gross sales must be greater than or equal to 0.0");
		}
		// if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be greater 0.0 and less than 1.0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
	}
        //setting setters with the same checks
        public void setGrossSales(double grossSales) {
            if (grossSales < 0.0) throw new IllegalArgumentException("Gross sales must be >= 0.0");
            this.grossSales = grossSales;
        }
        public void setCommissionRate(double commissionRate) {
            if (commissionRate <= 0.0 || commissionRate >= 1.0)
                throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
            this.commissionRate = commissionRate;
        }
        
        //getters
        public double getGrossSales() { return grossSales; }
        public double getCommissionRate() { return commissionRate; }
        
        //calculate earnings with override
        @Override
        public double earnings() {
            return getCommissionRate() * getGrossSales();
        }
        
        //output
        @Override
        public String toString() {
            return String.format(
                "Commission applicant: %s%ngross sales: %.2f%ncommission rate: %.2f%nearnings: %.2f",
                super.toString(), getGrossSales(), getCommissionRate(), earnings());
        }

}
