package tutorial_11;

public class App11 {

	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		for(String fruit: fruits) {			//ciekawy sposob na wypisanie w petli calej tablicy fruits
			System.out.println(fruit);
		}
		
		int value = 0; //int jest typem prymitywnym
		
		String text = null;	//string jest klasa, tutaj nie wiadomo ile miejsca potrzeba w pamieci, wiec to tylko jest referencja default value = null
		
		System.out.println(text);
		
		String[] texts = new String[2]; //referencja do tablicy referencji
		
		System.out.println(texts[0]);
		
		texts[0] = "one";
		
		
	}

}
