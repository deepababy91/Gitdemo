import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		Stack<Integer> stack1=new Stack<Integer>();
		stack1.push(23);
		stack1.push(143);
		stack1.push(63);
		stack1.push(853);
		stack1.push(103);
		System.out.println(stack1);
		System.out.println(SortStack(stack1));
	}

	private static Stack<Integer> SortStack(Stack<Integer> stack1) {
		// TODO Auto-generated method stub
		Stack<Integer> tempstk=new Stack<Integer>();
		while(!stack1.isEmpty()) {
			int temp=stack1.pop();
				while(!tempstk.isEmpty() && tempstk.peek()>temp) {
					int tt=tempstk.pop();
					stack1.push(tt);
				}
				tempstk.push(temp);
			
		}
		return tempstk;
		
	}

}
