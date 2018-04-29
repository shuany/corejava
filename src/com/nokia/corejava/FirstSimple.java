 package com.nokia.corejava;

/**
 * 
 * @author created by shuangy on 2018年2月9日 下午11:33:25
 *
 */
public class FirstSimple {

	public static final double CM_PER_EACH = 2.54;

	public static void main(String[] args) {
		// final double CM_PER_EACH = 2.54;
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("I love lq");
		System.out.println();
		System.out
				.println("paper size in centimeters:" + paperWidth * CM_PER_EACH + " by " + paperHeight * CM_PER_EACH);

		double x = 4;
		double y = Math.sqrt(x);

		double z = 3;
		double a = Math.pow(x, z);

		System.out.println(y);
		System.out.println(a);
	}
}
