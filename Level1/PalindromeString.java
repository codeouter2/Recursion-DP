class SumOfDigitsOfN{

	public static void main(String args[]){
		
		// To check string is palindome or not if string is input provided.
		
		String str = "radar";

		boolean status  = isCheckPalindromeString(str);
		if(status) System.out.println(str + " is palindrome string");
		else System.out.println(str + " is not palindrome string");
	}

	public static boolean isCheckPalindromeString(String str){
		if(str==null){
			return false;
		}
		else if(str.length()<=1){
			return true;
		}
		else if(str.charAt(0)==str.charAt(str.length()-1)){
			return isCheckPalindromeString(str.substring(1, str.length() - 1));
		}
		else{
			return false;
		}
	}
}

// radar = r==r => ada = true
// ada = a == a => d = true
// d = true