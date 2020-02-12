package Aggregation;

import static org.junit.Assert.*;

import org.junit.Test;

import Aggregation.Receipt.Type;

public class ReceiptListTest 
{
	ReceiptList list = new ReceiptList();
	@Test
	//Checking ArrayList yes
	public void checkArrayList()
	{
		assertTrue(list.getAllReceipts().isEmpty());

	}
	
	public void addReceiptCheck()
	{
		Receipt r = new Receipt(Type.BUSINESS,2.0,"Here");
		list.addReceipt(r);
		
		assertTrue(list.getBusinessReceipts().contains(r));		
		
	}

}
