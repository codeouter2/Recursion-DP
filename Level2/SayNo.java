class SayNo{

	public static void main(String args[]){
		int say = 123674; // o/p = One Two Three
		
		String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
		String saidWords = sayWords(say,words);
		System.out.println("Say for "+say+" is " + saidWords);
	}

	public static String sayWords(int n, String[] words){
		if(n < 0 || n == 0){
			return "";
		}
		else{
			int say = n%10;
			return sayWords(n/10,words)+" "+words[say];
		}
	}
}

// Explain 
// 1234
// 1234 = 123 = Four
// 123 = 12 = Three
// 12  = 1 = Tow
// 1 = 0 = One
// 0 = ""

