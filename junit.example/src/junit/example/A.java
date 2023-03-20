package junit.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class A {
	@Test
   public void test1() {
	   System.out.println("from test1");
	   
	}
	   
	   @Test
	   public void test2() {
		   System.out.println("from test2");
	   
   }   
	   @Before
	   public void beforetest() {
		   System.out.println("Before test");
	   }
	   
	   @After
	   public void aftertest() {
		   System.out.println("After test");
	   }
	   
	   @BeforeClass
	   public static void beforeclass() {
		   System.out.println("before class");
	   }
	   
	   @AfterClass
	   public static void afterclass() {
		   System.out.println("after class");
	   }

}
