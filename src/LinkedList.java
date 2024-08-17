
public class LinkedList {
	class Node{
		int val;
		Node next;
		public Node(int val) {
			this.val=val;
		}
	}	
	static Node head=null;
	Node tail=null;
		public void addNodeAtEnd(int val) {
			Node newNode=new Node(val);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
			tail.next=newNode;
			newNode.next=null;
			tail=newNode;
		}
		}
		public  void printLinkedList(Node headNode) {
			Node current=headNode;
			while(current!=null) {
				System.out.println(current.val);
				current=current.next;
			}
		}
		
	public void addNodeAtTheBeginning(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
		newNode.next=head;
		head=newNode;
		}
	}
		public void checkIfThereIsANodeWithAGivenValue(int value) {
			Node current=head;
			while(current!=null) {
				if(current.val==value) {
					System.out.println("6 is present");
					break;
				}				
				current=current.next;
							 
			}				
			
		}
	
public static void main(String[] args) {
	LinkedList l=new LinkedList();	
	l.addNodeAtEnd(10);
	l.addNodeAtEnd(65);
	l.addNodeAtEnd(30);
	l.addNodeAtEnd(40);
	l.addNodeAtTheBeginning(1);
	l.printLinkedList(head);
	l.checkIfThereIsANodeWithAGivenValue(6);
	
}
	}
