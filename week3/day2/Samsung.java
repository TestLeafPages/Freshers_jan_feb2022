package week3.day2;

public class Samsung implements AndroidDesign,SamsungDesign{

	@Override
	public void startPhone() {
		System.out.println("smart phone");
		
	}

	@Override
	public void makeCall() {
		System.out.println("Make call");
		
	}

	@Override
	public void sendSms() {
	System.out.println("Send sms");
		
	}
	@Override
	public void watsappMessage() {
		System.out.println("watsappMessage");
		
	}
	public void createNode() {
		System.out.println("Create node");
	}
public static void main(String[] args) {
	Samsung sam =new Samsung();
	sam.startPhone();
	sam.sendSms();
	sam.makeCall();
	sam.watsappMessage();
	sam.createNode();
}


	

	
		
	}

	

	

