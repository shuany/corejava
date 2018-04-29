package com.nokia.opp;

/**
 * @author created by shuangy on 2018年4月29日 下午3:59:02
 * 
 * 一个方法不能修改一个基本数据结构类型的参数
 * 一个方法可以改变一个对象参数的状态
 * 一个方法不能让对象参数引用一个新的对象
 *
 */
public class ParamTest {
	public static void main(String[] args) {
		/**
		 * 测试1
		 */
		System.out.println("testing tripleValue");
		double percent = 10;
		System.out.println("before:percent="+ percent);
		tripleValue(percent);
		System.out.println("after:percent="+ percent);
		
		/**
		 * 测试2
		 */
		
		System.out.println("testing tripleSalary");
		Emplyee2 e = new Emplyee2("张三", 5000);
		System.out.println("before:salary="+ e.getSalary());
		tripleSalary(e);
		System.out.println("after:salary="+ e.getSalary());
		
		
		/**
		 * 测试3
		 */
		
		System.out.println("testing swap");
		Emplyee2 a = new Emplyee2("张三", 5000);
		Emplyee2 b = new Emplyee2("李四", 7000);
		System.out.println("before: a=" + a.getName());
		System.out.println("before: b=" + b.getName());
		swap(a,b);
		System.out.println("after: a=" + a.getName());
		System.out.println("after: b=" + b.getName());
		
	}

	public static void tripleValue(double x) {
		x = 3 * x;
		System.out.println("end of method: x=" + x);
	}
	
	public static void tripleSalary(Emplyee2 x) {
		x.raiseSlary(200);
		System.out.println("end of method: salary=" + x.getSalary());
	}
	
	public static void swap(Emplyee2 x,Emplyee2 y) {
		Emplyee2 temp = x;
		x=y;
		y=temp;
		System.out.println("end of method: x=" + x.getName());
		System.out.println("end of method: y=" + y.getName());
	}

}

class Emplyee2 {
	private String name;
	private double salary;

	public String getName() {
		return name;
	}

	public Emplyee2(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
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

	public void raiseSlary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

}
