package TestPrep1;

public abstract class Employee
{
	protected String name;
	protected double hourlyRate;
	protected int hoursWorked;
	
	public Employee(String name, double hourlyRate) {
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = 0;
	}
	
	public void setHoursWorked(int hours) {
		this.hoursWorked = hours;
	}
	
	public abstract double calculatePay();
	
	public String getName() {
		return name;
	}
}
