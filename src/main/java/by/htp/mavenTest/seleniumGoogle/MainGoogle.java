package by.htp.mavenTest.seleniumGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainGoogle {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","/home/dummy/selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.ru/");
		
		Thread.sleep(20000);
		
		WebElement windowElement = driver.findElement(By.id("lst-id"));
		windowElement.sendKeys("Java");
		
		Thread.sleep(500);
		
		WebElement linkElement = driver.findElement(By.id("gsr"));
		linkElement.click();
		
		Thread.sleep(20000);
		
		
	}

}
