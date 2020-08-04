package VolumeOne.Chapter6.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * This program demonstrates the use of proxies.
 * @author DELL
 * @version 1.8 2020Äê8ÔÂ3ÈÕ
 */
public class ProxyTest {

}

class TraceHandler implements InvocationHandler{
	private Object target;
	
	/**
	 * Constructs a TracHand
	 * @param t the implicit parameter of the method call
	 */
	public TraceHandler(Object t) {
		target = t;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// print implicit
		return null;
	}
}