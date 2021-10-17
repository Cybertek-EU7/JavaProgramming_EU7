package week4;

public class CircleTest {

	public static void main(String[] args) {
		
	//	Syntax:   ClassName objectName = new ClassName();
		
		Circle circle1 = new Circle();
		
		System.out.println(circle1.radius);
		
		circle1.radius = 5.0;
		System.out.println(circle1.area()); // I call the methods with the object name
		System.out.println(circle1.perimeter());
		
		
		
	}

}
