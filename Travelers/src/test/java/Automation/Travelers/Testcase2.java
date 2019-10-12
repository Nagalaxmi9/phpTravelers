package Automation.Travelers;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase2 extends Login{
@Test
public static void Login() throws Exception {
	Homepage h=new Homepage();
	h.Launch();
	h.driver.get(h.prop.getProperty("url"));
	
	h.login();
	
	
	Login l=new Login();
	l.email().sendKeys(h.prop.getProperty("email"));
	l.password().sendKeys(h.prop.getProperty("password"));
	l.login1();
	
	
	
	
	
	

	
}
}
