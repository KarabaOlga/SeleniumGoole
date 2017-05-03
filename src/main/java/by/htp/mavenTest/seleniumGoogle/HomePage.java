package by.htp.mavenTest.seleniumGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Page {

	private static final String URL = "https://www.google.ru/";
	private static final String INPUT_REQUEST_XPATH = "//*[@id='lst-ib']";
	private static final String RESULTS_XPATH = "//*[@id='resultStats']";
	private static final String REQUEST = "Java";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void open() {
		getDriver().get(URL);
	}

	public ResultPage getResultPage() {

		WebElement inputRequestElement = (new WebDriverWait(driver, 2))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(INPUT_REQUEST_XPATH)));
		inputRequestElement.sendKeys(REQUEST);
		inputRequestElement.submit();

		(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(RESULTS_XPATH)));

		return new ResultPage(driver);
	}
}