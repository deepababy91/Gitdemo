
public class BinarySearch {
	
	static int[] arr= {1,2,4,7,9,13};
	
	public static void main(String[] args) {
		System.out.println(binarySearchWithWhile(2));
		System.out.println(binarySearchWithRecursion(4, arr, 0, arr.length-1));
	}
	
	public static int binarySearchWithWhile(int target) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
		int mid=(left+right)/2;
		if(arr[mid]==target) {
			return mid;
		}
		else if (arr[mid]>target) {
			right=mid-1;
		}
		else
		{
			left=mid+1;
		}
	
		
	}
		return -1;
	}
	
	public static int binarySearchWithRecursion(int target,int[] arr,int left,int right) {
		if(right<left) {
			return -1;
		}
		int mid=(left+right)/2;
		if(arr[mid]==target) {
			return mid;
		}
		else if(arr[mid]>target) {
			right=mid-1;
			return binarySearchWithRecursion(target,arr,left,right);
		}
		else {
			left=mid+1;
			return binarySearchWithRecursion(target,arr,left,right);
		}
		
		
	}

}
