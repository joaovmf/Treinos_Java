package entities;

public class Functionary {

	public String name;
	public double salary;
	public double tax;
	
	public double netSalary() {
		return salary - tax;
		}
		public void increaseSalary(double percentage) {
		salary += netSalary() * percentage / 100.0;
		}
	
	
}
