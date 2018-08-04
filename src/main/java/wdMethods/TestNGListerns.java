package wdMethods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestNGListerns implements IAnnotationTransformer ,IRetryAnalyzer {
	int isMaxTry=1;
	@Override

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstrcutor, Method testMethod) {
		annotation.setRetryAnalyzer(this.getClass());
		annotation.setInvocationCount(1);
		/*if(!testMethod.getName().equalsIgnoreCase("createLeadSeMethod")){
			annotation.setEnabled(false);
		}*/

	}

	@Override
	public boolean retry(ITestResult result) {

		if(!result.isSuccess() && isMaxTry <2){
			isMaxTry++;
			return true;
		}
		else {
			return false;
		}

	}

}
