package Nextday_SE15.Nextday;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {

	@Test
	public void testDate() {
	}

	@Test
	public void testIncrement() {
	}

	@Test
	public void testPrintDate() {
		
		new Date(1, 31, 2014).printDate();
		
	}

	@Test
	public void testGetDay() {
		Date d1 = new Date(1, 2, 2014);
		Day day1 = new Day(2, new Month(1, new Year(2014)));
		assertEquals(day1, d1.getDay());
		
	}

	@Test
	public void testGetMonth() {
		Date d1 = new Date(1, 2, 2014);
		Month mon1 = new Month(1, new Year(2014));
		assertEquals(mon1, d1.getMonth());
	}

	@Test
	public void testGetYear() {
		Date d1 = new Date(1, 2, 2014);
		Year year1 = new Year(2014);
		assertEquals(year1, d1.getYear());
	}

	@Test
	public void testEqualsObject() {
		
		Date d1 = new Date(1, 2, 2014);
		Date d2 = new Date(1, 2, 2014);
		Date d3 = new Date(2, 2, 2014);
		Date d4 = new Date(1, 3, 2014);
		Date d5 = new Date(1, 2, 2015);
		Date d6 = new Date(3, 4, 2016);
		
		assertEquals(true, d1.equals(d2));
		assertEquals(false, d1.equals(d3));
		assertEquals(false, d1.equals(d4));
		assertEquals(false, d1.equals(d5));
		assertEquals(false, d1.equals(d6));
		assertEquals(false, d1.equals(2014));
		
	}

	@Test
	public void testToString() {
		
		Date d1 = new Date(1, 2, 2014);
		assertEquals(new String("1/2/2014"), d1.toString());
		
		
	}

}
