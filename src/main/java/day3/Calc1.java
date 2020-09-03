package day3;
import java.util.Scanner;

public class Calc1  {

	static int input1;
	static int input2;
	static int input3;
	static int number;
	int sum,subtract,multiply,divide;
	static String operation;
	static String input;
	static String option;
	public static void main(String args[]) throws ThrowException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what task you want to perform   \n1.calculator    \n2.Expression evaluation:");
		int task = sc.nextInt();
		switch(task)
		{
		case 1:

		{
			do
			{

				System.out.println("Enter the number of inputs for the operations(Less than 4):");

				number = sc.nextInt();
				if (number == 2) {
					System.out.println("Enter the first input:");
					input1 = sc.nextInt();
					System.out.println("Enter the second input:");
					input2 = sc.nextInt();
				} else if(number == 3) {
					System.out.println("Enter the first input:");
					input1 = sc.nextInt();
					System.out.println("Enter the second input:");
					input2 = sc.nextInt();
					System.out.println("Enter the third input:");
					input3 = sc.nextInt();
				}
				else
				{

					try
					{
						if(number > 3)
						{
							throw new ThrowException("\nEnter values only between 2 to 3...Program terminated");

						}

					}
					catch(ThrowException e)
					{
						System.out.println("Exception occured  :"+e);
						System.exit(0);
					}
				}

				System.out.println("Enter the operation you want to perform: + - * /");

				operation = sc.next();
				if (operation.equals("+")) {
					Addition1 a = new Addition1();
					if (number == 2)
						a.add(input1, input2);
					else
						a.add(input1, input2, input3);

				} else if (operation.equals("-")) {
					Subtraction1 s = new Subtraction1();
					if (number == 2)
						s.sub(input1, input2);
					else
						s.sub(input1, input2, input3);

				} else if (operation.equals("*")) {
					Multiplication1 m = new Multiplication1();
					if (number == 2)
						m.mul(input1, input2);
					else
						m.mul(input1, input2, input3);

				} else {
					Division1 d = new Division1();
					if (number == 2)
						d.div(input1, input2);
					else
						d.div(input1, input2, input3);
				}
				System.out.println("Do you want to continue ,Press Y for yes or N for no:");
				input =	sc.next();

			}while(input.equalsIgnoreCase("y"));
			System.out.println("Program exited");
			break;
		}
		case 2:
		{
			Expressions e  =new Expressions();
			e.getResult();
			break;
		}
		default:
		{
			System.out.println("Invalid data..Please provide a correct value....");
		}
		}
		sc.close();
	}

}




