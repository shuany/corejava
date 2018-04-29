package com.nokia.corejava;
/**
 * 
 * @author created by shuangy on 2018年2月11日 下午8:03:06
 *
 *	存退休金
 */

import java.math.BigInteger;
import java.util.Scanner;

public class LotteryOdds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("中奖的数字是几个 ?");
		int k = in.nextInt();

		System.out.print("一共多少个数字 ?");
		int n = in.nextInt();

		/*
		 * n * (n-1) * (n-2) * ... *(n-k+1)/(1*2*3*...*k)
		 * 
		 */

//		int lotteryOdds = 1;
//		for (int i = 1; i <= k; i++) {
//			lotteryOdds = lotteryOdds * (n - i + 1) / i;
//		}
//		System.out.println("中奖概率为：" + lotteryOdds * 100 +"%");
		
		//当数字很大时
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		for (int i = 1; i <= k; i++) {
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
		}
		System.out.println("中奖概率为：" + lotteryOdds  +"%");
		in.close();
	}

}
