package NewGroup.KhushiProjFinal;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	
	@AfterClass
	public void ac()
	{
		System.out.println("After class1");
	}

	@BeforeMethod
	public void BM3()
	{
		System.out.println("Before Method 3");
	}
	
	@AfterMethod
	public void AM1()
	{
		System.out.println("After Method");
	}
	
	@BeforeMethod
	public void BM2()
	{
		System.out.println("Before Method2");
	}
	@Test
	public void t2()
	{
		System.out.println("Test 2");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("Before Class1");
	}
	
	@Test
	public void t1()
	{
		System.out.println("Test 1");
	}
}
