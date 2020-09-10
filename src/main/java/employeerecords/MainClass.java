package employeerecords;

import java.util.*;




public class MainClass {
	static String name , department , designation;
	static int id;
	static int salary;
	static Scanner sc;
	static String option;
	static Map<Integer, NewPojo> m;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		m = new HashMap<Integer, NewPojo>(); 
		do
		{
			System.out.println("Welcome!! Select the action you want to perform , \n1.Add a record \n2.Search a record with id \n3.Delete record with id \n4.Display all records \n5.Write to Database..");
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
				salary = sc.nextInt();
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
				DisplayRecords d = new DisplayRecords();
				d.dispRecords();
				break;
			}
			case 5:
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
				salary = sc.nextInt();
				NewPojo emp = new NewPojo(id, name, department, designation,salary);
				//WriteToDb w = new WriteToDb(id, name, department, designation, salary);
				WriteToDb.writeToDb(emp);
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
