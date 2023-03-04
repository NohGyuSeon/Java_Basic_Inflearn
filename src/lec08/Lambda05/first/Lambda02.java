package lec08.Lambda05.first;

public class Lambda02 {
	
	public static void main(String[] args) {
		
		Message message = (msg) -> {
			System.out.println("Hello, world!");
		};
		
		NoParamMessage noParamMessage = () -> {
			System.out.println("There is no try.");
		};
		
		message.showMsg("Nicely done.");
		noParamMessage.showMsg();
	}
	
	interface Message {
		void showMsg(String msg);
	}
	
	interface NoParamMessage {
		void showMsg();
	}
	
}
