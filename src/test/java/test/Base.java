package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

/**
 * Created by wm on 2017/6/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Init.class)
public class Base {
    @Test
    public void listtest() {
        ArrayList<String> list = new ArrayList<String>();//参数化类型
        list.add(new String("Monday"));
        list.add(new String("Tuesday"));
        list.add(new String("Wensday"));
        String s = list.set(2, "sdf");
        list.remove(0);
        for (int i = 0; i < list.size(); i++) {
            String weekday = list.get(i);//隐式类型转换，编译器自动完成
            //System.out.println(weekday.toUpperCase());
        }

        HashMap map = new HashMap();
        map.put("123", "123");
        map.put("123", "456");
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key + ":" + val);

        }
        map.remove("123");
        Iterator iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator2.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key + ":" + val);

        }

        LinkedList linklist=new LinkedList();



        Set set=new HashSet();
    }
}
