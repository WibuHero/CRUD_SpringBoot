package fdlhn.sof3021.sd17321.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
//    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @GetMapping("hello")// đường dẫn
    public String sayHello(Model model){
        String name = "OK";
        model.addAttribute("name", name);
        return "hello"; //tên file
    }

}
