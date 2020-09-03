package day6;

import java.util.ArrayList;

public class DivClass extends ClassMain{
	public void div(ArrayList<Integer> alist) {

		divide = alist.get(0);

		for(int i=0; i < alist.size()-1; i++)
		{

			divide = divide / alist.get(i+1);
		} 
		System.out.println(divide);


	}
}
