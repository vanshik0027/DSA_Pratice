package DSA.Java.DoublyLinkedLists;

public class EmployeeDoublyLinkedList {
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	public void addFront(Employee employee) {
		
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		
		if(head ==null) {
			tail= node;
		}
		else {
			head.setPrevious(head);
		}
		head =node;
		size++;
		
	}
	
	public void addToEnd(Employee employee) {
		
		EmployeeNode node = new EmployeeNode(employee);
		if(tail ==null) {
		  head=node;
		  
		}
		else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail =node;
		size++;
	}
	
	public EmployeeNode removeFromFront() {
		
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removeNode = head;
		 head = head.getNext();
		 size--;
		removeNode.setNext(null);
		 return removeNode;
	}
	public int getSize() {
		return size;
	}
	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD ->");
		while(current !=null) {
			System.out.print(current);
			System.out.print("<->");
			current = current.getNext();
		}
		System.out.println("null");
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head == null;
	}

}
