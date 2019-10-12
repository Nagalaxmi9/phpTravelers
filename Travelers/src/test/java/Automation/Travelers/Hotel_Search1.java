package Automation.Travelers;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;



public class Hotel_Search1 extends LaunchBrowser {
	
	
	static By Hotel=By.xpath("//span[contains(text(),'Hotels')]");
	static By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	static By Hotelcity=By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	static By Hotelselect=By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
	static By select=By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li/div");
    static By checkin=By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
    static By checkout=By.xpath("//input[@placeholder='Check out']");
    static By guest=By.xpath("//input[@id='htravellersInput']");
    
    
    
	public static void hoteldetails() throws InterruptedException
	{   //Hotel/city_Search field
		driver.findElement(cookies).click();
		driver.findElement(Hotel).click();
		
		driver.findElement(Hotelcity).click();
		driver.findElement(Hotelselect).sendKeys(prop.getProperty("city"));
		driver.findElement(Hotelselect).sendKeys((Keys.DOWN));
		
		Thread.sleep(3000);
		driver.findElement(select).click();
		
		
		
		//Checkin 
		driver.findElement(checkin).click();
		Thread.sleep(2000);
	while(true)	
	{
	String text=driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[2]")).getText();
	if(text.equals(prop.getProperty("checkin_month")))
	{
		break;
	}
	else
	{
		driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[3]")).click();
	}
	}
		
		driver.findElement(By.xpath("//div[14]//tr//td[contains(text(),"+prop.getProperty("checkin_day")+")]")).click();
				
	
	
	//checkout
	while(true)	
	{
	String text=driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[2]")).getText();
	if(text.equals(prop.getProperty("checkout_month")))
	{
		break;
	}
	else
	{
		driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[3]")).click();
		
	}
	}
		
		driver.findElement(By.xpath("//div[15]//tr//td[contains(text(),"+prop.getProperty("checkout_day")+")]")).click();
				
		
	 //Guest
		driver.findElement(guest).click();
		driver.findElement(By.xpath("//button[@id='hadultPlusBtn']")).click();
		driver.findElement(By.xpath("//button[@id='hchildPlusBtn']")).click();
		driver.findElement(guest).click();
		
	 //Search
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")).click();
		
	
	
	
	}
}
	
	
	
	
