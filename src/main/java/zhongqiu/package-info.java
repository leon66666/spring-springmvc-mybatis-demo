/**
 * 
 */
/**
 * @author zhongqiu
一、springmvc原理，执行顺序。
接受请求-->拦截器，处理编码等问题-->DispatcherServlet(中央处理器)-->处理器映射器-->处理器适配器-->处理器处理请求，返回数据-->视图解析器-->返回视图-->用户
二、两种实现方式，配置和注解
三、视图解析器的配置
四、多视图返回：json和xml格式视图
五、处理器开发：
1) @Controller, @RequestMapping
        1）返回页面
        2）接受参数（int，string，数组，封装User对象，集合类型，@RequestParam注解）
        3）页面回显
        4）restful风格，@PathVariable注解
        5）转发和重定向
        6）对json的支持：@responseBody和@RequestBody
六、自定义注解，元注解。@interface Annotation{}
@Override，@Deprecated，@SuppressWarnings，@Retention，@Target，@Documented,@Inherited
七、拦截器.implements HandlerInterceptor.preHandle,postHandle,afterCompletion
**************************************************************************************
一、	配置：spring.xml；springmvc.xml；mybatis.xml
二、	跨服务器上传文件jersey。上传图片，图片里面回显。Ajax。页面不刷新图片回显。
三、	Oscache页面缓存，ssm整合os
四、	对Freemarker的支持
 */
package zhongqiu;

import org.springframework.web.servlet.HandlerInterceptor;
