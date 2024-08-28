package Chuong3;



import java.time.LocalDate;

public class HourlyEmloyee extends Employee {
    private int hoursWorked;
    private double hourlyWage;

    public HourlyEmloyee(){
        super();
        this.hoursWorked = 0;
        this.hourlyWage = 0.0;
    }
    public HourlyEmloyee(String id , String name, LocalDate dob , int hoursWorked , double hourlyWage){
        super(id,name,dob);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage ;
    }
    @Override
    public double weeklyPay() {
        final int HOURS_MAX = 40;
        return hoursWorked > HOURS_MAX
                ? (HOURS_MAX * hourlyWage + (hoursWorked - HOURS_MAX) * 1.5 * hourlyWage)
                : hoursWorked * hourlyWage;
    }


}

