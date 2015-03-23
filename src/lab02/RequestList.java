package lab02;

import java.util.List;
import java.util.LinkedList;

public class RequestList {
	public LinkedList<Request> lst=new LinkedList<Request>();
	
	public boolean add(Request r){
		if (r.hostNum<2 || r.hostNum>1023) return false;
		lst.add(r);
		return true;
	}
	public boolean add(int h, int d){
		lst.add(new Request(h,d));
		return true;
	}
	public int acceptedRequests(){
		int c=0;
		int l=lst.size();
		for (int i=0;i<l;i++) if (lst.get(i).hostNum>0) c++;
		return c;		
	}
	
	public void sort(){
		
	}

}