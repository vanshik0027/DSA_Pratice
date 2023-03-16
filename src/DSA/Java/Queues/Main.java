package DSA.Java.Queues;

import DSA.Java.DoublyLinkedLists.Employee;

public class Main {

	public static void main(String[] args) {
		Employee janeJones = new Employee("jane", "jones", 123);
		Employee jamesDoe = new Employee("james", "bond", 236);
		Employee rahulMishra = new Employee("Rahul", "mishra", 788);
		Employee rnikiGadhi = new Employee("Rniki", "gadhi", 567);
		Employee ronakMark = new Employee("ronak", "mark", 324);
		
		ArrayQueue queue = new ArrayQueue(10);
		//queue.add(janeJones);
		
		queue.printqueue();

	}

}
