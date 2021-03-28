package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void test() {
		int numbers[] = {22,44,11,33,1};
		Arrays.sort(numbers);
		assertArrayEquals(new int[] {1,11,22,33,44},numbers);
	}

	@Test(expected=NullPointerException.class)
	public void test1() {
		
		int numbers[] = null;
		
		Arrays.sort(numbers);
		
		}
	
	@Test(expected=ArithmeticException.class)
	public void test2() {
		
		int x = 25/0;
		
		}
	
	
	
		@Test(timeout=100000)
		public void testsort_Performance() {

			int a[] = new int[1000];

			for (int i = 0; i < 1000; i++) {
				a[i] = i;
			}
		}

}
