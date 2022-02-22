package week3.day2;

public class Mobile {

	public void makeCall() {
		System.out.println("make call");
	}
	private void videoCall() {
		System.out.println("Video call");
	}
	  void sendmessage() {
		System.out.println("send Message");
	}
	protected void watsAppMessage() {
		System.out.println("watsApp  message");
		
	}
	public static void main(String[] args) {
		Mobile mob =new Mobile();
		mob.makeCall();
		mob.videoCall();
		mob.sendmessage();
		mob.watsAppMessage();
	}
}
