package tutorial_13;

class Person {
	
	//Instance variables (data or "state")
	String name;
	int age;
	
	
	// Classes can contain
	
	// 1. Data
	// 2. Subroutines (methods)
	
	
}

class Requirements {
	
	String data;
	int dataNumbers;
}

public class App13 {

	public static void main(String[] args) {
		//System.out.println("Hello");
		//System.out.println("there");
		
		Person person1 = new Person();
		
		person1.name = "Joe Bloggs";
		person1.age = 37;
		
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		
		System.out.println(person1.name);
	
		Person person3 = new Person();
		person3.name = "Marcin S.";
		person3.age = 28;
		
		Requirements wymagania = new Requirements();
		wymagania.data = "wiecej wymagan";
		wymagania.dataNumbers = 2;
		
		if(person3.name == "Marcin S.") {
			for( int i=3;i>2;i++) {
			wymagania.dataNumbers++;
			System.out.println(wymagania.data);
			System.out.println(wymagania.dataNumbers);
			}
		}
		System.out.println(wymagania.dataNumbers);
		
	}

}
