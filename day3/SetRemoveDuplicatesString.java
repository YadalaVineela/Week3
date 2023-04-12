package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetRemoveDuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String empty=" ";
		 String[] splitArray = text.split(" ");
		Set<String>ch= new LinkedHashSet<String>();
		for (String c : splitArray) 
		{
			//System.out.println(c);
			ch.add(c);
		}
		System.out.println("set without duplicates"+" "+ch);		
		for(String k:ch)
		{
			empty=empty+" "+k;
		}
		System.out.println(empty);
	}

}
