package DSA.Java.DoublyLinkedLists;

public class DoublyLinkedLists extends EmployeeDoublyLinkedList {

	public static void main(String[] args) {

		Employee janeJones = new Employee("jane", "jones", 123);
		Employee jamesDoe = new Employee("james", "bond", 236);
		Employee rahulMishra = new Employee("Rahul", "mishra", 788);
		Employee rnikiGadhi = new Employee("Rniki", "gadhi", 567);
		Employee ronakMark = new Employee("ronak", "mark", 324);

		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
	list.addFront(ronakMark);
	list.addFront(rnikiGadhi);
	list.addFront(rahulMishra);
	list.addFront(jamesDoe);
	list.addFront(janeJones);
	
	System.out.println(list.getSize());
	list.printList();
	
	Employee billEnd = new Employee("Bill", "End", 887);
	list.addFront(billEnd);
	list.printList();
	}
}
