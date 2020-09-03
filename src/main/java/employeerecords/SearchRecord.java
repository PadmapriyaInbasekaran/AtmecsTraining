package employeerecords;

import java.util.List;

public class SearchRecord extends AddRecord{
	public void searchRecords()
	{
		System.out.println("Enter the id of the record you want to search..");
		String id = sc.next();
		if(m.containsKey(id))
		{
			List<String> record = m.get(id);
			System.out.println(record);

		}


		else
		{
			System.out.println("Record not found!!");
		}
	}
}