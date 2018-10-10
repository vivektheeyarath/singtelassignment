import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class SolutionA1ImprovedTest {

	@Test
	public void testAnimal() {
		Animaly animal = new Birdy();
		
		Assert.assertEquals("I am walking", animal.walk());
		Assert.assertEquals("I am singing", animal.sing());
	}
	
	@Test
	public void testBird() {
		FlyingAnimal flyAnimal = new Birdy();
		
		Assert.assertEquals("I am flying",flyAnimal.fly());

	}

}
