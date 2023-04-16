package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		String result_bags = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(result_bags);
		Thread.sleep(3000);
		//checkbox for safari
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//a")).click();
		//checkbox for american tourister
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[3]")).click();
		//to click the sortby
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		//to select new arrivals in sort by
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		//get name of the bag
		String bag_name = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]")).getText();
		System.out.println("bag name is"+":"+bag_name);
		//discounted price of bag
		String discountedPrice_bag = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Discount price of bag"+":"+discountedPrice_bag);
		//get page title
		String title = driver.getTitle();
		System.out.println("Title of page is "+":"+title);
		driver.close();

	}

}
