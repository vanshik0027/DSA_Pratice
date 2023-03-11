package DSA.Java.Stacks;

public class ArrayMain {

	public static void main(String[] args) {
		arrayStack stack = new arrayStack(10);
		stack.push(new DSA.Java.Stacks.Employee("jane", "jones", 234));
		stack.push(new DSA.Java.Stacks.Employee("john", "doe",233));
		stack.push(new DSA.Java.Stacks.Employee("wefg", "mid",346));
		stack.push(new DSA.Java.Stacks.Employee("rahul", "end",345));
		
		stack.printStack();
		stack.pop();

	}

}
