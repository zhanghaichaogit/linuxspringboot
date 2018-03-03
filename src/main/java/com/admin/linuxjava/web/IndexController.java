package com.admin.linuxjava.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhanghaichao on 2018/1/24.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    /**
     * hello
     *
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(HttpServletRequest request) {
        return "index/index";
    }
}
