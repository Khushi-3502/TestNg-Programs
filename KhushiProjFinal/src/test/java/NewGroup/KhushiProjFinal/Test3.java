package NewGroup.KhushiProjFinal;

import org.testng.annotations.Test;

public class Test3 {
	
	@Test(enabled=false)
	public void a1()
	{
		System.out.println("a1 method");
	}
	@Test(priority=-1)
	public void a3()
	{
		System.out.println("a3 method");
	}
	
	@Test(priority=3,invocationCount=2)
	public void a2()
	{
		System.out.println("a2 method");
	}
	@Test
	public void a4()
	{
		System.out.println("a4 method");
	}

}
