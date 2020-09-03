package day2;

public class Division extends Calc {
	int divide1;
	public void div(int input1, int input2) {
		if(input2 == 0)
		{
			throw new ArithmeticException("Cannot be divided by zero");
		}
		else
		{
			divide = input1 / input2;
			System.out.println(divide);
		}
	}
	public void div(int input1, int input2, int input3) {

		if(input2 == 0)
		{
			throw new ArithmeticException("Cannot be divided by zero");
		}
		else
		{
			divide1 = input1 / input2;
		}
		if(input3==0)
		{
			throw new ArithmeticException("Cannot be divided by zero");

		}
		else
		{
			divide = divide1 / input3;
			System.out.println(divide);
		}
	}
}