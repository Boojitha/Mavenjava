package Mavenprojects.Mavenjava;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class Rediffloginpage {
	
	
 WebDriver driver;
 
 

	public Rediffloginpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory .initElements(driver, this);
	
	}

		
		/*By username =By.id("login1");
		By password =By.id("password");
		By signin =By.className("signinbtn");*/
	


@FindBy(id="login1")
WebElement username1;
@FindBy(id="password")
WebElement password;
@FindBy(className="signinbtn")
WebElement signin;


public WebElement EmailId()
{
	return username1;
}
public WebElement Password()
{
	return password;
}
public WebElement Submit()
{
	return signin;
}
}