package test.fanxing;

/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * Created by wm on 2017/6/29.
 */
public class GeneratorImpl<T> implements GeneratorService<T> {
    @Override
    public T next() {
        return null;
    }
}
