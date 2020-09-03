package day6;

import java.util.ArrayList;

public class MultiClass extends ClassMain{
	public void mul(ArrayList<Integer> alist) {

		for(int i=0; i < alist.size(); i++)
		{ 

			multiply = multiply * alist.get(i);
		}
		System.out.println(multiply);

	}
}

