package filetype;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map.Entry;
import java.util.Set;

public class FileWrite extends AddRecord{
	public void dispRecords() throws IOException
	{  
		FileWriter fw = null;
		PrintWriter pw = null;
		try
		{
			Set<Entry<Integer, NewPojo>> st = m.entrySet();
			for (Entry<Integer, NewPojo> me : st) 
			{

				fw = new FileWriter("D:\\testout.txt");  
				pw = new PrintWriter(fw);
				pw.write(me.getKey() +":" +me.getValue());    

			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}    
		finally
		{
			fw.close(); 
		}
	}

}






