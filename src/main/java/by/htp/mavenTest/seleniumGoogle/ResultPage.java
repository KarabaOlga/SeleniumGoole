package by.htp.mavenTest.seleniumGoogle;

import org.openqa.selenium.WebDriver;

public class ResultPage extends Page {

	public ResultPage(WebDriver driver) {
		super(driver);
	}

	public String getTitle() {
		return driver.getTitle();
	}

}