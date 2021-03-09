package com.crm.SalesforceCRM.utils;

import java.util.Hashtable;

public class DataUtils 
{
	public static Object[][] getTestData(ExcelAPI e,String sheetName, String testCaseName)
	{
				
		int testStartRowNum=0;
		while(!e.getCellData(sheetName, 0, testStartRowNum).equals(testCaseName))
		{
			testStartRowNum++;
		}
		System.out.println(testCaseName + "  starts from row :- "+ testStartRowNum);
		
		
		int colStartRowNum = testStartRowNum+1;
		int dataStartRowNum = testStartRowNum+2; 
		
		//calculate rows of data
		int rows=0;
		while(!e.getCellData(sheetName, 0, dataStartRowNum+rows).equals(""))
		{
			rows++;
		}
		System.out.println("Total rows are :-" + rows);
		
		
		//calculate the total columns
		int cols=0;
		while(!e.getCellData(sheetName, cols, colStartRowNum).equals(""))
		{
			cols++;
		}
		System.out.println("Total Cols are : "+ cols);
		
		
		//read the testcase data
		int dataRow=0;
		Hashtable<String, String> table = null;
		Object[][] data = new Object[rows][1];
		for(int rNum = dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			table = new Hashtable<String, String>();
			for(int cNum =0;cNum<cols;cNum++)
			{
				//System.out.println(e.getCellData(sheetName, cNum, rNum));
				//data[dataRow][cNum]=e.getCellData(sheetName, cNum, rNum);
				String key = e.getCellData(sheetName, cNum, colStartRowNum);
				String value = e.getCellData(sheetName, cNum, rNum);
				table.put(key, value);
			}
			data[dataRow][0]=table;
			dataRow++;
		}
	return data;
		
	}

}
