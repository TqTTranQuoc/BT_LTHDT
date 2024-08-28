package Chuong3;
/*
 * @description: This is a sample code header.
 * @author: Thai, Tran Quoc
 * @version: 1.0
 * @created: 21-Aug-2024 8:12:21 AM
 */

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
    private static final double WEEKS_PER_YEAR = 52;
    private double annualSalary;

    public SalariedEmployee() {
        super();
        this.annualSalary = 0.0;
    }

    public SalariedEmployee(String id, String name, LocalDate dob, double annualSalary) {
        super(id, name, dob);
        this.annualSalary = annualSalary;
    }

    @Override
    public double weeklyPay() {
        return annualSalary / WEEKS_PER_YEAR;
    }
}