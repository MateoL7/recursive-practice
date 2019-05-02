package model;

//i = 5

public class RecursiveFunctions {

	public static int arraySum(int[] A) {
		return arraySum(A, A.length-1);
	}
	private static int arraySum(int[] A, int n) {
		if(n == 0) {
		return A[0];
		}
		else {
			return A[n] + arraySum(A, n-1);
		}
	}
	
	public static long factorial(long A) {
		if(A == 1) {
			return A;
		}
		else {
			return A*factorial(A-1);
			}
	}
	
	public static int fibonacci(int num) {
		if(num == 0 || num == 1) {
			return num;
		}
		else {
			return fibonacci(num -1) + fibonacci(num - 2);
		}
	}
}
