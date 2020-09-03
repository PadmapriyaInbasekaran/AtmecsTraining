package calcwithninputs;

public class DivClass extends ClassMain{
	public void div(int[] input1) {
		divide = input1[0];
		for(int index = 1; index < number; index++)
		{
		
		divide=divide/input1[index];
		}
		System.out.println(divide);
	
	}
	}
