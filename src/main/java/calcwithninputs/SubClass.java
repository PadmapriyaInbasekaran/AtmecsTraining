package calcwithninputs;

public class SubClass extends ClassMain {
	public void sub(int[] input1) {
		subtract=input1[0];
		for(int index = 1; index < number; index++)
		{

			subtract -= input1[index];
		}
		System.out.println(subtract);

	}
}