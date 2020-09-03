package day6;

import java.util.ArrayList;

public class SubClass extends ClassMain {
	public void sub(ArrayList<Integer> alist) {

		subtract = alist.get(0);

		for(int i = 0; i < alist.size()-1; i++)
		{
			subtract =subtract - alist.get(i+1);
		}
		System.out.println(subtract);


	}
}