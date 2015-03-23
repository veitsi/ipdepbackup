package lab02.unittests;

import static org.junit.Assert.*;
import lab02.IpAdmin;
import lab02.Request;
import lab02.RequestLog;

import org.junit.Test;

public class IpAdminTest {

	@Test
	public void test() {
		RequestLog r = new RequestLog();
		r.add(new Request(14,1));
		r.add(new Request(11,1));
		r.add(new Request(-5,1));
		r.add(new Request(7,1));
		
		//System.out.println("elements in list "+rLst.lst.size());
		IpAdmin a = new IpAdmin();
		//System.out.println("net adress "+a.AbsAdress);
		System.out.println(a.feed(r, 8));
		//System.out.println(a.adr2ip(1));
		//System.out.println("binar 9="+Integer.toString(9, 2));
	}

}
