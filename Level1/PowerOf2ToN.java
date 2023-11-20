class PowerOf2ToN{

	public static void main(String args[]){
		
		// To calculate power of 2^n if n is input provided.
		int n = 4;
		int result = powerof2ton(n);
		System.out.println("Power of 2 ^ " + n + " is  : " + result );
	}

	public static int powerof2ton(int n){
		if(n==0){
			return 1;
		}else{
			return (2*powerof2ton(n-1));
		}	
	}
}

// Explan : 
// 2^4 = 2*(2^3) = 16
// 2^3 = 2*(2^2) = 8
// 2^2 = 2*(2^1) = 4
// 2^1 = 2*(2^0) = 2
// 2^0 = 1