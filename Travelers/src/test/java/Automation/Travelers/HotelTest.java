package Automation.Travelers;
import org.testng.annotations.Test;
public class HotelTest extends Hotel_Search1 {

	
	
	
	LaunchBrowser  l1=new LaunchBrowser ();
		Hotel_Search1 h1=new Hotel_Search1();


	@Test
	public void test1() throws Exception 
	{
		l1.Launch();
		h1.hoteldetails();
		
	}

	}

