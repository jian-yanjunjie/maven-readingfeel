package org.lanqiao.yhxxgl.control;

import org.lanqiao.yhxxgl.rediscatch.TestConnRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RController {
   @Autowired
    TestConnRedis testConnRedis;

    public String getRedistest(){
        return testConnRedis.test();
    }
}
