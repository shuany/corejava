package com.nokia.opp;

import java.time.LocalDate;

/**
 * @author created by shuangy on 2018年2月11日 下午10:22:16
 *
 */
public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("LU", 4800, 1999, 9, 26);
		staff[1] = new Employee("QIAN", 8000, 2013, 9, 26);
		staff[2] = new Employee("YU", 4800, 1993, 9, 17);

		for (Employee employee : staff)
			employee.raiseSalary(5);

		for (Employee employee : staff)
			System.out.println("name: " + employee.getName() + "salary: " + employee.getSalary() + "hireDay: "
					+ employee.getHireDay());
	}
}

class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;

	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		hireDay = LocalDate.of(year, month, day);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

}
