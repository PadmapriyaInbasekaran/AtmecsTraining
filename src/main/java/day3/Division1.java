package day3;

public class Division1 extends Calc1{


	public void div(int input1, int input2) {

		divide = input1 / input2;

		System.out.println(divide);

	}
	public void div(int input1, int input2, int input3) {
		int divide1 = input1 / input2;
		divide = divide1 / input3;
		System.out.println(divide);
	}
}
