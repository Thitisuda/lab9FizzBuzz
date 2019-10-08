package lab9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFizzBuzz {

	Main m = new Main();
	
	String i1 = m.getInt(1);
	String i2 = m.getInt(2);
	String i3 = m.getInt(3);
	String i4 = m.getInt(4);
	String i5 = m.getInt(5);
	String i6 = m.getInt(6);
	String i7 = m.getInt(7);
	String i8 = m.getInt(8);
	String i9 = m.getInt(9);
	
	
	@Test
	void intput_1_output_1() {
		assertEquals( "1", i1);	
	}
	
	@Test
	void intput_2_output_2() {
		assertEquals( "2", i2);	
	}
	
	@Test
	void intput_3_output_Fizz() {
		assertEquals( "Fizz", i3);	
	}
	
	@Test
	void intput_4_output_4() {
		assertEquals( "4", i4);	
	}
	
	@Test
	void intput_5_output_Buzz() {
		assertEquals( "Buzz", i5);	
	}
	
	@Test
	void intput_6_output_Fizz() {
		assertEquals( "Fizz", i6);	
	}
	
	@Test
	void intput_7_output_7() {
		assertEquals( "7", i7);	
	}

	@Test
	void intput_8_output_8() {
		assertEquals( "8", i8);	
	}
	
	@Test
	void intput_9_output_Fizz() {
		assertEquals( "Fizz", i9);	
	}
}
