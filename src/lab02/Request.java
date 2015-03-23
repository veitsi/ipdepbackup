package lab02;

public class Request {
	int hostNum;
	int depId;
	int status;
	
	Request(int h,int d){
		hostNum = h;
		depId = d;
	}
	
	String getDescription(){
		return ""+hostNum+" requested by "+depId;
	}
}
