public class Tester {
	public static boolean isPrime(int x) {
		for (int i=2; i<=x/2; i++) {
			if (x%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int nthPrime(int n) {
		int num = 2;
		int prime = 0;
		for (int count=0; count<=n; num++) {
			if (isPrime(num)) {
				count++;
				prime = num;
			}
		}
		return prime;
	}

	public static void main(String[] args) {
		int input[] = {0, 1, 2, 99, 999};
		int output[] = {2, 3, 5, 541, 7919};
		int prime;
		
		for (int i=0; i<input.length; i++) {
			prime = nthPrime(input[i]);
			
			if (prime == output[i]) {
				System.out.println("pass");
			} else {
				System.out.println("fail expected "+input[i]+", but value returned was "+output[i]);
			}
		}
	}
}