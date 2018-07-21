package PracticeCodes;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		Class<?> c = Class.forName("test.sagar.sample.sampleCodes.Animal");
		Method method = c.getDeclaredMethod("eating", null);
		Object c1= c.newInstance();
		method.invoke(c1, null);
		
		//check this
		Class<?> c2 = Class.forName("test.sagar.sample.sampleCodes.Dogs");
		Method method1 = c2.getDeclaredMethod("barking", String.class);
		Object c2a= c2.newInstance();
		method.invoke(c2a, "BhawBhaw");
		
		

	}

}