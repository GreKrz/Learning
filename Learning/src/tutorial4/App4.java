package tutorial4;

public class App4 {
	public static void main(String[] args) {
		
		int value = 0;
		
		int value2 = 10;
		
		//boolean loop = value < 20;
		
		//System.out.println(loop);
		
		while(value < 10) {
			System.out.println("Hello " + value);
			
			value = value + 1;
		}
		
//		int i;
		
		for(int i = 0;i < 10;i++) {
			System.out.println("Wypisz" + value);  // tutaj value juz ma wartosc 10 bo sie wykonala petla wyzej
			value = value + 1;
		}
		
		while(value2 > 0) {
			System.out.println("Hello " + value2);
			
			value2 = value2 - 1;
		}
	}
}
