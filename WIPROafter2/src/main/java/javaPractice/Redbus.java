package javaPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement eleSource = driver.findElementById("src");
		eleSource.clear();
		eleSource.sendKeys("Chennai");
		Thread.sleep(3000);
		eleSource.sendKeys(Keys.TAB);
		
		WebElement eleDestination = driver.findElementById("dest");
		eleDestination.clear();
		eleDestination.sendKeys("Trichy");
		Thread.sleep(3000);
		eleDestination.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		driver.findElementById("search_btn").click();
		
		//Boarding date
		WebElement tableOnward = driver.findElementByXPath("//label[text()='Onward Date']");
		tableOnward.click();
		Thread.sleep(3000);
		tableOnward.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//tr[5]/td[5]")).click();
		
		Thread.sleep(3000);
		
		//Return date
		WebElement tableReturn = driver.findElementByXPath("//label[text()='Return Date']");
		tableReturn.click();
		tableOnward.findElement(By.xpath("//div[@id='rb-calendar_return_cal']//tr[5]/td[6]")).click();
		
		Thread.sleep(3000);
		
		driver.findElementById("search_btn").click();
		driver.findElementByXPath("//label[text()='After 6 pm']").click();
		driver.findElementByXPath("//label[text()='AC']").click();
	}

}
