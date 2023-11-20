class SumOfDigitsOfN{

	public static void main(String args[]){
		
		// To print sum of digits if n is input provided.
		
		int n = 12345; // 1+2+3 = 6

		int sum =  sumOfDigits(n);
		System.out.println("Sum of Digits for " + n  + " is : "  + sum);
	}

	public static int sumOfDigits(int n){
		if(n==0){
			return 0;
		}
		else{
			return (n%10+sumOfDigits(n/10));
		}
	}
}

// Explain : 
// s(123) = 3+s(12) = 6
// s(12) = 2+s(1) = 3
// s(1) = 1+s(0) = 1
// s(0) = 0