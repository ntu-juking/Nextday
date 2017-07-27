import static org.junit.Assert.*;

import org.junit.Test;


public class YearTest {

	@Test
	public void testIncrement() {
		
		Year y1 = new Year(2014);
		assertEquals(true, y1.increment());
		
		y1.setCurrentPos(0);
		assertEquals(true, y1.increment());
		assertEquals(1, y1.getYear());
		
		assertEquals(true, y1.increment());
		assertEquals(2, y1.getYear());
		
		y1.setCurrentPos(-23);
		assertEquals(true, y1.increment());
		assertEquals(-22, y1.getYear());
		
		//测试 -1 + 1 后
		y1.setCurrentPos(-1);
		assertEquals(true, y1.increment());
		assertEquals(0, y1.getYear());
		
		//测试为false
		assertEquals(false, y1.increment());
	}

	@Test
	public void testIsValid() {
		
		Year t = new Year(1);
		t.setCurrentPos(0);
		assertEquals(false, t.isValid());
		
		t.setCurrentPos(2014);
		assertEquals(true, t.isValid());
		
		t.setCurrentPos(-2);
		assertEquals(true, t.isValid());
	}

	@Test
	public void testYear() {
	}

	@Test
	public void testSetYear() {
		
		Year y = new Year(2);
		y.setYear(2014);
		y.setYear(0);
		y.setYear(-23);
		
	}

	@Test
	public void testGetYear() {
	}

	@Test
	public void testIsLeap() {
		//正年
		Year d1 = new Year(2000);
		Year d2 = new Year(2004);
		Year d3 = new Year(2100);
		Year d4 = new Year(2008);
		Year d5 = new Year(2010);
		
		//负年
		Year d6 = new Year(-2000);       //能被400， false
		Year d7 = new Year(-2004);       //能被4,false
		Year d8 = new Year(-2008);       
		Year d9 = new Year(-2100);       //false
		Year d10 = new Year(-2010);      //
		Year d11 = new Year(-2013);
		Year d12 = new Year(-1);
		Year d13 = new Year(-2001);      //true
		Year d14 = new Year(-5);
		
		//正数
		Year d15 = new Year(1900);     //false
		
		Year d16 = new Year(172800);   //true
		Year d17 = new Year(86400);    //true
		
		//负数
		Year d18 = new Year(-9);   //true
		Year d19 = new Year(-401); //true
		Year d20 = new Year(-801); //true
		
		Year d21 = new Year(864001);  //false
		
		
		assertEquals(true, d1.isLeap());
		assertEquals(true, d2.isLeap());
		assertEquals(true, d4.isLeap());
		assertEquals(false, d3.isLeap());
		assertEquals(false, d5.isLeap());
		
		assertEquals(false, d6.isLeap());
		assertEquals(false, d7.isLeap());
		assertEquals(false, d8.isLeap());
		assertEquals(false, d9.isLeap());
		assertEquals(false, d10.isLeap());
		
		assertEquals(true, d11.isLeap());
		assertEquals(true, d12.isLeap());
		assertEquals(true, d13.isLeap());
		assertEquals(true, d14.isLeap());
	
		assertEquals(false, d15.isLeap());
		
		assertEquals(true, d16.isLeap());
		assertEquals(true, d17.isLeap());
		
		assertEquals(true, d18.isLeap());
		assertEquals(true, d19.isLeap());
		assertEquals(true, d20.isLeap());
		
		assertEquals(false, d21.isLeap());
		
		Year t = new Year(1);
		for (int cur = 1; cur < 10000; cur++) {
			if (cur >= 0
					&& (((cur % 4 == 0) && (cur % 100 != 0)) || (cur % 400 == 0))) {
				t.setCurrentPos(cur);
				assertEquals(true, t.isLeap());
			} else {
				t.setCurrentPos(cur);
				assertEquals(false, t.isLeap());
			}
		}
		
		for (int cur = -1; cur > -10000; cur--) {
			if (cur < 0
					&& ((((cur * -1) % 4 == 1) && ((cur * -1) % 100 != 1)) || ((cur * -1) % 400 == 1))) {
				t.setCurrentPos(cur);
				assertEquals(true, t.isLeap());
			} else {
				t.setCurrentPos(cur);
				assertEquals(false, t.isLeap());
			}
		}
		
		t.setCurrentPos(0);
		assertEquals(true, t.isLeap());
		
		
//		t.setCurrentPos(0);
//		assertEquals(false, t.isLeap());
		
	}

	@Test
	public void testEqualsObject() {
		
		Year y1 = new Year(2004);
		Year y2 = new Year(2004);
		assertEquals(true, y1.equals(y2));
		assertEquals(false, y1.equals(23));
		
	}

}









