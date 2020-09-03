package day6;
import java.util.ArrayList;
import java.util.Scanner;
public class ClassMain {
	static int input1;
	static int number;
	int sum=0,subtract=0,multiply=1;
	int divide;
	static String operation;
	static String input;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> alist = new ArrayList<Integer>(); 
		System.out.println("Enter number of input :");
		number = sc.nextInt();
		System.out.println("Enter the input:");
		for(int index = 0; index < number; index++)
		{
			input1 = sc.nextInt();
			alist.add(input1);

		}

		System.out.println("Enter the operation you want to perform: + - * /");

		operation = sc.next();
		if (operation.equals("+")) {
			AddClass a = new AddClass();
			a.add(alist);
		}
		else if (operation.equals("-")) {
			SubClass s = new SubClass();
			s.sub(alist);

		} else if (operation.equals("*")) {
			MultiClass m = new MultiClass();
			m.mul(alist);

		} 
		else {
			DivClass d = new DivClass();
			d.div(alist);
		}

		sc.close();
	}

}
