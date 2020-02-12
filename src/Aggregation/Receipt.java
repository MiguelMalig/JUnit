package Aggregation;


/**
 * Basic information about an expense receipt. Includes the type, personal
 * or business, a total amount and the location where the expense was made.
 */

public class Receipt 
{
  
  /**
   * The potential types of receipts, either personal or business.
   */
  public enum Type {BUSINESS, PERSONAL};
  
  Type type;
  double totalAmount;  
  String place;
  
  /** 
   * Creates a new receipt with the given type, amount and place.
   * 
   * @param type what kind of expense is this Receipt
   * @param amount the total amount the recipt is for
   * @place the location where the receipt is from.
   */
  public Receipt(Type type, double amount, String place) {
    this.type = type;
    this.totalAmount = amount;
    this.place = place;
  }  
  
  /**
   * 
   * Returns the type of this receipt, either business or personal.
   * 
   * @return the type of the receipt.
   */ 
  public Type getType() {
    return this.type;
  }
  
  /**
   * 
   * Returns the total amount this receipt is for.
   *
   * @return the total amount of this receipt.
   * 
   */
  public double getTotalAmount() {
    return this.totalAmount;
  }
  
  /**
   * 
   * Returns the place this receipt is from.
   * 
   * @return the place the receipt was issued.
   */
  public String getPlace() {
    return place;
  }
  
  /**
   * 
   * Returns a string representing the receipt of the form:
   *    <place>: $<amount> <PERSONAL|BUSINESS>
   * 
   * @return the representing string.
   */
  public String toString() {
    return place + ": $" + totalAmount + " " + type;
  }

}