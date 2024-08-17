import java.util.Stack;

public class MinElementInStack {
	static Stack<Integer> stack1=new Stack<Integer>();
	static Stack<Integer> temp=new Stack<Integer>();

	public static void main(String[] args) {
		customPush(12);
		//customPop();
		customPush(6);
		//customPop();
		customPush(20);
		customPush(17);
		customPush(3);
		customPop();
		
		System.out.println(temp.peek()+" is the minimum value");
		


	}

	private static void customPush(int i) {
		// TODO Auto-generated method stub
		stack1.push(i);
		if(temp.isEmpty()) {
			temp.push(i);
		}
		if(i<temp.peek()) {
			temp.push(i);
		}
	}
	public static void customPop() {
		int item=stack1.peek();
		stack1.pop();
		if(item==temp.peek()) {
			temp.pop();
		}
	}

}
