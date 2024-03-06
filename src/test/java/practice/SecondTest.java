package practice;

import org.testng.annotations.Test;

public class SecondTest {
	@Test
	public void firstTest()
	{
		System.out.println("---- TS-2 ----");
	}
	
	@Test(groups = "smoke")
	public void first1Test()
	{
		System.out.println("---- TS-22 ----");
	}
}
