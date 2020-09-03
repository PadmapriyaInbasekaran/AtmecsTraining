package day5;

public class SubClass extends ExceptionalHandling {


	public void sub(int input1, int input2) {
		subtract = input1 - input2;
		System.out.println(subtract);
	}

	public void sub(int input1, int input2, int input3) {
		subtract = input1 - input2 - input3;
		System.out.println(subtract);
	}
}
