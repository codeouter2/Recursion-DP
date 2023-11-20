class ReverseOfN{

	public static void main(String args[]){
		
		// To reverse of n if n is input provided.
		
		int n = 987654321;
		int count = countOfDigits(n);
		int reverse =  reverseOfN(n,count);
		System.out.println("Reverse of " + n  + " is : "  + reverse);
	}

	public static int reverseOfN(int n, int count){
		if(n == 0 && count==0){
			return 0;
		}
		else{
			return (n%10)*((int) Math.pow(10, count-1))+reverseOfN(n/10,count-1);
		}
	}

	public static int countOfDigits(int n){
		//int c = 0;
		//while(n != 0){
		//	n = n /10;
		//	c++;
		//}
		//return c;

		// OR
		if(n==0)
			return 1;
		else return (int) Math.log10(Math.abs(n))+1;
	}
}

// Explain :
// r(12345,0) = r(1234,1)+5*10^4
// r(1234)  = r(123,2)+5+4*10^3
// r(123)   = r(12,3)+5+40+3*10^2
// r(12)    = r(1,4)+5+40+300+2*10^1
// r(1)     = r(0,5)+5+40+300+2000+1*10^0 = 0+50000+4000+300+20+1