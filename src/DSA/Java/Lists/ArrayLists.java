package DSA.Java.Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		
       List<Employee> employeeList = new ArrayList<>();
       employeeList.add(new Employee("jane","jones",123));
       employeeList.add(new Employee("james","bond",236));
       employeeList.add(new Employee("Rahul","mishra",788));
       employeeList.add(new Employee("Rniki","gadhi",567));
       employeeList.add(new Employee("ronak","mark",324));
       
       
       
       
       //System.out.println(employeeList.isEmpty());
       employeeList.set(1, new Employee("john", "Adama", 345) );
       //employeeList.forEach(Employee -> System.out.println(Employee));
       	
       Object[] emloyeeArray =employeeList.toArray(new Employee[employeeList.size()]);
	   for(Object employee: emloyeeArray) {
		   System.err.println(employee);
	   }
	   System.out.println();
	}

}
