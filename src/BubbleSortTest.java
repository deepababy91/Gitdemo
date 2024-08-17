import java.util.Arrays;

public class BubbleSortTest {
	
	public static void main(String[] args) {
		int[] arr= {4,1,2,7,9,3};
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
			if(arr[j-1] >arr[j]){
				temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
				
		}
			
	}
		System.out.println(Arrays.toString(arr));
	}

}
//worst case-O(n^2)
//Best case also same time complexity since even if the array given is sorted , you still need to compare both loops