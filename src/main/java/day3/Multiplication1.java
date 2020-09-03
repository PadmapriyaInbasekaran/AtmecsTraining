package day3;

public class Multiplication1 extends Calc1{

	public void mul(int input1, int input2) {
		multiply = input1 * input2;
		System.out.println(multiply);
	}

	public void mul(int input1, int input2, int input3) {
		multiply = input1 * input2 * input3;
		System.out.println(multiply);
	}

}