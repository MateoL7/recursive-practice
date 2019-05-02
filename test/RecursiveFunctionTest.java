import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Test;

import model.RecursiveFunctions;

public class RecursiveFunctionTest {

	@Test
	public void testArraySum() {
		int[] A = new int[] {2, 6, 9, 5};
		int[] B = new int[] {1, 2, 3, 4};
		int[] C = new int[] {10, 30, 10, 50};
		assertTrue("A is not working", RecursiveFunctions.arraySum(A) == 22);
		assertTrue("B is not working", RecursiveFunctions.arraySum(B) == 10);
		assertTrue("C is not working", RecursiveFunctions.arraySum(C) == 100);


	}
	
	@Test
	public void testFactorial() {
		int one = 5;
		int two = 4;
		int three = 7;
		assertTrue("5! is not working", RecursiveFunctions.factorial(one) == 120);
		assertTrue("4! is not working", RecursiveFunctions.factorial(two) == 24);
		assertTrue("7! is not working", RecursiveFunctions.factorial(three) == 5040);
	}
	
	@Test
	public void testFibonacci() {
		assertTrue("Fibonacci 5 is not working", RecursiveFunctions.fibonacci(5) == 5);
		assertTrue("Fibonacci 5 is not working", RecursiveFunctions.fibonacci(4) == 3);
		assertTrue("Fibonacci 5 is not working", RecursiveFunctions.fibonacci(0) == 0);
	}
	

}
