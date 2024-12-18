package com.woori.todo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//시작페이지(메인페이지)를 작업할 컨트롤러
public class IndexController {
    @GetMapping({"/", "/index"})
    public String index() {
        return "redirect:/a";
    }
}
