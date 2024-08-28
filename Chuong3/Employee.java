package Chuong3;


import java.time.LocalDate;



public abstract class Employee {
    protected String id;
    protected String name;
    protected LocalDate dob;



    public Employee() {
        this.id = "";
        this.name = "";
        this.dob = LocalDate.now();
    }


    public Employee(String id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getDob() {
        return dob;
    }


    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // tien luong
    public abstract double weeklyPay();
    @Override
    public String toString(){
        return String.format("%-5s%-20s%15s%10.2f",id,name,dob,weeklyPay());
    }
}