class Factorial{

	public static void main(String args[]){
		
		// To calculate factorial of n if n is input provided.
		int n = 4;
		int result = fact(n);
		System.out.println("Factorial of " + n + "! is  : " + result );
	}

	public static int fact(int n){
		if(n==0 || n==1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
}

// Explain : 
// 4! = 4*(3!) = 24
// 3! = 3*(2!) = 6
// 2! = 2*(1!) = 2
// 1! = 1