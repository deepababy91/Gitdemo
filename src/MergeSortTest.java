import java.util.Arrays;

public class MergeSortTest {
	
	public static void main(String[] args) {
		int[] arr= {54,100,2,447,9};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int[] arr) {
		int mid=arr.length/2;
		int[] left=new int[mid];
		int[] right=new int[arr.length-mid];		
		if(arr.length<2)
			return;
		for(int i=0;i<mid;i++) {
			{
				left[i]=arr[i];
			}
		}
			for(int i=mid;i<arr.length;i++) {
				
					right[i-mid]=arr[i];
				}
		sort(left);
		sort(right);
		merge(left, right, arr);
			
}

	private static void merge(int[] left,int[] right,int[] arr) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length)
		{
		if(left[i]<=right[j]) {
			arr[k]=left[i];
			i++;
			k++;
		}
		else {
			arr[k]=right[j];
			j++;
			k++;
		}
		
	}
	while(j<right.length) {
		arr[k++]=right[j++];
	}
	while(i<left.length) {
		arr[k++]=left[i++];
	}

}
}
