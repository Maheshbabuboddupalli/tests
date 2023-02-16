package DemoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGSecond {
	
	
	@Test
	public void testwikipedia() throws InterruptedException {
		
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/");
		driver.manage().window().maximize();
		
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
         
		
		
		
		
		
	}
	
	
	

}
