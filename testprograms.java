package casetools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testprograms {

	//@Test
	//void test() {
	//	fail("Not yet implemented");
	//}

		@Test
		void addtest() {
			testjava a = new testjava();
			int expected = 5;
			int actual = a.add(5, 3);
			
			assertEquals(expected, actual);
		}
		@Test
		void subtest() {
			testjava a = new testjava();
			int expected = 1;
			int actual = a.sub(5, 1);
			
			assertEquals(expected, actual);
		}
		@Test
		void multest() {
			testjava a = new testjava();
			int expected = 6;
			int actual = a.mul(5, 3);
			
			assertEquals(expected, actual);
		}
		@Test
		void divtest() {
			testjava a = new testjava();
			int expected = 1;
			int actual = a.div(4, 2);
			
			assertEquals(expected, actual);
		}

	}
