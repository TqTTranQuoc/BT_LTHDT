package Chuong3;



import java.time.LocalDate;

public class TestPayrollSystem {
    public static void main(String[] args) {
        Employee emp1 = new HourlyEmloyee("A001", "Quoc Thai", LocalDate.of(2005, 1, 5), 50, 10);
        Employee emp2 = new SalariedEmployee("A002", "Monkey D. Luffy", LocalDate.of(1999, 1, 5), 50000);
        Employee emp3 = new Manager("A003", "Roronoa Zoro", LocalDate.of(1999, 1, 5), 50000, 5.0);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}