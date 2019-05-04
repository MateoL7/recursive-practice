package model;

//i = 5

public class RecursiveFunctions {

	//Adding the numbers inside the array
	
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
	
	//Factorial
	
	public static long factorial(long A) {
		if(A == 1) {
			return A;
		}
		else {
			return A*factorial(A-1);
			}
	}
	
	//Fibonacci
	
	public static int fibonacci(int num) {
		if(num == 0 || num == 1) {
			return num;
		}
		else {
			return fibonacci(num -1) + fibonacci(num - 2);
		}
	}
	
	//Mixing strings
	
	public static String mix(String m1, String m2){
		return mix(m1, m2, 0);
	}
	
	private static String mix(String m1, String m2, int n){
		if(m1.length()-1 == n) {
			return m1.charAt(n) + "" + m2.charAt(n);
		}
		else {
			return m1.charAt(n) + "" + m2.charAt(n) + mix(m1, m2, n+1);
		}
	}
	
	//Palindrome
	
	public static boolean palindrome(String word) {
		return palindrome(word, 0);
	}
	
	private static boolean palindrome(String word, int n) {
		if(n == word.length()-1-n) {
			return true;
		}
		else if(word.charAt(n) == word.charAt(word.length()-1-n)) {
			return palindrome(word, n+1);
		}
		else {
			return false;
		}
	}
}
