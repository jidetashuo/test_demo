package test.config;

import redis.clients.jedis.Jedis;

/**
 * @Author 王猛
 * @Date 2017/5/1 22:16
 * @Discribe:
 */
public class RedisTest {

    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");
        //查看服务是否运行
        System.out.println("Server is running: " + jedis.ping());

        //设置 redis 字符串数据
        jedis.set("runoobkey", "Redis tutorial");

        // 获取存储的数据并输出
        System.out.println("Stored string in redis:: "+ jedis.get("runoobkey"));
    }

}
