package techfios;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechfiosTest {
	@Test 
	public void Login(){ 


	System.setProperty("webdriver.chrome.driver", "C:\\auto1\\chromedriver.exe"); // Object command for locating chrome driver 

	WebDriver driver = new ChromeDriver(); 
	//driver object reference access all the built in function in selenium. 

	driver.manage().window().maximize(); // maximizes window 

	driver.get("http://techfios.com/test/billing/?ng=login/"); 
	driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com"); 

	driver.findElement(By.id("password")).sendKeys("abc123"); 

	driver.findElement(By.name("login")).click();
	driver.findElement(By.xpath("//text()[contains(.,'CRM')]/ancestor::a[1]")).click();
	driver.findElement(By.xpath("//a[text()='Add Contact']")).click();
	driver.findElement(By.id("account")).sendKeys("Polly Page");
	driver.findElement(By.id("company")).sendKeys("Homestead");
	driver.findElement(By.id("email")).sendKeys("polly.page@hotmail.com");
	driver.findElement(By.id("phone")).sendKeys("1234567890");
	driver.findElement(By.id("address")).sendKeys("123 Main Street");
	driver.findElement(By.id("city")).sendKeys("Diamond");
	driver.findElement(By.id("state")).sendKeys("AL");
	driver.findElement(By.id("zip")).sendKeys("123456");
	driver.findElement(By.id("submit")).click();
	


}
}
