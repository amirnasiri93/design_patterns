package structural.composite;

import java.util.ArrayList;

public class Organisation {
	private ArrayList<Employee> employees;

	public Organisation() {
		employees = new ArrayList<>();
	}

	public Organisation(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public double getNetSalary() {
		double total = 0;
		for (Employee a : employees) {
			total += a.getSalary();
		}
		return total;
	}

}
