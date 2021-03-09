package com.crm.SalesforceCRM.driverclass;

import java.util.Hashtable;

import com.crm.SalesforceCRM.utils.ExcelAPI;

public class DriverScript 
{
	
	public void executeKeywords(ExcelAPI xls,String testName,Hashtable<String, String> td)
	{
		int rows = xls.getRowCount("Keywords");
		System.out.println("Rows :" + rows);
		for(int rNum=1;rNum<rows;rNum++)
		{
			String tcid = xls.getCellData("Keywords", "TCID", rNum);
			if(tcid.equals(testName))
			{
				String kWord = xls.getCellData("Keywords", "Keyword", rNum);
				String objectKey = xls.getCellData("Keywords", "Object", rNum);
				String dataKey = xls.getCellData("Keywords", "TestData", rNum);
				
				System.out.println(tcid + "----"+ kWord + "----" + objectKey + "----" + dataKey);
			}
			
		}
		
	}

}
