
public class Recursion {
	static int[] array= {12,1,4,2};
	static int fact=7;
	
	
	
	public static void main(String[] args) {
		System.out.println(sumOfDigits(array.length-1));
		System.out.println("Factorial of "+ fact +" is " + +factorial(fact));
		int fibvalue=fib(8);
		System.out.println("Fibonacci series is  "+ fibvalue);
		
	}
	public static int sumOfDigits(int n) {
		if(n==0) {
			return array[n];
		}
		return array[n]+sumOfDigits(n-1);
		
	}
	
	public static int factorial(int n) {
		if(n==1) {
			return n;
		}
		return n * factorial(n-1);
		
	}
	public static int fib(int n) {
		if(n==0||n==1) 
			return n;
		
		return fib(n-2)+fib(n-1);
		
	

} 
}
