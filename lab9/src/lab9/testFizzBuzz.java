package lab9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFizzBuzz {

	Main m = new Main();
	
	String i1 = m.getInt(1);
	String i2 = m.getInt(2);
	
	@Test
	void intput_1_output_1() {
		assertEquals( "1", i1);	
	}
	@Test
	void intput_2_output_2() {
		assertEquals( "2", i2);	
	}
}
