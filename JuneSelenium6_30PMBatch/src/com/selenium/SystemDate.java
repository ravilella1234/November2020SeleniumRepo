package com.selenium;

import java.util.Date;

public class SystemDate 
{

	public static void main(String[] args) 
	{
		Date dt =  new Date();
		System.out.println(dt);
		String d = dt.toString().replace(':', '_').replace(' ', '_');
		System.out.println(d);
	}

}
