package TestPrep1;

import java.util.ArrayList;
import java.util.List;

public class Payroll
{
	private List<Employee> employees;
	
	public Payroll() {
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public double[] calculatePayForAllEmployees() {
		double[] payments = new double[employees.size()];
		
		for (int i = 0; i < employees.size(); i++) {
			payments[i] = employees.get(i).calculatePay();
		}
	
		return payments;
	}
}	
