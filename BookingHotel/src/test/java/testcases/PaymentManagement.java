package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManagement 
{
	@Test
	public void applyDiscount()
	{
		
	}
	
	@Test
	@Parameters("action")
	public void makePayment(String paymentType,ITestContext context)
	{
		if(paymentType.equals("pay@hotel"))
			System.out.println("Make payment @hotel");
		else
			System.out.println("Make payment @online");	
		
		//Booking Number
		String bookingID = "RRR1234";
		System.out.println(bookingID);
		context.setAttribute("bID", bookingID);
	}

}
