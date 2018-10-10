import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class SolutionDTest {

	@Test
	public void testDuckSwim() {
		SwimmingAnimal duck = new Duck();
		
		Assert.assertEquals("I am swimming", duck.swim());
	}
	
	@Test
	public void testDuckSing() {
		LandAnimal duck = new Duck();
		
		Assert.assertEquals("Quack, Quack", duck.sing());
		Assert.assertEquals("I am walking", duck.walk());
	}
	
	@Test
	public void testChicken() {
		LandAnimal chicken = new Chicken(false);
		
		Assert.assertEquals("Cluck, Cluck", chicken.sing());
		Assert.assertEquals("I am walking", chicken.walk());
	}

	@Test
	public void testChickenFlying() {
		FlyingAnimal chicken = new Chicken(false);
		
		Assert.assertEquals("Wings clipped", chicken.fly());
	}
	
	@Test
	public void testRooster() {
		Rooster rooster = new Rooster();
		
		Assert.assertEquals("Cock-a-doodle-do", rooster.sing());
	}
	
	@Test
	public void testParrots() {
		Parrot parrot = new Parrot(new Dog());
		Assert.assertEquals("Woof, woof", parrot.sing());
		
		parrot = new Parrot(new Cat());
		Assert.assertEquals("Meow", parrot.sing());
		
		parrot = new Parrot(new Rooster());
		Assert.assertEquals("Cock-a-doodle-do", parrot.sing());
		
		parrot = new Parrot(new Duck());
		Assert.assertEquals("Quack, Quack", parrot.sing());
	}
	
	@Test
	public void testShark() {
		Fish fish = new Shark();
		
		Assert.assertEquals("Fish Swim",fish.swim());
		Assert.assertEquals(COLOR.GREY,fish.getColor());
		Assert.assertEquals(SIZE.LARGE,fish.getSize());
		
		Shark shark = (Shark)fish;
		
		Assert.assertEquals("Fish Swim",shark.swim());
		Assert.assertEquals("Other Fish",shark.eat());
	}

	@Test
	public void testClownFish() {
		Fish fish = new ClownFish();
		
		Assert.assertEquals("Fish Swim",fish.swim());
		Assert.assertEquals(COLOR.ORANGE,fish.getColor());
		Assert.assertEquals(SIZE.SMALL,fish.getSize());
		
		ClownFish clownFish = (ClownFish)fish;
		
		Assert.assertEquals("Fish Swim",clownFish.swim());
		Assert.assertEquals("joke",clownFish.joke());
	}
	
	@Test
	public void testDolphin() {
		SwimmingAnimal dolphin = new Dolphin();
		Assert.assertEquals("swim",dolphin.swim());
	}
	
}
