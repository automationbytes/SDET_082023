package Sele_Apr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//driver.
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement Firstname = driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Firstname");
		
		driver.findElement(By.name("lastname")).sendKeys("lastname");
		
		driver.findElement(By.name("reg_email__")).sendKeys("test@test.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("password");
		
		WebElement DayDd = driver.findElement(By.id("day"));
		
		
		
		Select d1 = new Select(DayDd);
		d1.selectByVisibleText("9");
		
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bix");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("bix");
		driver.findElement(By.xpath("//input[@aria-label='Log In']")).click();*/
		
	}

}
