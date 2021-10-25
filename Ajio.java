package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bags",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='Men']/following::label[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following::label[1]")).click();
		
		Thread.sleep(9000);
		
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		
		System.out.println("No. of Items: "+text);
		
		System.out.println(" List of Brands");
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());

		for (WebElement webElement : bagBrandList) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagNameList) {
			String text2 = webElement.getText();
			System.out.println(text2);
		}
	}

}
