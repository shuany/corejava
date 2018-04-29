package com.nokia.corejava;

import java.util.Scanner;

/**
 * 
 * @author created by shuangy on 2018年2月10日 上午11:33:33
 *
 */
public class InputTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name ?");
		String name = scanner.nextLine();
		
		System.out.println("How old are you ?");
		int age = scanner.nextInt();
		
		System.out.println("Hello, I am " + name + "; Next year ,you will be " + (age + 1));
		
		scanner.close();
	}
}
