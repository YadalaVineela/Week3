package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		//click on simple alert
		driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']/following-sibling::button")).click();
		Alert simple_alert = driver.switchTo().alert();
		//get text from alert
		String simple_alert_text = simple_alert.getText();
		System.out.println(simple_alert_text);
		//accept the alert
		simple_alert.accept();
		//click on button
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following-sibling::button")).click();
		Alert confirm_alert = driver.switchTo().alert();
		//get text from alert
		String Confirm_alert_text = confirm_alert.getText();
		System.out.println("Text present in confirm alert is"+":"+Confirm_alert_text);
		//dismiss alert
		confirm_alert.dismiss();
		//Sweet non modal alert
		driver.findElement(By.xpath("//h5[text()='Sweet Modal Dialog']/following-sibling::button")).click();
		//get text from alert
		String sweet_alert_text = driver.findElement(By.xpath("//span[text()='Modal Dialog (Sweet Alert)']/parent::div/parent::div")).getText();
		System.out.println("text in sweet modsl"+":"+sweet_alert_text);
		//close sweet alert
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Modal Dialog (Sweet Alert)']/following::span")).click();
		//Prompt dialog
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button")).click();
		Alert prompt_alert = driver.switchTo().alert();
		prompt_alert.sendKeys("Helloooo");
		Thread.sleep(1000);
		prompt_alert.accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Confirmation)']/following::button")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'confirmdialog')])[1]")).click();
		
		

	}

}
