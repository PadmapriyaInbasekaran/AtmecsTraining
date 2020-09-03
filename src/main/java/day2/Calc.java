package day2;

import java.util.Scanner;

public class Calc {
	static int input1;
	static int input2;
	static int input3;
	static int number;
	int sum,subtract,multiply,divide;
	static String op;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of inputs(2 or 3 only) for the operations:");
		number = sc.nextInt();
		if (number == 2) {
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
			Addition a = new Addition();
			if (number == 2)
				a.add(input1, input2);
			else
				a.add(input1, input2, input3);

		} else if (op.equals("-")) {
			Subtraction s = new Subtraction();
			if (number == 2)
				s.sub(input1, input2);
			else
				s.sub(input1, input2, input3);

		} else if (op.equals("*")) {
			Multiplication m = new Multiplication();
			if (number == 2)
				m.mul(input1, input2);
			else
				m.mul(input1, input2, input3);

		} else {
			Division d = new Division();
			if (number == 2)
				d.div(input1, input2);
			else
				d.div(input1, input2, input3);
		}
		sc.close();
	}

}
