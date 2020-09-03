package day1;

import java.util.Scanner;

public class SimpleCalc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the first input:");
		int input1 = sc.nextInt(); 
		System.out.println("Enter the second input:");
		int input2 = sc.nextInt();
		System.out.println("Enter the operation you want to perform: + - * /");
		String operator = sc.next();
		switch(operator)
		{
		case "+":
		{
			System.out.println(input1 + input2);   
			break;
		}
		case "-":
		{
			System.out.println(input1 - input2);   
			break;
		}
		case "*":
		{
			System.out.println(input1 * input2);   
			break;
		}
		case "/":
		{
			System.out.println(input1 / input2); 
			break;
		}
		default:
		{
			System.out.println("Invalid data"); 
		}
		}
		sc.close();
	}

}
