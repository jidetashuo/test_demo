package test.staticfinal;

import java.util.ArrayList;

/**
 * Created by wm on 2017/7/22.
 */
public class Test {
    private final String s = "final实例变量S";

    private final int A = 0;
    public final int B = 1;
    private static final int C = 80;
    public static final int D = 90;

    private static final ArrayList<String> alStaticFinalVar = new ArrayList<String>();

    //final空白,必须在初始化对象的时候赋初值
    public final int E;

    public Test(int x) {
        this.E = x;
    }

    private void test1() {
        System.out.println(new Test(1).A);
        System.out.println(Test.C);
        System.out.println(Test.D);
    }

    public void test2() {
        final int a;     //final空白,在需要的时候才赋值
        final int b = 4;    //局部常量--final用于局部变量的情形
        final int c;    //final空白,一直没有给赋值.
        a = 3;
        //a=4;    出错,已经给赋过值了.
        //b=2; 出错,已经给赋过值了.
    }

    public static void main(String[] args) {
        Test t = new Test(2);
//        t.A = 101;    //出错,final变量的值一旦给定就无法改变
//        t.B=91; //出错,final变量的值一旦给定就无法改变
//        t.C=81; //出错,final变量的值一旦给定就无法改变
//        t.D=71; //出错,final变量的值一旦给定就无法改变


        System.out.println(t.A);
        System.out.println(t.B);
        System.out.println(t.C); //不推荐用对象方式访问静态字段
        System.out.println(t.D); //不推荐用对象方式访问静态字段
        System.out.println(Test.C);
        System.out.println(Test.D);
//        System.out.println(Test.E); //出错,因为E为final空白,依据不同对象值有所不同.
        System.out.println(t.E);


        Test t1 = new Test(3);
        System.out.println(t1.E); //final空白变量E依据对象的不同而不同

        alStaticFinalVar.add("a");


        ArrayList<String> list = new ArrayList<String>();
//        alStaticFinalVar=list;
        //final 修饰的容器可以不可以修改其本身但是可以修改容器的内容
        System.out.println(alStaticFinalVar);


    }
}
