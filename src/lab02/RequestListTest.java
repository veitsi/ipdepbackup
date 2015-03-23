package lab02;

import static org.junit.Assert.*;

import org.junit.Test;

public class RequestListTest {

	@Test
	public void testAddIntInt() {
		RequestList rl = new RequestList();
		rl.add(20,1);
		rl.add(-7,4);
		rl.add(15,1);
		rl.add(40,1);
		rl.add(0,1);
		
		System.out.println("normal requests "+rl.acceptedRequests());
		System.out.println("elements in list "+rl.lst.size());
	}

}
