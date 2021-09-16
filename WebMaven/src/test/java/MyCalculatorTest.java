import static org.junit.Assert.*;

import org.junit.Test;

import com.jenk.MyCalculator;

public class MyCalculatorTest {

	@Test
	public void test1() {
		MyCalculator obj = new MyCalculator();
		assertEquals(10,obj.addNums(5, 5));
	}
	
	@Test
	public void test2() {
		MyCalculator obj2 = new MyCalculator();
		assertEquals(5,obj2.subNums(10, 5));
	}
	
	@Test
	public void test3() {
		MyCalculator obj3 = new MyCalculator();
		assertEquals(25,obj3.multNums(5, 5));
	}
	
	@Test
	public void test4() {
		MyCalculator obj4 = new MyCalculator();
		assertEquals(2,obj4.divNums(10, 5));
	}

}
