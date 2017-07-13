package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wm on 2017/6/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Init.class)
public class RedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test() {


        String value = stringRedisTemplate.opsForValue().get("k1");
        System.out.println("value:" + value);

        BoundValueOperations oops = stringRedisTemplate.boundValueOps("k1");
        System.out.println("value2:" + oops.get());
        System.out.println(stringRedisTemplate.getClientList());


    }

}
