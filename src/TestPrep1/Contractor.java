package TestPrep1;

public class Contractor extends Employee
{
	public Contractor(String name, double hourlyRate) {
		super(name, hourlyRate);
	}
	
	@Override 
	public double calculatePay() {
		return hourlyRate * hoursWorked;
	}
}
