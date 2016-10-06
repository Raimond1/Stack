

public class Stack {
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(3);
		stack.push(4);
		stack.push(7);
		System.out.println("Popped element was: " + stack.pop());
		System.out.println("Peek element: " + stack.peek());
		
		System.out.println(stack);
	}
	
	
	private Integer[] stack;
	private int size;
	
	
	public Stack() {
		this.stack = new Integer[100];
		this.size = 0;
	}


	public void push(Integer element) {
		stack[size]=element;
		size ++;
	}
	
	public Integer pop() {
		if (size <= 0) {
			throw new IllegalStateException();
		}
		size --;
		return stack[size];
	}
	
	public Integer peek(){
		if (size <= 0) {
			throw new IllegalStateException();
		}
		return stack[size-1];
		
	}
	
	
	public int getSize() {
		return size;
	}
	

	@Override
    public String toString() {
		String result = "Stack [";
		for (int i = 0; i < size; i++) {
			if (i != size-1) {
				result +=   stack[i]+", ";	
			} else {				
				result += stack[i]; 
			}
		}
        return result + "]";
    }
}
