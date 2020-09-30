package Mavenprojects.Mavenjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginrediff {

	
@Test

void loginrediff()
{
	System.setProperty("webdriver.chrome.driver", "D:\\java Drivers\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 Rediffloginpage rd= new Rediffloginpage(driver);
	 rd.EmailId().sendKeys("booji");
	 rd.Password().sendKeys("hello");
	 rd.Submit().click();
}
}
