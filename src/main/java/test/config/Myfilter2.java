package test.config;

/**
 * @Author 王猛
 * @Date 2017/4/28 14:31
 * @Discribe:
 */

public  class Myfilter2 extends BaseFilter {

    @Override
    protected boolean test() {
        System.out.println("这是子类22test....");
        return true;
    }
}
