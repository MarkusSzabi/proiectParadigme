package Problema1;

public class Employee {
    private String name;
    private String email;
    private double hourRate;
    private double capacity;
    private int freeDays;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getFreeDays() {
        return freeDays;
    }

    public void setFreeDays(int freeDays) {
        this.freeDays = freeDays;
    }

    public Employee(String name, String email, double hourRate, double capacity, int freeDays) {
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }

    public double calculateDailyIncome(){
        return this.capacity * hourRate;
    }

    public double calculateMonthlyIncome(){
        return calculateDailyIncome() * 30;
    }

    @Override
    public String toString(){
        return " Nume:" + this.name + " Email: " + this.email  + " Hour Rate: " +  this.hourRate + " Capacity: " +  this.capacity +  " FreeDays: " + this.freeDays + " Bani-Zi: " + this.calculateDailyIncome() + " Bani-Luna: " + this.calculateMonthlyIncome() ;
    }
}
