package week3.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharactersSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String companyName = "google" ;
		 String empty="";
		 char[] companyArray = companyName.toCharArray();
		 Set <Character>unique_values=new LinkedHashSet<Character>();
		 for (char c : companyArray) 
		 {
			 unique_values.add(c);
			 
		 }
		 for (Character c : unique_values) 
		 {
			 empty=empty+c;
		}
		 
		 System.out.println(empty);
	}

}
