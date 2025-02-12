package TestPrep1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayrollTest
{
	
	 Contractor contractor;
	 HourlyEmployee hourlyEmployee;
	 SalariedEmployee salariedEmployee;
	 Payroll payroll;

	@BeforeEach
	void setUp() throws Exception
	{
		contractor = new Contractor("Nancy", 50);
        hourlyEmployee = new HourlyEmployee("Dave", 20.25);
        salariedEmployee = new SalariedEmployee("Alex", 25);
        payroll = new Payroll();

        payroll.addEmployee(contractor);
        payroll.addEmployee(hourlyEmployee);
        payroll.addEmployee(salariedEmployee);

	}
	
	@Test
	 void testHourlyEmployeeOvertime() {
		hourlyEmployee.setHoursWorked(45); // 45 h, 5 h overtime
        assertEquals((20.25 * 40) + (20.25 * 1.5 * 5), hourlyEmployee.calculatePay(), "Hourly overtime pay calculation should match expected value.");
	}
	
	@Test
    void testSalariedEmployeePay() {
        salariedEmployee.setHoursWorked(40);
        assertEquals(1000, salariedEmployee.calculatePay(), "Salaried pay calculation should match expected value.");
    }
	
	@Test
    void testContractorPay() {
        contractor.setHoursWorked(40);
        assertEquals(2000, contractor.calculatePay(), "Contractor pay calculation should match expected value.");
    }
	
	@Test
    void testPayrollPayments() {
        contractor.setHoursWorked(40);
        hourlyEmployee.setHoursWorked(45);
        salariedEmployee.setHoursWorked(40);

        double[] payments = payroll.calculatePayForAllEmployees();

        assertAll("Employees paid correctly",
            () -> assertEquals(2000, payments[0], "Contractor payment should match expected value."),
            () -> assertEquals((20.25 * 40) + (20.25 * 1.5 * 5), payments[1], "Hourly payment should match expected value."),
            () -> assertEquals(1000, payments[2], "Salaried payment should match expected value.")
        );
    }

}
