package lab9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFizzBuzz {

	Main m = new Main();
	
	String i1 = m.getInt(1);
	String i2 = m.getInt(2);
	String i3 = m.getInt(3);
	String i4 = m.getInt(4);
	
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
}
