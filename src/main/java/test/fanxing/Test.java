package test.fanxing;

/**
 * Created by wm on 2017/6/29.
 */
public class Test {

    public static void main(String[] args) {
        //泛型类测试

        //泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
//传入的实参类型需与泛型的类型参数类型相同，即为Integer.
        Generic<Integer> genericInteger = new Generic<Integer>(123456);

//传入的实参类型需与泛型的类型参数类型相同，即为String.
        Generic<String> genericString = new Generic<String>("key_vlaue");

        System.out.println(genericInteger.getKey());
        System.out.println(genericString.getKey());


        //泛型通配符
        Generic<Integer> gInteger = new Generic<Integer>(123);
        Generic<Number> gNumber = new Generic<Number>(456);

        Test.showKeyValue1(gInteger);






    }

    /**
     *  //泛型通配符
     *
     *  此处’？’是类型实参，而不是类型形参 。重要说三遍！此处’？’是类型实参，而不是类型形参 ！ 此处’？’是类型实参，而不是类型形参
     * @param obj
     */
    public static  void showKeyValue1(Generic<?> obj) {
        System.out.println(obj.getKey());
    }


}
