import java.util.Stack;

public class StackReverse {
	
	public static void main(String[] args) {
		Stack<Integer> stack1=new Stack<Integer>();
		Stack<Integer> stack2=new Stack<Integer>();
		Stack<Integer> stack3=new Stack<Integer>();
		stack1.push(23);
		stack1.push(43);
		stack1.push(63);
		stack1.push(83);
		stack1.push(103);
		
		System.out.println(stack1);
        moveToStack(stack1,stack2);
        moveToStack(stack2,stack3);
        moveToStack(stack3,stack1);
        System.out.println("Reversed "+stack1);

	}

	private static void moveToStack(Stack<Integer> source, Stack<Integer> destination) {
		while(!source.isEmpty()) {
		int item=source.peek();
		destination.push(item);
		source.pop();
		
	}
	}

}