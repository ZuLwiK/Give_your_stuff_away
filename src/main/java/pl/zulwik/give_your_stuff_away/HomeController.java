package pl.zulwik.give_your_stuff_away;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {


    @RequestMapping("/")
    public String homeAction(Model model){
        return "index";
    }
}
