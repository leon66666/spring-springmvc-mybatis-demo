package zhongqiu.ehcache;

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
		final Element putGreeting = new Element(key, "Hello, World!");

		// Put the element into the data store
		testCache.put(putGreeting);

		// Retrieve the data element
		final Element getGreeting = testCache.get(key);

		// Print the value
		System.out.println(getGreeting.getObjectValue());
	}
}
