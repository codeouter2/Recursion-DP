class CheckSorted{

	public static void main(String args[]){

		// To check array is sorted or not.
		
		int[] arr = {-1,0,1,2,3};
		int size = arr.length;
		boolean checkArr1 = isSorted1(arr,size-1,size);
		boolean checkArr2 = isSorted2(arr,size);

		System.out.println("Your array is sorted : " + checkArr1 + " " + checkArr2);
	}

	public static boolean isSorted1(int arr[], int index,int size){
		if(arr == null || size == 0){
			return false;
		}
		else if(index == 0){
			return true;
		}
		else{
			int prev = arr[size-index-1];
			int next = arr[size-index];
			return  prev < next && isSorted1(arr,index-1,size);
		}
	}

	public static boolean isSorted2(int arr[], int size){
		if(size == 0 || size == 1){
			return true;
		}
		else if(arr[size-2] > arr[size-1]){
			return false;
		}
		else{	
			return isSorted2(arr,size-1);
		}
	}
}

// Explain : isSorted1
// arr = [2,4,13,1,23]
// arr[0] < arr[1] = 2<4 = true && s(arr,3) = false
// arr[1] < arr[2] = 4<13 = true && s(arr,2) = false
// arr[2] < arr[3] = 13<1 = false && s(arr,1) = false
// arr[3] < arr[4] = 1<23 = true && s(arr,0)= true
// index = 0 => true

// Explain : isSorted2
// arr = [2,4,13,1,23]
// 4 = arr[2] > arr[3] => 13>1 = true
// 3 = arr[1] > arr[2] => 4 > 13 = false
