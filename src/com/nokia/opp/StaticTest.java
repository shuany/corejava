package com.nokia.opp;

/**
 * @author created by shuangy on 2018年4月29日 下午3:36:27
 *
 */
public class StaticTest {

	public static void main(String[] args) {

		Employee1[] staff = new Employee1[3];

		staff[0] = new Employee1("LU", 4800);
		staff[1] = new Employee1("QIAN", 8000);
		staff[2] = new Employee1("YU", 4800);

		for (Employee1 e : staff) {
			e.setId();
			System.out.println("name: " + e.getName() + ",salary: " + e.getSalary() + ",id: " + e.getId());
		}
		int n = Employee1.getNextId();
		System.out.println("next availble id=" + n);

	}
}

class Employee1 {
	private static int nextId = 1;
	private String name;
	private double salary;
	private int id;

	public Employee1(String n, double s) {
		name = n;
		salary = s;
		id = 0;
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

	public int getId() {
		return id;
	}

	public void setId() {
		id = nextId;
		nextId++;
	}

	public static int getNextId() {
		return nextId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}