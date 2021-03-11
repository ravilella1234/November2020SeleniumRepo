package com.crm.SalesforceCRM.utils;

import java.lang.reflect.Method;

public class ReflectDemo 
{

	public static void sampleTest()
	{
		System.out.println("iam SampleTest .....");
	}
	
	public static void sampleTest1()
	{
		System.out.println("iam SampleTest1 .....");
	}
	
	public static void sampleTest2()
	{
		System.out.println("iam SampleTest2 .....");
	}
	
	public static void main(String[] args) throws Exception, Exception 
	{
		String str = "sampleTest2";
		
		/*
		 * if(str.equals("SampleTest")) sampleTest(); else if(str.equals("sampleTest1"))
		 * sampleTest1();
		 */
		ReflectDemo api = new ReflectDemo();
		Method m = api.getClass().getMethod(str);
		m.invoke(m);
		
	}

}
