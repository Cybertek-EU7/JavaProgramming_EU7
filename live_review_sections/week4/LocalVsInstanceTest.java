package week4;

public class LocalVsInstanceTest {

	public static void main(String[] args) {
		
		LocalVsInstance obj = new LocalVsInstance();

		System.out.println(" -----local variable-------");
		obj.showDifference();
		
		System.out.println("------instance variable-------");
		obj.a=10;
		System.out.println(obj.a);
		
	}

}
