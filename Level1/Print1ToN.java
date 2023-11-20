class Print1ToN{

	public static void main(String args[]){
		
		// To print 1 to N if n is input provided.
		int n = 4;
		print(n);
	}

	public static void print(int n){
		if(n == 0){
			return ;
		}else{
			print(n-1);
			System.out.print(n + " ");
		}
	}

}

// Explain :
// 4 = 3 = print 4
// 3 = 2 = print 3
// 2 = 1 = print 2
// 1 = 0 = print 1
// 1 2 3 4
