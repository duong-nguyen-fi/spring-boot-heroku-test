package myapp;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class MyApplicationTest {
	
	@Test
	public void testJSON(){
		assertEquals("{\"id\":123}", new MyController().test("name"));
	}
}
