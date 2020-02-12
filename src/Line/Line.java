package Line;

/**
 * New Line class, with two (x,y) double coordinates
 */
public class Line {
  //The coordinates of line (x1,y1) to (x2,y2)
  private double x1,y1,x2,y2;
  
  /**
   * Constructor of Line
   */
  public Line(double x1, double y1, double x2, double y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    
  }
  
  /**
   * Get x of first coordinate
   */
   
  public double getX1(){
    return x1;
  }
  
  /**
   * Get x of second coordinate
   */
  public double getX2(){
    return x2;
  }
  
  /**
   * Get y of first coordinate
   */
  public double getY1(){
    return y1;
  }
  
  /**
   * Get y of second coordinate
   */
  public double getY2(){
    return y2;
  }
  
  /**
   * Move coordinate 1 
   */
  public void moveC1(double x1, double y1){
    this.x1 = x1;
    this.y1 = y1;
  }
  
  /**
   * Move coordinate 2 
   */
  public void moveC2(double x2, double y2){
    this.x2 = x2;
    this.y2 = y2;
  }
  
  /**
   * Get Euclidean distance (length) of line
   */
  public double length(){
    return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,5));
  }

}
