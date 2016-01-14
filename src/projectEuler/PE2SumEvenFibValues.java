package projectEuler;

public class PE2SumEvenFibValues {
	static void sumEvenFib(int in) {
		int fib1 = 1;
		int fib2 = 1;
		int sum = 0;
		int result = 0;
		while (result < in) {
			result = fib1 + fib2;
			
			if (result % 2 == 0) {
				sum += result;
			}
			
			fib1 = fib2;
			fib2 = result;
			
		}
		System.out.println(result + "");
		System.out.println(sum + "");
	}

	public static void main(String[] args) {
	   sumEvenFib(4000000);
	}

}
