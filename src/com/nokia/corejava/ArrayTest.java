/**
 * 
 */
package com.nokia.corejava;

import java.util.Arrays;

/**
 * @author created by shuangy on 2018年2月11日 下午9:10:54
 *
 */
public class ArrayTest {
	public static void main(String[] args) {
//		int [] array = new int[100];
//		for(int i = 0;i<array.length;i++){
//			array[i] = i*10;
//			System.out.println("第" +(i+1)+"个元素的值为 ： " +array[i]);
//		}
		
//		for (int ele : array) {
//			ele = ele + 10;
//			System.out.println(ele);
//		}
		
		int[] smallPrimes ={1,2,3,4,6,8,2,7};
		int[] luckyNumbers = smallPrimes;
		luckyNumbers[5] = 520;
		
//		复制 copyOf
		int[] copyLuckyNumber = Arrays.copyOf(luckyNumbers, luckyNumbers.length *2);
		
//		排序
		Arrays.sort(copyLuckyNumber);
	}

}
