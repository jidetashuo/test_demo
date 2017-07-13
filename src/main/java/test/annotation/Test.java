package test.annotation;

import java.lang.reflect.Method;

/**
 * Created by wm on 2017/6/16.
 */
public class Test {
    public static void main(String[] args) throws Exception {

        // 提取到被注解的方法Method，这里用到了反射的知识
        Method method = Class.forName("test.annotation.UserAnnotaion").getDeclaredMethod("oneMethod");
        // 从Method方法中通过方法getAnnotation获得我们设置的注解
        TestAnnotation oneAnnotation = method.getAnnotation(TestAnnotation.class);

        // 得到注解的俩参数
        System.out.println(oneAnnotation.parameter1());
        System.out.println(oneAnnotation.parameter2());
    }
}
