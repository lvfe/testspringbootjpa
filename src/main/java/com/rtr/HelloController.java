package com.rtr;
/**
 * RestController (equal to @Controller @RequestBody)
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by lenovo on 21/11/2019.
 */
@RestController
public class HelloController {
    /**
     * @RequestMapping, to map
     * 8080/hello
     * @return
     */
    @RequestMapping("/hello")
    public String getHello() {
        return "hello1";
    }
    @RequestMapping("/people")
    public people getpeople() {
        return new people("wang",new Date());
    }
}
