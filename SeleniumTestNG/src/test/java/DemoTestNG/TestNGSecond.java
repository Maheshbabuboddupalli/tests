package DemoTestNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGSecond {
	
	
	@Test(priority=1)
	public void testwikipedia() throws InterruptedException {
		
		
       WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/");
		driver.manage().window().maximize();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "https://en.wikipedia.org/-Google Search";
		
		Assert.assertEquals(ActualTitle, ActualTitle,"This Test is matched ");
		assertTrue(true);
		
		WebElement Search =driver.findElement(By.xpath("//input[@type='search']"));
		Search.sendKeys("Pushpa-The Rise");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
		
		WebElement Releasedate = driver.findElement(By.xpath("//table[@class='infobox vevent']/tbody/tr[12]"));
		
		String date = Releasedate.getText();
        
		System.out.println("17 December 2021");
		
         WebElement country = driver.findElement(By.xpath("//table[@class='infobox vevent']/tbody/tr[14]"));
         
         String Countryoforigin = country.getText();
         
         System.out.println("India");
         
         driver.close();
         driver.quit();
         
		
		
		
		
		
	}
	
	@Test(priority=0)
	public void testImdb() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com/");
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "https://www.imdb.com/-Google Search";
		
		Assert.assertEquals(ActualTitle, ActualTitle,"This Test is matched ");
		assertTrue(true);
		
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
	 driver.quit();
	}

}

//Suppose i am not giving expected title in above  code it will not give the output because its shows in console output expected value is missing.
// why i am giving Custom message in Assert condition it will shows in console output if it is matched or mismatched  
//String ActualTitle = driver.getTitle();
//String ExpectedTitle = "https://www.imdb.com/-Google Search";

//Assert.assertEquals(ActualTitle, ActualTitle,"This Test is matched ");
//asertTrue(false);   --- i will give true or false value of the above code 
