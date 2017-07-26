package test.enumtest;

/**
 * Created by wm on 2017/7/26.
 */
public enum Test2 {

    PLUS

            {
                double apply(double x, double y) {
                    return x + y;
                }
            },
    MINUS {
        double apply(double x, double y) {
            return x - y;
        }
    };

    abstract double apply(double x, double y);


    public static void main(String[] args) {
        System.out.println(Test2.PLUS.apply(1, 2));
    }
}
