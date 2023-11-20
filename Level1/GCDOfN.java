class GCDOfN{

	public static void main(String args[]){
		
		// To print gcd of N if n is input provided.
		
		int a = 4;
		int b = 12; 

		int gcd =  gcd(a,b);
		System.out.println("GCD of " + a  + " and  " + b + " is  : " + gcd);
	}

	public static int gcd(int i,int j){
		if(i<0 || j<0 ){
			return 0;
		}
		else if(j==0){
			return i;
		}
		else{
			return gcd(j,i%j);
		}
	}

}

// Explain : 4 = 2*2*1 , 12 = 4*3 = 2*2*3 => gcd(4,12) = 4
// (4,12) => (12,4)
// (12,4) => (4,0)
// (4,0) => 4

