package com.nokia.corejava;
/**
 * 
 * @author created by shuangy on 2018年2月11日 下午8:03:06
 *
 *	存退休金
 */

import java.util.Scanner;

public class Retirement {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("how much money do you need to retire" + "?");
//		double goal = in.nextDouble();

		System.out.print("how much money will you contribute every year ?");
		double payment = in.nextDouble();

		System.out.print("interest rate in %: ");
		double interestRate = in.nextDouble();

		double balance = 0;
		int years = 0;

		/*while (balance < goal) {
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
		}
		System.out.println("you can retire in " + years + " years.");*/
		
		String input;
		do {
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
			
			System.out.printf("After year %d, your balance is %,.2f%n",years,balance);
			System.out.println("ready to retire ?(Y/N)");
			input = in.next();
		} while (input.equalsIgnoreCase("N"));
		
		in.close();
	}

}
