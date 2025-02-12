package TestPrep1;

public class HourlyEmployee extends Employee
{
	public HourlyEmployee(String name, double hourlyRate) {
		super(name, hourlyRate);
	}
	
	@Override
	public double calculatePay() {
		if (hoursWorked <= 40) {
			return hourlyRate * hoursWorked;
		} else {
			return (40 * hourlyRate) 
					+ ((hoursWorked - 40) 
					* (hourlyRate * 1.5));
		}
	}
}
