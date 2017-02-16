package zhongqiu.ehcache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

//这里注解中value=”cacheTest”与ehcache-setting.xml中的cache名称属性值一致。
public class EhcacheAnnnotation {
	// @Cacheable可以设置多个缓存，形式如：@Cacheable({"books", "isbns"})
	// @Cacheable
	//
	// 表明所修饰的方法是可以缓存的：当第一次调用这个方法时，它的结果会被缓存下来，在缓存的有效时间内，以后访问这个方法都直接返回缓存结果，不再执行方法中的代码段。
	// 这个注解可以用condition属性来设置条件，如果不满足条件，就不使用缓存能力，直接执行方法。
	// 可以使用key属性来指定key的生成规则。
	//
	// @CachePut
	//
	// 与@Cacheable不同，@CachePut不仅会缓存方法的结果，还会执行方法的代码段。
	// 它支持的属性和用法都与@Cacheable一致。
	//
	// @CacheEvict
	//
	// 与@Cacheable功能相反，@CacheEvict表明所修饰的方法是用来删除失效或无用的缓存数据。
	// 下面是@Cacheable、@CacheEvict和@CachePut基本使用方法的一个集中展示：
	/*
	 * @Cacheable({ "users" }) public User findUser(User user) { return
	 * findUserInDB(user.getId()); }
	 * 
	 * @Cacheable(value = "users", condition = "#user.getId() <= 2") public User
	 * findUserInLimit(User user) { return findUserInDB(user.getId()); }
	 * 
	 * @CachePut(value = "users", key = "#user.getId()") public void
	 * updateUser(User user) { updateUserInDB(user); }
	 * 
	 * @CacheEvict(value = "users") public void removeUser(User user) {
	 * removeUserInDB(user.getId()); }
	 * 
	 * @CacheEvict(value = "users", allEntries = true) public void clear() {
	 * removeAllInDB(); }
	 */
}
