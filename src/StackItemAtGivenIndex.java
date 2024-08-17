import java.util.Stack;

public class StackItemAtGivenIndex {
	static int givenindex=2;
    static int item;
	public static void main(String[] args) {
		Stack<Integer> stack1=new Stack<Integer>();
		Stack<Integer> temp=new Stack<Integer>();
		stack1.push(2);
		stack1.push(1);
		stack1.push(6);
		stack1.push(4);
		System.out.println(stack1);
		stackItemAtIndex(stack1,temp, 10);
		System.out.println(stack1);

	}

	private static void stackItemAtIndex(Stack<Integer> source,Stack<Integer> temp,int pushvalue) {
		
		for(int i=0;i<source.size()-givenindex+1;i++) {
			int item=source.peek();
			temp.push(item);
			source.pop();
		
	}		
			source.push(pushvalue);		
		while(!temp.isEmpty()) {
		int item=temp.peek();
		source.push(item);
		temp.pop();
		
	}
}
}
