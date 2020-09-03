package employeerecords;

import java.util.ArrayList;

import java.util.List;

public class AddRecord extends MainClass{

	List<String> list = new ArrayList<String>();
	public void add()
	{
		System.out.println("Enter id :");
		String id = sc.next();

		System.out.println("Enter name :");
		list.add(sc.next());
		System.out.println("Enter department :");
		list.add(sc.next());
		System.out.println("Enter designation :");
		list.add(sc.next());
		System.out.println("Enter salary :");
		list.add(sc.next());
		m.put(id, list);

	}

}
