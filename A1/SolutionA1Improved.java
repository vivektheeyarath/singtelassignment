
interface Animaly {
	
	public String walk();
	public String sing();
	
}

interface FlyingAnimal {
	
	public String fly();
		
}

class Birdy implements Animaly, FlyingAnimal {

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

public class SolutionA1Improved {
	
	public static void main(String...args) {
		
		FlyingAnimal flyingAnimal = new Birdy();
		
		System.out.println(flyingAnimal.fly());
		
		Animaly animal = (Animaly) flyingAnimal;
		
		System.out.println(animal.walk());
		System.out.println(animal.sing());
	}
	
}
