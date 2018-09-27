package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import kr.itedu.ex10.*;


class CalcTest {

	@Test
	void test() {
		assertEquals(3, Calc.sum(1,2));
	}
	
	@Test
	void test1() {
		assertEquals(4, Calc.sum(1,3));
	}
	
	@Test
	void test2() {
		assertEquals(5, Calc.sum(3,2));
	}
	
	@Test
	void test3() {
		assertEquals(6, Calc.sum(4,2));
	}
	
	@Test
	void test4() {
		assertEquals(7, Calc.sum(4,3));
	}
	
	@Test
	void test5() {
		assertEquals(8, Calc.sum(5,3));
	}

}
