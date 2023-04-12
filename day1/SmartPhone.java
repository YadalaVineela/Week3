package week3.day1;

public class SmartPhone extends AndroidPhone
{
	public void connectWhatsApp()
	{
		System.out.println("We can connect to whatsapp using smartphone");
	}
	public static void main(String[] args) 
	{
		SmartPhone sp= new SmartPhone();
		sp.sendMsg();
		sp.saveContact();
		sp.makeCall();
		sp.takeVideo();
		sp.connectWhatsApp();
		
	}
}
