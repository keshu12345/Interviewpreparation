package Com.OOP.Decorator;

public class Client {

	public static void main(String[] args) {

		Beverage beverage = new Expresso();
		System.out.println(beverage.cost());

		Beverage mochaWithExpresso = new Mocha(beverage);

		System.out.println("Expresso With Mocha--->"+mochaWithExpresso.cost());
		Beverage houseBlend=new HouseBlend();
		Beverage mochaWithHouseBlend = new Mocha(houseBlend);

		System.out.println("HouseBlend With Mocha--->"+mochaWithHouseBlend.cost());
		
	}

}
