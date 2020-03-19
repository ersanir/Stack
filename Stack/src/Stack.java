
public class Stack {
	
	private int top;
	private int maxSize;
	
	int[] a;
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		a = new int[maxSize];
		top = -1;
		
	}
	
	public int pop() {
		
		if(top >= 0) {
				int x = a[top];
				top--;
				return x;
		}else
			return -1;
	}
	
	public void push(int x) {
		if(top < maxSize-1) {
			++top;
			a[top] = x;
			System.out.println(x+" pushed");
		}else {
			System.out.println("Stack Full");
		}
			
	}
	
	public void show() {
		System.out.println("Stack is");
		
		for(int i = top; i>=0;i--) {
			System.out.println(a[i]);
		}
	}
	
	
	public static void main(String[] args) {
		Stack s = new Stack(10);
		s.push(5);
		s.push(8);
		s.push(15);
		s.push(1);
		s.show();
		s.pop();
		s.pop();
		s.show();
	}

}
