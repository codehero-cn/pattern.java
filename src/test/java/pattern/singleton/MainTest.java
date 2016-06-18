package pattern.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
	@Test
	public  void test1() {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		
		System.out.println(s1 + "    " + s2);
		assertEquals(s1,s2);
	}
	
	@Test
	public  void test2() {
		Singleton2 s1 = Singleton2.getInstance();
		Singleton2 s2 = Singleton2.getInstance();
		
		System.out.println(s1 + "    " + s2);
		assertEquals(s1,s2);
	}
	
	@Test
	public void test4() {
		Singleton4 s1 = Singleton4.getInstance();
		Singleton4 s2 = Singleton4.getInstance();
		System.out.println(s1 + "    " + s2);

	}
}
