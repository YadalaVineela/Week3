package week3.day3;

public class Sample {

	
		// TODO Auto-generated method stub
		 int data=50;  
		  
		 void change(){  
		 data=data+100;//changes will be in the local variable only  
		 }
		     
		 public static void main(String args[]){  
			 Sample op=new Sample();  
		  
		   System.out.println("before change "+op.data);  
		   op.change();  
		   System.out.println("after change "+op.data);  
		  
		 }  
		 final void hello()
		 {
			 System.out.println("this is a hello");
		 }
		

	}


