package assignment9;

public class Question11 {

	public static void main(String[] args) {
		String message = "<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
		
		int a = message.indexOf("<");
		int b = message.indexOf(">");
		int blocks = message.indexOf("[");
		int blocke = message.indexOf("]");
		int curly1 = message.indexOf("{");
		int curly2 = message.indexOf("}");
		
		String sender=message.substring(a+1, b);
		String number=message.substring(blocks+1, blocke);
		String body=message.substring(curly1+1, curly2);
		
		System.out.println("Sender: "+sender+"\nPhone Number: "+number+"\nMessage Body: "+body);

	}

}
