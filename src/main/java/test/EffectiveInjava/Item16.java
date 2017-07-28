package test.EffectiveInjava;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * 复合优先于集成
 * Created by wm on 2017/7/26.
 */
public class Item16<E> extends HashSet<E> {

    private int addount = 0;

    private Item16() {


    }

    @Override
    public boolean add(E e) {
        System.out.println("add...");
        addount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        System.out.println("addall...");
        addount += c.size();
        return super.addAll(c);
    }

    public int getCount() {

        return addount;
    }

    public static void main(String[] args) {
        Item16<String> test = new Item16<String>();

        test.addAll(Arrays.asList("one", "two", "three"));

        System.out.println(test.getCount());
    }
}
