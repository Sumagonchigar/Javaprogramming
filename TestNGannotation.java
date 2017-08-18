package com.suma.testngannotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGannotation {
	@Test
	public void testcase1()
	{
		System.out.println("this is testcase1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("this is testcase2");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before every method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after every method");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before every class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after every class");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before every suite");
		
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after every suite");
	}
	@BeforeGroups
	public void beforegroups()
	{
		System.out.println("before every groups");
	}
	@AfterGroups
	public void aftergroups()
	{
		System.out.println("after every groups");
	}
	

}
