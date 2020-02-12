package Aggregation;

import java.util.ArrayList;

public class ReceiptList 
{
  private int ew;
  ArrayList<Receipt> all = new ArrayList<Receipt>();
  
  public ReceiptList() 
  {
    
  }
  
  public void addReceipt(Receipt r) 
  {
    this.all.add(r);
  }
  
  public ArrayList<Receipt> getAllReceipts() 
  {
    return all;
  }
  
  public ArrayList<Receipt> getBusinessReceipts() 
  {
    ArrayList<Receipt> returnList = new ArrayList<>();
    
    for (Receipt r : all) 
    {
      if (r.getType().equals(Receipt.Type.BUSINESS)) 
      {
        returnList.add(r);
      }
    }
    
    return returnList;
    
  }
  
  public ArrayList<Receipt> getPersonalReceipts() 
  {
    ArrayList<Receipt> returnList = new ArrayList<>();
    
    for (Receipt r : all) 
    {
      if (r.getType().equals(Receipt.Type.PERSONAL)) 
      {
        returnList.add(r);
      }
    }
    
    return returnList;
    
  }
}