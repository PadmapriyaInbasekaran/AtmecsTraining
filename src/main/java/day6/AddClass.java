package day6;

import java.util.ArrayList;

public class AddClass extends ClassMain {
	public void add(ArrayList<Integer> alist) {

		for(int i=0; i < alist.size(); i++)
		{ 

			sum = sum + alist.get(i);
		}
		System.out.println(sum);



	}

}