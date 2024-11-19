package Pageobjects;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {

	@Test
	public void test()
	{
		System.out.println("Test");
	}
	@BeforeMethod 
	public void Beforemethod()
	{
		System.out.println("Beforemethod");
	}
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("Aftermethod");
	}
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Beforeclass");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("Afterclass");
	}
	@BeforeSuite
	public void Beforesuite()
	{
		System.out.println("Beforesuite");
	}
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println("Aftersuite");
	}
}
