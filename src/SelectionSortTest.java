import java.util.Arrays;

public class SelectionSortTest {

	public static void main(String[] args) {
		int[] arr= {4,9,5,7,58,100,15};
		int minIndex;
		int temp;
		for(int i=0;i<arr.length;i++) {
			minIndex=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[minIndex];
					arr[minIndex]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
