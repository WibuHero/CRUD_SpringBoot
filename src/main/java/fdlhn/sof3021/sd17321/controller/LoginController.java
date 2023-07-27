package fdlhn.sof3021.sd17321.controller;

import fdlhn.sof3021.sd17321.request.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class LoginController {
    @Autowired
    private Account acc;
    private ArrayList<Account> ds;

    public LoginController() {
        this.ds = new ArrayList<>();
        this.ds.add(new Account("user1", "123", false));
        this.ds.add(new Account("user2", "456", false));
    }

    @GetMapping("login")
    public String getLoginForm(){
        return "login";
    }

}
