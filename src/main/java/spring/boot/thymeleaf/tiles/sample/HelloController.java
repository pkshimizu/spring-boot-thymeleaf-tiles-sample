package spring.boot.thymeleaf.tiles.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
    @RequestMapping("/")
    public String hello() {
        return "page/hello";
    }

}
