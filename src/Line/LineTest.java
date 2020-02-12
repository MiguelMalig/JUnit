package Line;

import static org.junit.Assert.*;

import org.junit.Test;

public class LineTest {

	@Test
	public void testConstructorAccessors() {
		Line line = new Line(1.0,2.1,3.2,4.3);
		assertEquals(1.0, line.getX1(),0);
		assertEquals(2.1, line.getY1(),0);
		assertEquals(3.2, line.getX2(),0);
		assertEquals(4.3, line.getY2(),0);	
	}
	
	@Test
	public void testMoveC1() {
		Line line = new Line(1,2,3,4);
		assertEquals(1, line.getX1(),0);
		assertEquals(2, line.getY1(),0);
		assertEquals(3, line.getX2(),0);
		assertEquals(4, line.getY2(),0);
		line.moveC1(5,6);
		assertEquals(5, line.getX1(),0);
		assertEquals(6, line.getY1(),0);
		assertEquals(3, line.getX2(),0);
		assertEquals(4, line.getY2(),0);
	}
	
	@Test
	public void testMoveC2() {
		Line line = new Line(1,2,3,4);
		assertEquals(1, line.getX1(),0);
		assertEquals(2, line.getY1(),0);
		assertEquals(3, line.getX2(),0);
		assertEquals(4, line.getY2(),0);
		line.moveC2(5,6);
		assertEquals(1, line.getX1(),0);
		assertEquals(2, line.getY1(),0);
		assertEquals(5, line.getX2(),0);
		assertEquals(6, line.getY2(),0);
	}
	
	@Test
	public void testLineLength() {
		Line line = new Line(0,0,3,1);
		assertEquals(Math.sqrt(1+1), line.length(),0.0001);
	}
	

}
