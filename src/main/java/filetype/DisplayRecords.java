package filetype;


import java.util.Map.Entry;
import java.util.Set;

public class DisplayRecords extends AddRecord{
	public void dispRecords()
	{  
		Set<Entry<Integer, NewPojo>> st = m.entrySet();
		for (Entry<Integer, NewPojo> me : st) { 
			System.out.print(me.getKey() + ":"); 
			System.out.println(me.getValue());

		}
	}

}



