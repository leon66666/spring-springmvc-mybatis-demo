package zhongqiu.interceptor;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {
    /**
     * 权限类型
     * @return
     */
    String type() default "";
    /**
     * 是否需要写权限
     * @return
     */
    boolean write() default false;
}
