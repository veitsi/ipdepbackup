package lab02;

import static org.junit.Assert.*;

import org.junit.Test;

public class RequestTest {

	@Test
	public void testIntegrated() {
		Request r1 = new Request(20,1);
		System.out.println(r1.getDescription());
	}
	@Test
	public void testSmokeRequest(){
		Request r1 = new Request(20,1);
	}
	@Test
	public void testNegRequest(){
		Request r1 = new Request(-1,1);
	}

}
