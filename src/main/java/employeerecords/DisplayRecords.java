package employeerecords;

import java.util.List;
import java.util.Map;

public class DisplayRecords extends AddRecord{
	public void dispRecords()
	{
		for (Map.Entry<Object, List<String>> me : m.entrySet()) { 
			System.out.print(me.getKey() + ":"); 
			System.out.println(me.getValue());
		}
	}
}