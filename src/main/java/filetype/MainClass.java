package filetype;

import java.io.IOException;
import java.util.*;


public class MainClass {
	static String name , department , designation;
	static int id;
	static String salary;
	static Scanner sc;
	static String option;
	static String field ;
	static Map<Integer, NewPojo> m;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		m = new HashMap<Integer, NewPojo>(); 
		do
		{
			System.out.println("Welcome!! Select the action you want to perform , \n1.Add a record \n2.Search a record with id \n3.Delete record with id \n4.Write to file \n5.Read a file \n6.Display all records \n7.Modify a record");
			int input = sc.nextInt();
			switch(input)
			{
			case 1:
			{
				System.out.println("Enter Id: ");
				id = sc.nextInt();
				System.out.println("Enter the Name: ");
				name = sc.next();
				System.out.println("Enter the Department: ");
				department = sc.next();
				System.out.println("Enter the Designation: ");
				designation = sc.next();
				System.out.println("Enter the Salary: ");
				salary = sc.next();
				NewPojo emp = new NewPojo(id, name, department, designation,salary);
				AddRecord.add(emp);
				System.out.println("Record added successfully!!");
				break;
			}
			case 2:
			{
				SearchRecord sr = new SearchRecord();
				sr.searchRecords();
				break;
			}
			case 3:
			{
				DeleteRecord d = new DeleteRecord();
				d.deleteRecords();
				break;
			}
			case 4:
			{
				FileWrite d = new FileWrite();
				d.dispRecords();
				System.out.println("Record added to file successfully!!");
				break;
			}
			case 5:
			{
				ReadFile r = new ReadFile();
				r.readFile();
				System.out.println("File has been read successfully!!");
				break;
			}
			case 6:
			{
				DisplayRecords d=new DisplayRecords();
				d.dispRecords();
				break;
			}
			case 7:
			{
				NewPojo emp = new NewPojo(id, name, department, designation,salary);
				ModifyRecord.modifyRecord(emp);
			
				break;
			}
			default:
			{
				System.out.println("Invalid selection ");
			}
			}
			System.out.println("Do you want to continue your action?? Press Y for yes and N for no...");
			option = sc.next();
		}while(option.equalsIgnoreCase("y"));
		System.out.println("Program exited...");
	}

}
