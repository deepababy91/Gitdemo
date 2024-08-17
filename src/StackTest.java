import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<Integer>();
		System.out.println(s.isEmpty());
		s.push(5);
		s.push(54);
		s.push(45);
		s.push(57);
		s.push(53);
		s.push(50);
		System.out.println(s);
		s.pop();
		System.out.println(s.indexOf(45));
		System.out.println(s.size());
		System.out.println(s);
System.out.println(s.peek());
System.out.println(s.contains(50));
s.insertElementAt(100, 2);
System.out.println(s);
	}

}
