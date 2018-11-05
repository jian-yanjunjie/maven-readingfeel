package org.lanqiao.yhxxgl.rediscatch;

import org.apache.ibatis.io.ResolverUtil;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import sun.applet.Main;
@Service
public class TestConnRedis {
    public String test(){
        Jedis jedis = new Jedis("localhost");
        jedis.set("foo", "bar");
        String value = jedis.get("foo");
        System.out.println(value);
        return value;
    }
}
