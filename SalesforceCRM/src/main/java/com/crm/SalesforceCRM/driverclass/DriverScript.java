package com.crm.SalesforceCRM.driverclass;

import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Properties;

import com.crm.SalesforceCRM.keywords.ApplicationKeywords;
import com.crm.SalesforceCRM.utils.Constants;
import com.crm.SalesforceCRM.utils.ExcelAPI;

public class DriverScript 
{
	public static  Properties orProp;
	ApplicationKeywords app;
	
	
	public  Properties getOrProp() {
		return orProp;
	}

	public  void setOrProp(Properties orProp) {
		DriverScript.orProp = orProp;
	}
	
	public void quit()
	{
		if(app!=null)
			app.quit();
	}

	public void executeKeywords(ExcelAPI xls,String testName,Hashtable<String, String> td) throws Exception, Exception
	{
		int rows = xls.getRowCount(Constants.KEYWORDS_SHEET);
		System.out.println("Rows :" + rows);
		
		app = new ApplicationKeywords();
		app.setOrProp(orProp);
		app.setTd(td);
		
		
		for(int rNum=1;rNum<rows;rNum++)
		{
			String tcid = xls.getCellData(Constants.KEYWORDS_SHEET, Constants.TCID_COL, rNum);
			if(tcid.equals(testName))
			{
				String kWord = xls.getCellData(Constants.KEYWORDS_SHEET, Constants.KEYWORD_COL, rNum);
				String objectKey = xls.getCellData(Constants.KEYWORDS_SHEET, Constants.OBJECT_COL, rNum);
				String dataKey = xls.getCellData(Constants.KEYWORDS_SHEET, Constants.TESTDATA_COL, rNum);
				String tData = td.get(dataKey);
				
				//System.out.println(tcid + "----"+ kWord + "----" + orProp.getProperty(objectKey) + "----" + tData);
				
				app.setObjectKey(objectKey);
				app.setDataKey(dataKey);
				
				/*
				 * if(kWord.equals("openBrowser")) app.openBrowser(); else
				 * if(kWord.equals("navigateUrl")) app.navigateUrl(); else
				 * if(kWord.equals("clickElement")) app.clickElement(); else
				 * if(kWord.equals("typeText")) app.typeText(); else
				 * if(kWord.equals("validateLogin")) app.validateLogin(); else
				 * if(kWord.equals("verifyTitle")) app.verifyTitle();
				 */
				
				//Reflections
				Method m;
				m = app.getClass().getMethod(kWord);
				m.invoke(app);
				
			}
			
		}
		
	}

		

}
