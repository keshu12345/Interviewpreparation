package Com.OOP.Adapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallarDuck duck = new MallarDuck();
		WildTurkey turkey = new WildTurkey();

		Duck turkeyAdapter =new TurkeyAdapter(turkey);
		testDuck(turkeyAdapter);
		testDuck(duck);

	}

	private static void testDuck(Duck duck) {

		duck.fly();
		duck.quack();

	}

}
