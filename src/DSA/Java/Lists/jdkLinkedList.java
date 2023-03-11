package DSA.Java.Lists;

import java.util.Iterator;
import java.util.LinkedList;

public class jdkLinkedList {
	public static void main(String[] args) {

		Employee janeJones = new Employee("jane", "jones", 123);
		Employee jamesDoe = new Employee("james", "bond", 236);
		Employee rahulMishra = new Employee("Rahul", "mishra", 788);
		Employee rnikiGadhi = new Employee("Rniki", "gadhi", 567);
		Employee ronakMark = new Employee("ronak", "mark", 324);
		Employee Anksu = new Employee("Anshu","kumae",123);
		LinkedList<Employee>  list = new LinkedList<>();
		list.addFirst(jamesDoe);
		list.addFirst(janeJones);
		list.addFirst(ronakMark);
		list.addFirst(rnikiGadhi);
		list.addFirst(rahulMishra);
		list.addLast(Anksu);
		Iterator<Employee> iter =list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next());
			System.out.print("<->");
	
		}
		System.err.println("null");
	}

}
