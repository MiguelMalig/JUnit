package Aggregation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReceiptTest {

	@Test
	public void Constructor() 
	{
		Receipt r1 = new Receipt(Receipt.Type.BUSINESS,2.0,"power");
		
		assertEquals(Receipt.Type.BUSINESS, r1.getType());
		assertEquals(2.0,r1.getTotalAmount(),0);
		assertEquals("power", r1.getPlace());
	}

}
