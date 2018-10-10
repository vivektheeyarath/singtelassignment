
interface Animal {
	
	public String walk();
	public String sing();
	
}

interface FlyingAnimal extends Animal{
	
	public String fly();
		
}

interface SwimmingAnimal {
	
	public String swim();
		
}

class Birdy implements FlyingAnimal {

	@Override
	public String fly() {
		return "I am flying";
	}

	@Override
	public String walk() {
		return "I am walking";
	}

	@Override
	public String sing() {
		return "I am singing";
	}
	
}

class Duck extends Birdy implements SwimmingAnimal {

	@Override
	public String swim() {
		return "I am swimming";
	}

	@Override
	public String sing() {
		return "Quack, Quack";
	}
	
}

class Chicken extends Birdy {

	private boolean isMale = false;
	
	protected Chicken(boolean isMale) {
		this.isMale = isMale;
	}
	
	@Override
	public String sing() {
		return "Cluck, Cluck";
	}

	@Override
	public String fly() {
		return "Wings clipped";
	}
	
}

class Rooster implements Animal {

	private Chicken chicken = null;
	
	public Rooster() {
		chicken = new Chicken(true);
	}
	
	@Override
	public String sing() {
		return "Cock-a-doodle-do";
	}

	@Override
	public String walk() {
		return chicken.walk();
	}

}

public class SolutionA3c {
	
	public static void main(String...args) {
		
	}
	
}
