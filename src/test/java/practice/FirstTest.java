package practice;

import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void firstTest()
	{
		System.out.println("---- TS-1 ----");
	}
	
	@Test(groups = "smoke")
	public void first1Test()
	{
		System.out.println("---- TS-11 ----");
	}
}
