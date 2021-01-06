package dataDriven;

public class DataDriven 
{

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI e1 = new ExcelAPI("C:\\Users\\DELL\\Desktop\\testdatanew.xlsx");
		
		int rCount = e1.getRowCount("login");
		System.out.println(rCount);
		
		int cCount = e1.columnCount("login");
		System.out.println(cCount);
		
		System.out.println(e1.getCellData("login", 1, 3));
		System.out.println(e1.getCellData("login", "Password", 4));
		
		e1.setCellData("login", 4, 4, "Aborted");

	}

}
