class CheckSorted{

	public static void main(String args[]){

		// To print sum of array
		int arr[] = {1,2,2,3,3};
		int size = arr.length;
		int res = sumArr(arr,size);
		System.out.println("Sum of Array is : " + res);
	}

	public static int sumArr(int[] arr, int size){
		if(arr == null || size == 0){
			return 0;
		}
		else if(size == 1){
			return arr[0];
		}
		else{
			return arr[size-1] + sumArr(arr,size-1);
		}
	}
}

// Explain : 
// arr,5 = 3 + s(arr,4) = 11
// arr,4 = 3 + s(arr,3) = 8
// arr,3 = 2 + s(arr,2) = 5
// arr,2 = 2 + s(arr,1) = 3
// arr,1 = 1 + s(arr,0) = 1
// arr,0 = 0