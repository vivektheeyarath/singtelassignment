import java.util.Arrays;


interface Animal {
	
}

interface LandAnimal extends Animal{
	
	public String walk();
	public String sing();
	
}

interface FlyingAnimal extends LandAnimal {
	
	public String fly();
		
}

interface SwimmingAnimal extends Animal{
	
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
	
	public Chicken(boolean isMale) {
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

class Rooster implements LandAnimal {

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

class Mammals implements LandAnimal {

	@Override
	public String walk() {
		return "I am walking";
	}

	@Override
	public String sing() {
		return "Brrr";
	}
	
	
}

class Cat extends Mammals {

	@Override
	public String sing() {
		return "Meow";
	}
	
}

class Dog extends Mammals {

	@Override
	public String sing() {
		return "Woof, woof";
	}
	
}

class Parrot extends Birdy {
	
	private LandAnimal livingWithOrNear = null;
	
	public Parrot(LandAnimal livingWithOrNear) {
		this.livingWithOrNear = livingWithOrNear;
	}
	
	@Override
	public String sing() {
		return this.livingWithOrNear.sing();
	}
}

enum SIZE {LARGE,SMALL};
enum COLOR {GREY, ORANGE};
abstract class Fish implements SwimmingAnimal {

	private SIZE size;
	private COLOR color;
	
	protected Fish(SIZE size, COLOR color) {
		this.size = size;
		this.color = color;
	}
	
	@Override
	public String swim() {
		return "Fish Swim";
	}
	
	public SIZE getSize() {
		return this.size;
	}
	
	public COLOR getColor() {
		return this.color;
	}
}

class Shark extends Fish {
	
	public Shark() {
		super(SIZE.LARGE,COLOR.GREY);
	}
	
	public String eat() {
		return "Other Fish";
	}
	
}

class ClownFish extends Fish {
	
	public ClownFish() {
		super(SIZE.SMALL,COLOR.ORANGE);
	}
			
	public String joke() {
		return "joke";
	}
}

class Dolphin implements SwimmingAnimal {

	@Override
	public String swim() {
		return "swim";
	}
	
}

public class SolutionD {
	
	public static void main(String...args) {
	}
	
}
