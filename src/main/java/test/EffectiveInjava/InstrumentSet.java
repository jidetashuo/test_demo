package test.EffectiveInjava;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wm on 2017/7/27.
 */
public class InstrumentSet<E> extends ForwardingSet<E> {

    private int addcount = 0;

    public InstrumentSet(Set<E> e) {
        super(e);
    }

    @Override
    public boolean add(E o) {
        addcount++;
        return super.add(o);
    }

    @Override
    public boolean addAll(Collection c) {
        addcount += c.size();
        return super.addAll(c);
    }

    public int getCount() {

        return addcount;
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        InstrumentSet<String> test = new InstrumentSet<String>(set);

        test.addAll(Arrays.asList("one", "two", "three"));

        System.out.println(test.getCount());
    }
}
