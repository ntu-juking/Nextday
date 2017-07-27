package Nextday_SE15.Nextday;

import static org.junit.Assert.*;

import org.junit.Test;


public class MonthTest {

	@Test
	public void testIncrement() {
		
		Month m1 = new Month(12, new Year(2014));
		assertEquals(false, m1.increment());
		
		Month m2 = new Month(11, new Year(2014));
		assertEquals(true, m2.increment());
		
	}

	@Test
	public void testIsValid() {
		
		//month is vaild
		Month m1 = new Month(2, new Year(2013));
		assertEquals(true, m1.isValid());
		
		//month is invaild
		Month m7 = new Month(4, new Year(2013));
		m7.setCurrentPos(13);
		assertEquals(false, m7.isValid());

		//month is invaild
		Month m72 = new Month(4, new Year(2013));
		m72.setCurrentPos(-1);
		assertEquals(false, m72.isValid());

		//year is invaild
		Year y1 = new Year(2);
		y1.setCurrentPos(0);
		assertEquals(false, y1.isValid());
//		Month m10 = new Month(2, y1);
//		assertEquals(false, m10.isValid());

		Year y12 = null;
		assertEquals(false, y12 instanceof Object);

	}

	@Test
	public void testMonth() {
	}

	@Test
	public void testSetMonth() {
		
		Month mon = new Month(2, new Year(2014));
		mon.setMonth(2, new Year(2014));
		mon.setMonth(13, new Year(2014));
		mon.setMonth(-2, new Year(2014));
		mon.setMonth(23, new Year(0));
		
	}

	@Test
	public void testGetMonth() {
	}

	@Test
	public void testGetMonthSize() {
	}

	@Test
	public void testEqualsObject() {
		
		Month m1 = new Month(1, new Year(2013));
		Month m2 = new Month(1, new Year(2013));
		Month m3 = new Month(2, new Year(2013));
		Month m4 = new Month(1, new Year(2014));
		Month m5 = new Month(2, new Year(2015));
		
		assertEquals(true, m1.equals(m2));
		assertEquals(false, m1.equals(m3));
		assertEquals(false, m1.equals(m4));
		assertEquals(false, m1.equals(m5));
		assertEquals(false, m1.equals(10));
		
	}

}
