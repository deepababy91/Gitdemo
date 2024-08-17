
public class LinearSearch {

	static int[] arr= {1,2,4,6,9,12};
	
	public static void main(String[] args) {
		System.out.println(linearSearch(12));
	}
	
	public static int linearSearch(int value) {
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==value) {
			return i;
		}
		}
		return -1;
		
	}
	
}
