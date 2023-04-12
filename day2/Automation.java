package week3.day2;

public class Automation extends MultipleLangauge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation a= new Automation();
		a.Selenium();
		a.languagejava();
		a.ruby();
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("its a selenium tool");
	}

	public void languagejava() {
		// TODO Auto-generated method stub
		System.out.println("language is java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("language is ruby");
	}

}
