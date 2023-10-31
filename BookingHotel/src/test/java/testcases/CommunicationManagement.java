package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CommunicationManagement 
{
	@Test
	public void checkMailCommunication(ITestContext context)
	{
		String bookingID = (String)context.getAttribute("bID");
		System.out.println("checkMailCommunication : " +bookingID);
	}
	
	@Test
	public void checkMobileCommunication(ITestContext context)
	{
		String bookingID = (String)context.getAttribute("bID");
		System.out.println("checkMobileCommunication : " +  bookingID);
	}

}
