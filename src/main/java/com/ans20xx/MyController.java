package com.ans20xx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // 1
public class MyController {

    @RequestMapping("/hello")  // 2
    public String hello() {
        return "index";  // 3
    }

}
