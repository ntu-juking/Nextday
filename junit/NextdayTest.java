import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class)
public class NextdayTest {

	private Date expected;
	
	private Date value;
	
	@Parameters
	public static Collection<Object[]> getTestParameters() {
		
		//有效等价类
		Date d1 = new Date(5, 14, 2014);
		Date d2 = new Date(5, 13, 2014);
		
		//为负日期
//		Date d3 = new Date(5, 0, 2014);
//		Date d4 = new Date(5, -1, 2014);
		
		//为零日期
//		Date d5 = new Date(5, 1, 2014);
//		Date d6 = new Date(5, 0, 2014);
		
		//31号
		Date d7 = new Date(8, 31, 2015);
		Date d8 = new Date(8, 30, 2015);
		
		Date d9 = new Date(7, 31, 2014);
		Date d10 = new Date(7, 30, 2014);
		
		Date d11 = new Date(7, 1, 2013);
		Date d12 = new Date(6, 30, 2013);
		
		//闰年
		Date d13 = new Date(3, 1, 2004);  
		Date d14 = new Date(2, 29, 2004);
		
		Date d15 = new Date(2, 29, 2004);
		Date d16 = new Date(2, 28, 2004);
		
		//400年是闰年
		Date d17 = new Date(3, 1, 2000);
		Date d18 = new Date(2, 29, 2000);
		
		Date d19 = new Date(3, 1, 2013);
		Date d20 = new Date(2, 28, 2013);
		
		//被4整除，不被100整除 
		Date d23 = new Date(3, 1, 2100);
		Date d24 = new Date(2, 28, 2100);
		
		//到第二年
		Date d21 = new Date(1, 1, 2014);
		Date d22 = new Date(12, 31, 2013);
		
		//下一个月
		Date d25 = new Date(1, 31, 2013);
		Date d26 = new Date(1, 30, 2013);
		
		Date d27 = new Date(2, 1, 2013);
		Date d28 = new Date(1, 31, 2013);
		
		Date d29 = new Date(4, 1, 2014);
		Date d30 = new Date(3, 31, 2014);
		
		Date d31 = new Date(5, 1, 2014);
		Date d32 = new Date(4, 30, 2014);

		Date d33 = new Date(6, 1, 2014);
		Date d34 = new Date(5, 31, 2014);

		Date d35 = new Date(7, 1, 2014);
		Date d36 = new Date(6, 30, 2014);
		
		
		
		Object[][] date = new Object[][] {
				{d1, d2},
				{d7, d8},
				{d9, d10},
				{d11, d12},
				{d13, d14},
				{d15, d16},
				{d17, d18},
				{d19, d20},
				{d21, d22},
				{d23, d24},
				{d25, d26},
				{d27, d28},
				{d29, d30},
				{d31, d32},
				{d33, d34},
				{d35, d36},
//				{d3, d4},
//				{d5, d6}
		};
		return Arrays.asList(date);
			
	}	
	
	
	public NextdayTest(Date expected, Date value) {
		super();
		this.expected = expected;
		this.value = value;
	}

	@Test
	public void testNextDay() {
		
		assertEquals(expected, Nextday.nextDay(value));
		
	}

}







