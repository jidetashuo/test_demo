package test.config;

/**
 * @Author 王猛
 * @Date 2017/5/5 19:56
 * @Discribe:
 */
public class NorMalFilter extends  BaseFilter {
    @Override
    protected boolean test() {
        System.out.println("这是正常的test....");
        return true;
    }
}
