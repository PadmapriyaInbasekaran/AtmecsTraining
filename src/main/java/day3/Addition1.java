package day3;

public class Addition1 extends Calc1{

	public void add(int input1, int input2) {
		sum = input1 + input2;
		System.out.println(sum);
	}

	public void add(int input1, int input2, int input3) {
		sum = input1 + input2 + input3;
		System.out.println(sum);
	}
}
