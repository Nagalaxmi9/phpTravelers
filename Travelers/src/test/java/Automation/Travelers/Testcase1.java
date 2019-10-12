package Automation.Travelers;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class Testcase1  extends Homepage {
	@Test
	public static void userRegistration() throws Exception  {
		Homepage h=new Homepage();
		h.Launch();
		h.signup();
		
		Registration r = new Registration();
		r.firstname().sendKeys(h.prop.getProperty("firstname"));
		r.lastname().sendKeys(h.prop.getProperty("lastname"));
		r.mobile().sendKeys(h.prop.getProperty("mobile"));
		r.email().sendKeys(h.prop.getProperty("email"));
		r.password().sendKeys(h.prop.getProperty("password"));
		r.confirmpassword().sendKeys(h.prop.getProperty("confirmpassword"));
		r.Rsubmit();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\screenshot\\screenshot.png"));
		
	}

}