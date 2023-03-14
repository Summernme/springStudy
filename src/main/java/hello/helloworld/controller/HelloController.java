package hello.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
//    @GetMapping은 POST method와 동일. localhost:8080/hello 들어갈 수 있음
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello";
//        -> "hello".html로 연결되어 렌더링하라는 의미(실행시켜라)
//        return "hello"하게되면 resources의 templates 안에 있는 hello를 찾게 되고,
//        Thymeleaf 템플릿 엔진 처리를 해줌.

//        컨트롤러에서 리턴 값으로 문자를 반환하면 뷰 리졸버('viewResolver')가 화면을 찾아 처리
//        스프링 부트 템플릿엔진 기본 viewName 매핑
//        'resources:templates/'+(ViewName)+'.html'
    }
}