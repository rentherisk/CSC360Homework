package TestPrep1;

public class SalariedEmployee extends Employee
{
	public SalariedEmployee(String name, double hourlyRate) {
		super(name, hourlyRate);
	}
	
	@Override
	public double calculatePay() {
			return hourlyRate * 40;
	}
}
