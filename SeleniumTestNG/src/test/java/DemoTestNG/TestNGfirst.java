package DemoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGfirst {
	
	@Test
	public void testImdb() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com/");
		
		WebElement Search =driver.findElement(By.id("suggestion-search"));
		
		Search.sendKeys("Pushpa-The Rise");
		Thread.sleep(3000);
		
		WebElement pushpa =driver.findElement(By.xpath("//li[@id='react-autowhatever-1--item-0']//div[@class='sc-bjfHbI fOUGiO searchResult__constTitle']"));
		pushpa.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Releasedate = driver.findElement(By.linkText("Release date"));
		js.executeScript("return arguments[0].scrollIntoView();", Releasedate);
		
		String Release = Releasedate.getText();
		System.out.println("17th December 2021");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement Countryoforigin = driver.findElement(By.xpath("//button[@class='ipc-metadata-list-item__label']"));
		jse.executeScript("return arguments[0].scrollIntoView();", Countryoforigin);
		
		String Country = Countryoforigin.getText();
		System.out.println("India");
		
		driver.close();
		
		
		
		
		
	}
	
	

}
