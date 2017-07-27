import static org.junit.Assert.*;

import org.junit.Test;


public class DayTest {

	@Test
	public void testIncrement() {
	}

	@Test
	public void testIsValid() {
//		if (m != null && m.isValid())
//			if (this.currentPos >= 1 && this.currentPos <= m.getMonthSize())
//				return true;
//		return false;
		//is  vaild
		Month m = new Month(1, new Year(2013));
		Day d1 = new Day(1, m);
		d1.setCurrentPos(31);
		assertEquals(true, d1.isValid());
		
		//day31 is invaild
		Month m2 = new Month(1, new Year(2013));
		Day d2 = new Day(1, m2);
		d2.setCurrentPos(32);
		assertEquals(false, d2.isValid());

		//day29 is vaild
		Month m3 = new Month(2, new Year(2004));
		Day d3 = new Day(1, m3);
		d3.setCurrentPos(29);
		assertEquals(true, d3.isValid());
		
		//day29 is vaild
		Month m4 = new Month(2, new Year(2005));
		Day d4 = new Day(1, m4);
		d4.setCurrentPos(29);
		assertEquals(false, d4.isValid());
	
		Month m41 = new Month(2, new Year(2005));
		Day d41 = new Day(1, m41);
		d41.setCurrentPos(28);
		assertEquals(true, d41.isValid());
		
		Month m42 = new Month(3, new Year(2005));
		Day d42 = new Day(1, m42);
		d42.setCurrentPos(32);
		assertEquals(false, d42.isValid());
		
		Month m43 = new Month(3, new Year(2005));
		Day d43 = new Day(1, m43);
		d43.setCurrentPos(32);
		assertEquals(true, d43.isValid());
		
		//day30 is vaild
		Month m5 = new Month(4, new Year(2013));
		Day d5 = new Day(1, m5);
		d5.setCurrentPos(30);
		assertEquals(true, d5.isValid());
		
		
		
		//day30 is invaild
		Month m6 = new Month(4, new Year(2013));
		Day d6 = new Day(1, m6);
		d6.setCurrentPos(31);
		assertEquals(false, d6.isValid());
		
		//day is invaild
		Month m9 = new Month(1, new Year(2013));
		Day d9 = new Day(1, m9);
		d9.setCurrentPos(-2);
		assertEquals(false, d9.isValid());
		
		// day28 is invaild
		Month m10 = new Month(2, new Year(2100));
		Day d10 = new Day(1, m10);
		d10.setCurrentPos(29);
		assertEquals(false, d10.isValid());
		
		// day28 is vaild
		Month m11 = new Month(2, new Year(2100));
		Day d11 = new Day(1, m10);
		d11.setCurrentPos(28);
		assertEquals(true, d11.isValid());
		
		
		
		//month is invaild
		Month m7 = new Month(4, new Year(2013));
		m7.setCurrentPos(13);
		Day d7 = new Day(1, m7);
		assertEquals(false, d7.isValid());
//		assertEquals(false, m7.isValid());
		
		//month is invaild
		Month m72 = new Month(4, new Year(2013));
		m72.setCurrentPos(-1);
		Day d72 = new Day(1, m72);
		assertEquals(false, d72.isValid());
//		assertEquals(false, m72.isValid());
		
		Month m73 = new Month(4, new Year(2013));
		m73.setCurrentPos(0);
		Day d73 = new Day(1, m73);
		assertEquals(false, d73.isValid());
//		assertEquals(false, m73.isValid());
		
		
		//year is invaild
		Year y1 = new Year(2);
		y1.setCurrentPos(0);
		Month m8 = new Month(4, y1);
		Day d8 = new Day(1, m8);
		assertEquals(false, d8.isValid());
//		assertEquals(false, y1.isValid());
		
		Month m12 = null;
		Day dd9 = new Day(1, m12);
		assertEquals(false, dd9.isValid());
//		assertEquals(false, m12 instanceof Object);
		
		Year y12 = null;
//		assertEquals(false, y12 instanceof Object);
		Day dd10 = new Day(1, new Month(1, y12));
		assertEquals(false, dd10.isValid());
	}

	@Test
	public void testDay() {
	}

	@Test
	public void testSetDay() {
		
		Day d = new Day(21, new Month(2, new Year(2013)));
		d.setDay(31, new Month(1, new Year(2013)));
		d.setDay(29, new Month(2, new Year(2003)));
		d.setDay(31, new Month(4, new Year(2003)));
	}

	@Test
	public void testGetDay() {
	}

	@Test
	public void testEqualsObject() {
		
		Day d1 = new Day(2, new Month(1, new Year(2014)));
		Day d2 = new Day(3, new Month(1, new Year(2014)));
		Day d3 = new Day(2, new Month(3, new Year(2014)));
		Day d4 = new Day(2, new Month(1, new Year(2015)));
		Day d5 = new Day(2, new Month(1, new Year(2014)));
		
		assertEquals(false, d1.equals(d2));
		assertEquals(false, d1.equals(d3));
		assertEquals(false, d1.equals(d4));
		assertEquals(false, d1.equals(2014));
		assertEquals(true, d1.equals(d5));
		
	}

}
