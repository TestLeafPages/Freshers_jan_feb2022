package week3.day1;

public class CallFriend {

	public void dial(int number) {
		System.out.println("dial using number"+"  "+number);
	}
	public void dial(String name) {
		System.out.println("dial using Name"+"   "+name);
	}
	public void dial(int number,String name) {
		System.out.println("dial using number and name");
	}
	public void dial(String name,int number) {
		System.out.println("dial using Name and number");
	}
	public static void main(String[] args) {
		CallFriend call=new CallFriend();
		call.dial(12334654);
		call.dial("sangar");
		call.dial(11232333, "Sangar");
		call.dial("sangar", 123456);
		
		
	}
}
