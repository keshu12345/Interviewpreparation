package SRP_VAOILATING;

public class Bird {
	
	
	public static void main(String args[]) {
		Bird bird=new Bird();
		bird.fly("parrot");
		bird.fly("swan");
		bird.fly("owl");
	}
  // fly method have multiple responsibilities parrot object , owl object,swan object this violating  rule of SRP
  // then how can be achieve the SRP ,create entity,object ,method,project,microservice that only represent only only single behavior
	private void fly(String birdType) {
		if(birdType=="parrot") {
			System.out.println("Parrot can be fly for short distance wth 150km/h");	
		}else if(birdType=="owl") {
			System.out.println("Owl can be fly in night wth 200km/h");
		}else if(birdType=="swan") {
			System.out.println("swan can be fly for long distance wth 500km/h");
		}
		
	}

}
