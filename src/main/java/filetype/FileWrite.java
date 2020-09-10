package filetype;
import java.io.File;


import java.io.IOException;
import java.io.PrintStream;

public class FileWrite extends AddRecord{
	PrintStream console;
	public void dispRecords() throws IOException
	{  
		
		System.out.println();
		try
		{
			File currDir = new File(".");
			String path = currDir.getAbsolutePath();
			File file = new File(path);
			PrintStream stream=new PrintStream(file);
			console = System.out;
			System.setOut(stream);
			DisplayRecords.dispRecords();
			System.setOut(console);
	}
		
		catch(Exception e)
		{
			System.out.print(e);
		}    
	}

}






