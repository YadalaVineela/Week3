package week3.day1;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s= new Students();
		s.getStudentInfo(234);
		s.getStudentInfo(234, "Harika");
		s.getStudentInfo("harika@gmail.com", 345679087);

	}
	public void getStudentInfo(int studentId) {
		// TODO Auto-generated method stub
		System.out.println("This method has student id");
	}
	public void getStudentInfo(int id,String name) {
		// TODO Auto-generated method stub
		System.out.println("This method has id and name");
	}
	public void getStudentInfo(String email,int phoneNo)
	{
		System.out.println("this method has email and phone number");
	}

}
