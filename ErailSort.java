package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");

		driver.findElement(By.xpath("//label[text()='Sort on Date']/following::input[@id='chkSelectDateOnly']"))
				.click();

		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();

		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("Mgr chennai ", Keys.ARROW_DOWN.ENTER);

		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();

		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("Coimbatore Jn", Keys.ARROW_DOWN.ENTER);

		Thread.sleep(3000);
		List<WebElement> findElements = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr/td[2]/a"));

		System.out.println(" Size :" + findElements.size());
		

		for (WebElement webElement : findElements) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
		
driver.findElement(By.xpath("//b[text()='Train Name']")).click();

List<WebElement> findElements1 = driver
.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr/td[2]/a"));
		
System.out.println("After sort");
		for (WebElement webElement : findElements1) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
	
		//Collect ions.sort(sortedList);
		

	}

}
