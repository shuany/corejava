/**
 * 
 */
package com.nokia.corejava;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author created by shuangy on 2018年2月11日 下午9:28:22
 *
 */
public class LotteryDarwing {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("中奖的数字是几个 ?");
		int k = in.nextInt();//5

		System.out.print("一共多少个数字 ?");
		int n = in.nextInt();//10

		int[] nums= new int[n];
		 for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;// 1-10
		}
		 
		 int[] result = new int[k];
		 for (int i = 0; i < result.length; i++) {
			int r = (int) (Math.random() *n);
			System.out.println("r :" + r);
			result[i] = nums[r];
			nums[r] = nums[n-1];
			n--;
		}
		 Arrays.sort(result);
		 
		 for (int i : result) {
			System.out.print(i +",");
		}
		in.close();
	}

}
