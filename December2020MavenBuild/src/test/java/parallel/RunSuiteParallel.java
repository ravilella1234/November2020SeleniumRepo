package parallel;

import java.util.Arrays;

import org.testng.TestNG;

public class RunSuiteParallel 
{

	public static void main(String[] args) 
	{
		/*
		 * String[] s1=new String[10]; s1[0]="ravi"; s1[1]="kanth";
		 * 
		 * String[] s2 =new String[] {"ravi","kanth"};
		 */
		
		
		TestNG  obj = new TestNG();
		obj.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//batchsuite.xml"}));
		obj.setSuiteThreadPoolSize(2);
		obj.run();
	}

}
