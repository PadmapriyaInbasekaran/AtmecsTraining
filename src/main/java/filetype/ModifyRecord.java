package filetype;
public class ModifyRecord extends MainClass {
	public static void  modifyRecord(NewPojo emp)
	{
		System.out.println("Enter the id of the record you want to modify..");
		int id = sc.nextInt();
		System.out.println("Enter the field you want to modify..");
		field = sc.next();
		
		m.replace(id, emp);
		System.out.println("Enter the new field value..");
		if(field.equals("name"))
		{
		name = sc.next();	 
		emp.setName(name);
		}
		else if(field.equals("department"))
		{
			department = sc.next();
			emp.setDepartment(department);
		}
		else if(field.equals("designation"))
		{
			designation = sc.next();
			emp.setDesignation(designation);
		}
		else if(field.equals("salary"))
		{
			salary = sc.next();
			emp.setSalary(salary);
		}
		else
		{
			System.out.println("Invalid field");
		}
		
	}
}
