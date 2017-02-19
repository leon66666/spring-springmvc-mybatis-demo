package zhongqiu.ehcache;

import java.util.ArrayList;
import java.util.List;

import net.sf.ehcache.*;

//参考：http://www.cnblogs.com/jingmoxukong/p/5975994.html
public class EhcacheDemo {
	public static void ehcacheDemo() {
		// Create a cache manager
		final CacheManager cacheManager = new CacheManager();

		// create the cache called "helloworld"
		final Cache testCache = cacheManager.getCache("test");

		// create a key to map the data to
		final String key = "greeting";

		// Create a data element
		Element putGreeting = new Element(key, "Hello, World!");

		// Put the element into the data store
		testCache.put(putGreeting);

		// Retrieve the data element
		Element getGreeting = testCache.get(key);

		// Print the value
		System.out.println(getGreeting.getObjectValue());

		// 集合
		String listKey = "list";
		ArrayList<String> aList = new ArrayList<>();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		putGreeting = new Element(listKey, aList);
		testCache.put(putGreeting);
		getGreeting = testCache.get(listKey);
		aList = (ArrayList<String>) getGreeting.getObjectValue();
		for (String string : aList) {
			System.out.println(string);
		}
	}
}
