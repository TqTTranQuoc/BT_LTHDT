package Chuong3;
/*
 * @description: This is a sample code header.
 * @author: Thai, Tran Quoc
 * @version: 1.0
 * @created: 21-Aug-2024 8:12:21 AM
 */


import java.time.LocalDate;

public class Manager extends SalariedEmployee{
    private double weeklyBonus;

    public Manager() {
        super();
        this.weeklyBonus = 0.0;
    }

    public Manager(String id, String name, LocalDate dob, double annualSalary, double weeklyBonus) {
        super(id, name, dob, annualSalary);
        this.weeklyBonus = weeklyBonus;
    }

    public void setWeeklyBonus(double weeklyBonus) {
        this.weeklyBonus = weeklyBonus;
    }

    public double getWeeklyBonus() {
        return weeklyBonus;
    }

    public double weeklyPay() {
        return super.weeklyPay() + weeklyBonus;
    }
}