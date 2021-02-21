package laustinator.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    @ResponseBody
    @GetMapping("/")
    public String index(){
        return "Hello Claus, it's working!";
    }
}
