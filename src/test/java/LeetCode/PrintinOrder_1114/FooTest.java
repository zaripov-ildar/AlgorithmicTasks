package LeetCode.PrintinOrder_1114;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    

    @Test
    void test() throws Exception {	
	for (int i = 0; i < 100; i++) {	  	    
	    Foo foo = new Foo();
	    StringBuilder sb = new StringBuilder();
	    List<Runnable> list = getMethodCalls(foo, sb);
	    Collections.shuffle(list);
	    List<Thread> threads = new ArrayList<>();
	    for (Runnable runnable : list) {
		Thread thread = new Thread(runnable);
		threads.add(thread);
		thread.start();
	    }
	    for (Thread thread : threads) {
		thread.join();
	    }
	    assertEquals("firstsecondthird", sb.toString());
	    sb.setLength(0);
	}
    }

    private List<Runnable> getMethodCalls(Foo foo, StringBuilder sb) {
	Method[] methods = foo.getClass().getDeclaredMethods();
	List<Runnable> list = new ArrayList<>();	
	
	for (Method method : methods) {
	    String nameString = method.getName();
	    Runnable r = () -> sb.append(nameString);
	    list.add(() -> {
		try {
		    method.invoke(foo, r);
		} catch (IllegalAccessException | InvocationTargetException e) {
		    e.printStackTrace();
		}
	    });
	}
	return list;
    }
}