package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l1= new ArrayList<Integer>();
		l1.add(3);
		l1.add(2);
		l1.add(11);
		l1.add(4);
		l1.add(6);
		l1.add(7);
		Collections.sort(l1);
		System.out.println("second largest"+" "+l1.get(l1.size()-2));
	}

}
