package Automation.Travelers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends LaunchBrowser  {
	
	By myaccount = By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[2]/ul[1]/li[1]/a[1]");
	By signup = By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]");
	By firstname = By.xpath("/html[1]/body[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[3]/input[1]");
	By login=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
	By hotel=By.xpath("//li[@class='active text-center']//a[@class='text-center']");
	By flights=By.xpath("//span[contains(text(),'Flights')]");
	
	
	
	public void signup() {
		driver.findElement(myaccount).click();
		driver.findElement(signup).click();
		
	}
	public void login() {
		
		driver.findElement(myaccount).click();
		driver.findElement(login).click();
		
	}

	public void hotel() {
		driver.findElement(hotel).click();
		
		
	}
	public void flights() {
		driver.findElement(flights).click();
		
		
	}
	
		}
	

