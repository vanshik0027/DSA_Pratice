package DSA.Java.Lists;

public class singlyLinkedList extends EmployeeLInkList {

	public static void main(String[] args) {

		Employee janeJones = new Employee("jane", "jones", 123);
		Employee jamesDoe = new Employee("james", "bond", 236);
		Employee rahulMishra = new Employee("Rahul", "mishra", 788);
		Employee rnikiGadhi = new Employee("Rniki", "gadhi", 567);
		Employee ronakMark = new Employee("ronak", "mark", 324);

		EmployeeLInkList list = new EmployeeLInkList();
		System.out.println(list.isEmpty());
		list.addFront(janeJones);
		list.addFront(jamesDoe);
		list.addFront(rahulMishra);
		list.addFront(ronakMark);
		list.addFront(rnikiGadhi);
		System.out.println(list.getSize());
		list.printList();
		
		list.removeFromFront();
		System.out.println(list.getSize());
		list.printList();
	}
}
