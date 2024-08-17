import java.util.Stack;

public class queueStack {
	 static Stack<Integer> stack=new Stack<Integer>();
	 Stack<Integer> temp=new Stack<Integer>();
	
	public static void main(String[] args) {
		queueStack qs=new queueStack();
		qs.enQueueStack(23);
		qs.enQueueStack(103);
		qs.enQueueStack(44);
		qs.enQueueStack(144);
		System.out.println(qs.deQueueStack());
		System.out.println(stack);
	}
	
	
	
	public void enQueueStack(int x) {
		stack.push(x);
	}

	public int deQueueStack() {
		while(!stack.isEmpty()) {
			temp.push(stack.pop());
		}
		int ele=temp.pop();
		while(!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		return ele;
	}
	
}
