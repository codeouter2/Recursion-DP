class Fibonacci{

	public static void main(String args[]){
		
		// To print fibonacci n th number from series if n is input provided.
		// Series : 0 1 1 2 3 5 8 13 21...
		int n = 4;
		int nth =  fibo(n-1);
		System.out.println(n + "th number from series is " + nth);
	}

	public static int fibo(int n){
		if(n==0 || n==1){
			return n;
		}
		else{
			return (fibo(n-1) + fibo(n-2));
		}
	}
}

// Explain : 
// f(4) = f(3) => 2
//---------------------------
// f(4) = f(3)+f(2) = 2+1 = 3
// f(3) = f(2) + f(1) = 1+1 = 2
// f(2) = f(1) + f(0)= 1+0= 1
// f(1) = 1
// f(0) = 0