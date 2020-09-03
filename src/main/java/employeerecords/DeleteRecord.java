package employeerecords;

public class DeleteRecord extends AddRecord{
	public void deleteRecords()
	{
		System.out.println("Enter the id of the record you want to delete..");
		String id = sc.next();
		m.remove(id);
		System.out.println("Record deleted...");
	}
}
