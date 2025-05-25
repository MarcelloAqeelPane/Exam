package question1;


abstract class Employee {
		private String name;
  
			//constructor
			public Employee(String name) {
					this.name = name;
			}
  
			//getter
			public String getName() {
					return name;
			}
  
  //abstract method to calculate salary
  public abstract double calculateSalary();
  
  		//method to display salary information
  			public void displaySalary() {
  					System.out.println("Salary of " + this.getClass().getSimpleName() + " " + 
  							getName() + ": Rp" + calculateSalary());
  				}
}