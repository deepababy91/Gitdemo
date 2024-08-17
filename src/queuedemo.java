
public class queuedemo {
	
	static int rear;
	static int front;
	int size;
	static int[] a;
	
	public queuedemo(int size) {
		rear=-1;
		this.size=size;
		this.a=new int[size];
	}

	public void enQueuedemo(int x) {
		rear++;
		a[rear]=x;
	}
	
	public  int deQueuedemo() {
		int ele=a[0];
		for(int i=0;i<rear;i++) {
			a[i]=a[i+1];
		}
		rear--;
		return ele;
		
	}

	public  void printqueue() {
		for(int i=0;i<=rear;i++) {
			System.out.println(a[i]);
	}
	}	
	public static void main(String[] args) {
		queuedemo en=new queuedemo(5);
		en.enQueuedemo(4);
		en.enQueuedemo(2);
		en.deQueuedemo();
		en.enQueuedemo(3);
		en.enQueuedemo(9);
		en.deQueuedemo();
		en.enQueuedemo(19);
		en.printqueue();
		
	}
}
