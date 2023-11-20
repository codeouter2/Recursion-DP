class ClimbStairs{

	public static void main(String args[]){

		// link = https://www.codingninjas.com/studio/problems/count-ways-to-reach-nth-stairs_798650?utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_10&leftPanelTabValue=SUBMISSION
		
		// To find different ways in which person can reach to nth stairs.
		// he can only climb 1th and 2nd step for reach to end.
		
		int n = 5;
		int ways = countOfDiffWaysClimbStairs(n);
		System.out.println("To reach at "+ n + "th stairs the diiffernt ways is " + ways);
	}

	public static int countOfDiffWaysClimbStairs(int n){

		// if person is standing inside ground means not on that Oth position.
		if(n < 0){
			return 0;
		}

		// if person is standing at 0th position means he can reach to 0th position by jump only means only 1 step.
		else if(n==0){
			return 1;
		}

		// person can only reach to nth stair by 1 step and 2 step 
		else{
			return countOfDiffWaysClimbStairs(n-1)+countOfDiffWaysClimbStairs(n-2);
		}
	}
}

// Explain : 
// c(5) = c(4)+c(3) = 5+3 = 8
// c(4) = c(3)+c(2) = 5
// c(3) = c(2)+c(1) = 3
// c(2) = c(1)+c(0) = 2
// c(1) = c(0)+c(-2) = 1
// c(0) = 1