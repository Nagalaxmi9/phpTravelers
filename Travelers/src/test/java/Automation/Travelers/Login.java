package Automation.Travelers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends LaunchBrowser {
	By email=By.xpath("//input[@placeholder='Email']");
	By password=By.xpath("//input[@placeholder='Password']");
	By rememberme=By.xpath("//input[@id='remember-me']");
	By login=By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
public WebElement email()
{
	return driver.findElement(email);
}
public WebElement password()
{
	return driver.findElement(password);
}
public void rememberme1()
{
	 driver.findElement(rememberme).click();
}
public void login1()
{
	 driver.findElement(login).click();
}
}
	
	
	
	
	
	


