package Com.OOP.Adapter;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("Gobble gobble");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I'm flying short distance");
		
	}
  
}
