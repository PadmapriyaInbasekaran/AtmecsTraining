package employeerecords;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DisplayRecords extends AddRecord{
	public void dispRecords()
	{
		 Set<Map.Entry<String, List<String>>> st = m.entrySet();
		for (Map.Entry<String, List<String>> me : st) { 
			System.out.print(me.getKey() + ":"); 
			System.out.println(me.getValue());
		}
	}
}


