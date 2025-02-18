import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class InvokeClass {

	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class c = DataClassLoader.loadClass("http://127.0.0.1:9090/", "RemoteData");
		Class[] parameterTypes = {String.class, String.class};
		Constructor cons = c.getConstructor(parameterTypes);
		Object[] initArgs = new Object[] {"teacher", "Seoul"};
		Object obj = cons.newInstance(initArgs);
		
		Class[] paramType = new Class[]{String.class};
		Method m = c.getDeclaredMethod("sayHello", paramType);
		m.invoke(obj, "Kate");
		//Object obj = c.newInstance();//->default constructor
		//System.out.println(obj);
	}

}
