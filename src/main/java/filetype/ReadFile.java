package filetype;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public void readFile() throws IOException
	{
		FileReader fr=new FileReader("D:\\testout.txt");    
		int i;    
		while((i=fr.read())!=-1)    
		{
			System.out.print((char)i);  
		}
		System.out.println("\n");
		fr.close();  
	}
}

