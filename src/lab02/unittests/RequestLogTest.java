package lab02.unittests;

import static org.junit.Assert.*;
import lab02.Request;
import lab02.RequestLog;

import org.junit.Test;

public class RequestLogTest {

	@Test
	public void testAddE() {
		RequestLog r = new RequestLog();
		r.add(new Request(14,1));
		r.add(new Request(11,1));
		System.out.println("size of log="+r.size());
		//fail("Not yet implemented");
	}

}
