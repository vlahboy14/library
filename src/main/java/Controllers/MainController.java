package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/getAuthor")
    public String getAuthor() {

        System.out.println("YOU`VE GOT AUTHOR !!!!!!!!!");
        return "";
    }

    @RequestMapping("/")
    public String home(Model model) {
        return "home";
    }

}
