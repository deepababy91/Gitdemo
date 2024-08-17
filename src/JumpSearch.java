import java.lang.reflect.Array;

public class JumpSearch {

	static int[] arr= {1,4,6,7,9,12,14,17,19,22};
	
	public static void main(String[] args) {
		System.out.println(jump(20));
	}
	
	public static int jump(int target) {
		int start=0;
		int blocksize=(int) Math.sqrt(arr.length);
		int last=blocksize-1;
		while(arr[last]<target && start<arr.length-1) {
			start=last+1;
			last=last+blocksize;
			if(last>arr.length-1) {
				last=arr.length-1;
			}
		}
		for(int i=start;i<=last;i++) {
      			if(arr[i]==target) {
      				return i;
      			}
		}
		return -1;
		
	}
	 
}
