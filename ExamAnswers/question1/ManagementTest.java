package question1;

public class ManagementTest {
    public static void main(String[] args) {
        //create full-time and part-time employee objects
        Employee fulltime = new FullTimeEmployee("Michael Reves", 2505000);
        Employee FullTime2 = new FullTimeEmployee("Mitchel Heath", 320000);
        Employee Parttime = new PartTimeEmp("Sarah connor", 341500, 10);
        Employee parttime = new PartTimeEmp("Angeline Loss", 32210, 40);
        
        //display employee salaries
        System.out.println("Salary List-----------");
        fulltime.displaySalary();
        FullTime2.displaySalary();
        Parttime.displaySalary();
        parttime.displaySalary();
        System.out.println("End of Salary List-----------");
    }
}