package Enums;

enum flavour{
	CHOCOLATE, VANILLA, STRAWBERRY;
}

public class Iceream {

	public static void main(String[] args) {

		System.out.println("===== Whats your Fav icecream Flavour =======");
		
		flavour f = flavour.CHOCOLATE;
		
		switch(f) {
		case CHOCOLATE:
			System.out.println("i love chocolate");
			break;
			
		case VANILLA:
			System.out.println("i love vanilla");
			break;
			
			
		case STRAWBERRY:
			System.out.println("i love strawberry");
			break;
		}

	}

}
