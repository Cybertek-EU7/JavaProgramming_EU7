package week6;

public class A01_ArraysFundementals {

	public static void main(String[] args) {
/*
 * Until so far we were single data or variables
 * 
 * 		
 */
		
int count = 10;
String city = "New York";
String city2 = 	"Ankara";
String city3 = "London";
//declare and specify the size, then assign values.
// This way is good to use when we know the count of items, but we do not know the values yet.
String [] cities = new String [3];
cities[0]="New York";
cities[1]="Ankara";
cities[2]="London";

// Declare and assign value in the same statement. This is good when we already have data to assign to 
// our array.      first one: 0       1      2
String[] citiesMore = { "Istanbul","Baku","Berlin"};
// third way
String[] citiesEvenMore = new String[] {"Izmir","Amsterdam","Venice"};

// to find out how many elements in the array we length method
System.out.println("The size of citiesMore : "+ citiesMore.length);

System.out.println("If you want to reach first element of citiesMore : "+ citiesMore[0]);
																	// the index : 2 	
System.out.println("if you want the last element : " + citiesMore[citiesMore.length-1]);
		
		
		
		
	}
	
	
}
