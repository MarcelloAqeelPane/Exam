package question1;

class FullTimeEmployee extends Employee {
    private double monthlySalary;
    
    //constructor
    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }
    
    //calculate salary implementation for full-time employee
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}