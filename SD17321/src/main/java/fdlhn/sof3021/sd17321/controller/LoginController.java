package fdlhn.sof3021.sd17321.controller;

import fdlhn.sof3021.sd17321.request.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("login")
    public String getLoginForm(){
        return "login";
    }

    @PostMapping("login")
    public String login(Account acc, Model model){
        System.out.println(acc.getEmail());
        System.out.println(acc.getPassword());
        model.addAttribute("username", acc.getEmail());
        model.addAttribute("password", acc.getPassword());
        return "login";
    }
}
