package question1;

class PartTimeEmp extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    
    //constructor
    public PartTimeEmp(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    //same implementation for part-time employee
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}