package filetype;

public class DeleteRecord extends AddRecord{
	public void deleteRecords()
	{
		System.out.println("Enter the id of the record you want to delete..");
		int id = sc.nextInt();
		m.remove(id);
		System.out.println("Record deleted...");
	}
}
