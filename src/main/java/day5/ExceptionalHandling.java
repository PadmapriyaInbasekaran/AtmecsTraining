package day5;

import java.util.Scanner;

public class ExceptionalHandling {
	static int input1;
	static int input2;
	static int input3;
	static int number;
	int sum,subtract,multiply,divide;
	static String op;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the number of inputs(2 or 3 only) for the operations:");
			number = sc.nextInt();

			if(number > 3)
			{
				System.out.println("Input should be less than 4");
				System.exit(0);
			}

			else if (number == 2) {
				System.out.println("Enter the first input:");
				input1 = sc.nextInt();
				System.out.println("Enter the second input:");
				input2 = sc.nextInt();
			} else {
				System.out.println("Enter the first input:");
				input1 = sc.nextInt();
				System.out.println("Enter the second input:");
				input2 = sc.nextInt();
				System.out.println("Enter the third input:");
				input3 = sc.nextInt();
			}


			System.out.println("Enter the operation you want to perform: + - * /");

			op = sc.next();
			if (op.equals("+")) {
				AddClass a = new AddClass();
				if (number == 2)
					a.add(input1, input2);
				else
					a.add(input1, input2, input3);

			} else if (op.equals("-")) {
				SubClass s = new SubClass();
				if (number == 2)
					s.sub(input1, input2);
				else
					s.sub(input1, input2, input3);

			} else if (op.equals("*")) {
				MultiClass m = new MultiClass();
				if (number == 2)
					m.mul(input1, input2);
				else
					m.mul(input1, input2, input3);

			} else {
				DivClass d = new DivClass();
				if (number == 2)
					d.div(input1, input2);
				else
					d.div(input1, input2, input3);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
			System.out.println("Program exited");
		}
	}
}
