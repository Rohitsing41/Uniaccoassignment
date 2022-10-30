package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UniaccoAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.gecko.driver", "./selenium/geckoDriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://unicreds.com/contact-us");
		Thread.sleep(40000);
		driver.findElement(By.xpath("//button[.='No Thanks']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='×']")).click();
		driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("Rohitsing Jaysing Rajput");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rohitsingrajput41@gmail.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@class='p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-md']"));
		 Select sl = new Select(ele);
		 sl.selectByVisibleText("India (+91)");
		 driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("7406709796");
		 driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Test completed");
		 Thread.sleep(1000);
		 JavascriptExecutor Js = (JavascriptExecutor) driver;
		 for(int i=0; i<2 ; i++)
		 {
			 Js.executeScript("window.scrollBy(0,200)");
			 Thread.sleep(2000);
		 }
		 driver.findElement(By.xpath("//button[.='Submit']")).click();

			

	}

}
