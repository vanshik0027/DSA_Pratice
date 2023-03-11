package DSA.Java.Stacks;

import java.util.EmptyStackException;

public class arrayStack {

	
		
		private Employee[] stack;
		private int top;
	
		public  arrayStack(int capacity) {
			
			stack = new Employee[capacity];
			
			
		}
		public void push(Employee employee) {
			
			if (top == stack.length) {
			Employee[] newarray = new Employee[2* stack.length];
			System.arraycopy(stack, 0 , newarray, 0 ,stack.length);
			stack = newarray ;
			}
			stack [top++] = employee;
			
		}
		public Employee pop() {
			
			if (isEmpty()) {
				throw new EmptyStackException();
				
			}
			return stack[top -1];
		}
		public int size() {
			return top;
			
		}
		private boolean isEmpty() {
			return top ==0;
			
		}
		public void printStack() {
			
			for(int i = top-1; i>=0;i--) {
				System.out.println(stack[i]);
				
			}
		}
		
	
	

}
