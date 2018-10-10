
interface Animal {
	
	public String walk();
	public String sing();
	
}

interface FlyingAnimal {
	
	public String fly();
		
}

interface SwimmingAnimal {
	
	public String swim();
		
}

class Birdy implements Animal, FlyingAnimal {

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

	@Override
	public String sing() {
		return "Cluck, Cluck";
	}

	@Override
	public String fly() {
		return "Wings clipped";
	}
	
}

class Rooster extends Chicken {

	@Override
	public String sing() {
		return "Cock-a-doodle-do";
	}

}

public class SolutionA3 {
	
	public static void main(String...args) {
		
	}
	
}
