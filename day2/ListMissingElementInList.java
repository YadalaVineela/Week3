package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListMissingElementInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l1= new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(6);
		for(int i=0;i<l1.size();i++)
		{
			if(i+1!=l1.get(i))
			{
				System.out.println("Missing element is"+" "+(i+1));
			}
		}

	}

}
