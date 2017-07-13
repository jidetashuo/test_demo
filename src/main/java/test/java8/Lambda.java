package test.java8;

/**
 * Created by wm on 2017/6/12.
 */
public class Lambda {
    public static void main(String[] args) {

        //没有参数
        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();

    }
}
