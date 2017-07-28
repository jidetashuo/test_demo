package test.EffectiveInjava;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wm on 2017/7/27.
 */
public class InstrumentSet2<E> {

    private final Set<E> s;

    private int addcount = 0;

    public InstrumentSet2(Set<E> s) {
        this.s = s;
    }


    public boolean add(E o) {
        addcount++;
        return s.add(o);
    }


    public boolean addAll(Collection c) {
        addcount += c.size();
        return s.addAll(c);
    }

    public int getCount() {

        return addcount;
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        InstrumentSet2<String> test = new InstrumentSet2<String>(set);

        test.addAll(Arrays.asList("one", "two", "three"));

        System.out.println(test.getCount());
    }
}
