package com.pintosoft.fibonacci;

public class IterativeFibonacci implements Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IterativeFibonacci iterFib = new IterativeFibonacci();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 30; i++) {
			if (i == 0) {
				sb.append(iterFib.fibonacci(i));
			} else {
				sb.append(", " + iterFib.fibonacci(i));
			}
		}
		
		System.out.println(sb.toString());
	}

	@Override
	public int fibonacci(int num) {
		int fibNum = 0;
		
		int n1 = 1;
		int n2 = 1;
		
		// May not be the most optimal way but it works.
		if (num <= 1) {
			fibNum = num;
		} else if (num == 2) {
			fibNum = n2;
		} else {
			for (int currentNum = 2 ; currentNum < num; currentNum++) {
				fibNum = n1 + n2;
				n1 = n2;
				n2 = fibNum;
			}
		}
		
		return fibNum;
	}
}
