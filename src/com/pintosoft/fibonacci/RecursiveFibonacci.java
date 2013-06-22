package com.pintosoft.fibonacci;

public class RecursiveFibonacci implements Fibonacci {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RecursiveFibonacci recFib = new RecursiveFibonacci();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 30; i++) {
			if (i == 0) {
				sb.append(recFib.fibonacci(i));
			} else {
				sb.append(", " + recFib.fibonacci(i));
			}
		}
		
		System.out.println(sb.toString());
	}

	@Override
	public int fibonacci(int num) {
		int fibNum = 0;
		
		if (num > 0) {
			if (num < 2) {
				fibNum = num;
			} else {
				fibNum = fibonacci(num-1) + fibonacci(num-2);
			}
		}
		
		return fibNum;
	}

}
