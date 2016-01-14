package projectEuler;

public class PE1SumFactorsOf3and5 {
	static void theEasyWay( long n) {
		long sum = 0;
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum + "");
	}
	
	static void theEfficientWay(long target) {
		System.out.println("" + (sumDivisibleBy(target, 3) + sumDivisibleBy(target, 5) - sumDivisibleBy(target, 15)));
	}

	private static long sumDivisibleBy(long target, int divisor) {
		long p = (target - 1) / divisor;
		return divisor * (p * (p + 1) / 2);
		
	}

	public static void main(String[] args) {
		//theEasyWay(1000000000);
		//theEfficientWay(1000);
		theEfficientWay(1000000000); //I don't really understand this math :(
		
	}

}
