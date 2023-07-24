package Com.OOP.Decorator;

public class Mocha extends BeverageDecorator{
	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}
	public double cost() {
		return 10.00+beverage.cost();
	}

}
