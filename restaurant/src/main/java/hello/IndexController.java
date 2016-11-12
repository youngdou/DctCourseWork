package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by young on 16-11-2.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String IndexPage(Model model) {
        model.addAttribute("title", "首页");
        return "index";
    }
    @GetMapping("/index")
    public String IndexPage2(Model model) {
        model.addAttribute("title", "首页");
        return "index";
    }
}
