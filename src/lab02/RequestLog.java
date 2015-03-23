package lab02;
import java.util.LinkedList;

public class RequestLog extends LinkedList<Request>{
	private static final long serialVersionUID = 1L;
	
	public int acceptedRequests(){
		int c=0;
		int l=this.size();
		for (int i=0;i<l;i++) if (this.get(i).hostNum>0) c++;
		return c;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
