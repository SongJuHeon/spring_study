package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") // '/hello 접근 시 아래 메소드 호출
    // mvc패턴의 그 모델
    public String hello(Model model) {
        model.addAttribute("data", "hello");
        return "hello"; //view Resolver: 위의 모델을 templates에 있는 hello.html파일에 넘겨 렌더링을 해라.
    }
}
