package listners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer
{

	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) 
	{
		  IRetryAnalyzer r = arg0.getRetryAnalyzer();

		if (r == null)	
		{
			arg0.setRetryAnalyzer(Retry.class);
		}
		
	}

	
}
