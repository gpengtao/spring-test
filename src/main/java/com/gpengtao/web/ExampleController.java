package com.gpengtao.web;

import com.gpengtao.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gpengtao on 16/1/22.
 */
@RestController
public class ExampleController {

    @Resource
    private User user;

    @RequestMapping("/")
    @ResponseBody
    public Object hello() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("hello", "world");
        return map;
    }

    @RequestMapping("/listUser")
    public Object listUser() {
        return user;
    }
}
