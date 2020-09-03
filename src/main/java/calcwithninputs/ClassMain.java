package calcwithninputs;

import java.util.Scanner;

public class ClassMain {

	static int number;
	int sum=0,subtract=0,multiply=1;
	int divide;
	static String operation;
	static String input;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("Enter the number of inputs for the operations:");
		number = sc.nextInt();
		int input1[]=new int[number];
		for (int index = 0; index < number; index++)
		{
			System.out.println("Enter the input:");
			input1[index] = sc.nextInt();
		}

		System.out.println("Enter the operation you want to perform: + - * /");

		operation = sc.next();
		if (operation.equals("+")) {
			AddClass a = new AddClass();
			a.add(input1);

		} else if (operation.equals("-")) {
			SubClass s = new SubClass();
			s.sub(input1);

		} else if (operation.equals("*")) {
			MultiClass m = new MultiClass();
			m.mul(input1);

		} else {
			DivClass d = new DivClass();
			d.div(input1);
		}
		System.out.println("Do you want to continue ,Press Y for yes or N for no:");
		input=	sc.next();
		}while(input.equalsIgnoreCase("y"));
			System.out.println("Program exited");
			

		sc.close();
	}

}
