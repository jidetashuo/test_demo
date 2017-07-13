package test.config;

/**
 * @Author 王猛
 * @Date 2017/4/28 14:31
 * @Discribe:
 */

public  class LogoutFilter extends BaseFilter {

        @Override
        protected boolean test() {
            System.out.println("这是退出test....");
            return false;
        }
}
